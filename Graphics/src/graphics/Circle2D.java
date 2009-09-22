package graphics;

import java.awt.Color;
import java.util.HashMap;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import math.DoublePoint2;


public class Circle2D implements Drawable2D {
	
	private static final HashMap<Integer, Integer> displayLists = new HashMap<Integer, Integer>();
	
	protected DoublePoint2 position;
	protected double radius;
	
	protected final int vertices;
	protected Color color;
	protected int displayList;
	
	
	public Circle2D(DoublePoint2 position, double radius, int vertices) {
		this.position = position;
		this.radius = radius;
		
		this.vertices = vertices;
		
		color = Color.BLACK;
	}
	
	
	public DoublePoint2 getPosition() {
		return position;
	}
	public double getRadius() {
		return radius;
	}
	public Color getColor() {
		return color;
	}
	public int getPlane() {
		return 0;
	}
	
	public void setPosition(DoublePoint2 position) {
		this.position = position;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(Color color) {
		this.color = color;
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
					double sequence = (2 * Math.PI) / vertices;
					for (int i = 1; i <= vertices + 1; i ++) {
						gl.glVertex2d(Math.cos(i * sequence), Math.sin(i * sequence));
					}
				gl.glEnd();
			gl.glEndList();
		}
	}
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glMatrixMode(GL.GL_MODELVIEW);
		
		gl.glPushMatrix();
			gl.glTranslated(position.x, position.y, 0d);
			gl.glScaled(radius, radius, 1d);
			
			gl.glColor3i(color.getRed(), color.getGreen(), color.getGreen());
			
			gl.glCallList(displayList);
		gl.glPopMatrix();
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
	
}