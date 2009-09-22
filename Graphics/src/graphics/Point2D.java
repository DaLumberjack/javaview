package graphics;

import java.awt.Color;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import math.DoublePoint2;


public class Point2D implements Drawable2D {
	
	protected DoublePoint2 position;
	
	protected Color color;
	
	
	public Point2D(DoublePoint2 position) {
		this.position = position;
		
		color = Color.BLACK;
	}
	
	
	public void setPosition(DoublePoint2 position) {
		this.position = position;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	public DoublePoint2 getPosition() {
		return position;
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
		
		// TODO ändern
		gl.glBlendFunc(GL.GL_SRC_ALPHA, GL.GL_ONE_MINUS_SRC_ALPHA);
		gl.glEnable(GL.GL_BLEND);
		gl.glEnable(GL.GL_LINE_SMOOTH);
		gl.glEnable(GL.GL_POINT_SMOOTH);
		gl.glPointSize(5);
		
		gl.glMatrixMode(GL.GL_MODELVIEW);
		
		gl.glPushMatrix();
			gl.glColor3i(color.getRed(), color.getGreen(), color.getGreen());
			
			gl.glBegin(GL.GL_POINTS);
				gl.glVertex2d(position.x, position.y);
			gl.glEnd();
		gl.glPopMatrix();
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {}
	
}