package graphics;

import java.awt.Color;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import math.DoublePoint2;


public class Line2D implements Drawable2D {
	
	protected DoublePoint2 position1;
	protected DoublePoint2 position2;
	
	protected Color color;
	
	
	public Line2D(DoublePoint2 position1, DoublePoint2 position2) {
		this.position1 = position1;
		this.position2 = position2;
		
		color = Color.BLACK;
	}
	
	
	public void setPosition1(DoublePoint2 position1) {
		this.position1 = position1;
	}
	public void setPosition2(DoublePoint2 position2) {
		this.position2 = position2;
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
	public Color getColor() {
		return color;
	}
	public int getPlane() {
		return 0;
	}
	
	
	public void init(GLAutoDrawable drawable) {}
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glMatrixMode(GL.GL_MODELVIEW);
		
		gl.glPushMatrix();
			gl.glColor3i(color.getRed(), color.getGreen(), color.getGreen());
			
			gl.glBegin(GL.GL_LINES);
				gl.glVertex2d(position1.x, position1.y);
				gl.glVertex2d(position2.x, position2.y);
			gl.glEnd();
		gl.glPopMatrix();
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
	
}