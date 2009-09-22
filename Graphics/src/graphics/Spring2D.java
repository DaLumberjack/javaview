package graphics;

import java.awt.Color;
import java.util.HashMap;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import math.DoublePoint2;
import math.DoubleVector2;


public class Spring2D implements Drawable2D {
	
	private static final HashMap<Integer, Integer> displayLists = new HashMap<Integer, Integer>();
	protected static final double RAD2DEG = 180d / Math.PI;
	
	protected DoublePoint2 position1;
	protected DoublePoint2 position2;
	protected double width;
	
	protected int vertices;
	protected Color color;
	protected int displayList;
	
	
	public Spring2D(DoublePoint2 position1, DoublePoint2 position2, double width, int vertices) {
		this.position1 = position1;
		this.position2 = position2;
		this.width = width;
		
		this.vertices = vertices;
		color = Color.BLACK;
	}
	
	
	public void setPosition1(DoublePoint2 position1) {
		this.position1 = position1;
	}
	public void setPosition2(DoublePoint2 position2) {
		this.position2 = position2;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public DoublePoint2 getPosition1() {
		return position1;
	}
	public DoublePoint2 getPosition2() {
		return position2;
	}
	public double getWidth() {
		return width;
	}
	public int getPlane() {
		return 0;
	}
	public Color getColor() {
		return color;
	}
	
	
	public void init(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		if (displayLists.containsKey(vertices)) {
			displayList = displayLists.get(vertices);
		} else {
			displayList = gl.glGenLists(1);
			displayLists.put(vertices, displayList);
			
			gl.glNewList(displayList, GL.GL_COMPILE);
				gl.glBegin(GL.GL_LINE_STRIP);
					gl.glVertex2d(-0.5d, 0d);
					
					double sequence = 1d / (vertices + 1);
					for (int vertex = 1; vertex <= vertices; vertex++) {
						gl.glVertex2d(sequence * vertex - 0.5d, ((vertex & 1) << 1) - 1);
					}
					
					gl.glVertex2d(0.5d, 0d);
				gl.glEnd();
			gl.glEndList();
		}
	}
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glMatrixMode(GL.GL_MODELVIEW);
		
		DoubleVector2 distance = new DoubleVector2(position1, position2);
		double lenght = distance.norm();
		double angle = Math.acos(distance.x / lenght) * RAD2DEG;
		if (distance.y < 0) angle = -angle;
		
		gl.glPushMatrix();
			gl.glTranslated(position1.x, position1.y, 0d);
			gl.glRotated(angle, 0d, 0d, 1d);
			gl.glTranslated(lenght / 2, 0d, 0d);
			gl.glScaled(lenght, width, 1d);
			
			gl.glColor3i(color.getRed(), color.getGreen(), color.getGreen());
			
			gl.glCallList(displayList);
		gl.glPopMatrix();
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
	
}