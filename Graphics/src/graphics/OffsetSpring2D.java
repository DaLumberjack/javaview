package graphics;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

import math.DoublePoint2;
import math.DoubleVector2;


public class OffsetSpring2D extends Spring2D {
	
	protected double offset;
	
	
	public OffsetSpring2D(DoublePoint2 position1, DoublePoint2 position2, double width, int vertices, double offset) {
		super(position1, position2, width, vertices);
		
		this.offset = offset;
	}
	
	
	public void init(GLAutoDrawable drawable) {
		super.init(drawable);
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
			
			gl.glColor3i(color.getRed(), color.getGreen(), color.getGreen());
			
			gl.glBegin(GL.GL_LINES);
				gl.glVertex2d(0d, 0d);
				gl.glVertex2d(offset, 0d);
				
				gl.glVertex2d(lenght - offset, 0d);
				gl.glVertex2d(lenght, 0d);
			gl.glEnd();
			
			gl.glTranslated(lenght / 2, 0d, 0d);
			gl.glScaled(lenght - 2 * offset, width, 1d);
			
			gl.glCallList(displayList);
		gl.glPopMatrix();
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		super.reshape(drawable, x, y, width, height);
	}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
		super.displayChanged(drawable, modeChanged, deviceChanged);
	}
	
}