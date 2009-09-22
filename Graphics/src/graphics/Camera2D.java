package graphics;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;

import math.DoublePoint2;


public class Camera2D implements GLEventListener {
	
	private Scene2D scene;
	
	private DoublePoint2 position;
	private double angle;
	
	
	public Camera2D(Scene2D scene) {
		this.scene = scene;
		
		position = new DoublePoint2();
	}
	
	
	public void init(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glDisable(GL.GL_DEPTH_TEST);
		
		scene.init(drawable);
	}
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glMatrixMode(GL.GL_MODELVIEW);
		gl.glLoadIdentity();
		gl.glTranslated(position.x, position.y, 0);
		gl.glRotated(angle, 0d, 0d, 1d);
		
		scene.display(drawable);
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		GL gl = drawable.getGL();
		
		gl.glMatrixMode(GL.GL_PROJECTION);
		gl.glLoadIdentity();
		gl.glOrtho(-width/2d, width/2d, -height/2d, height/2d, 0d, 100d);
		
		scene.reshape(drawable, x, y, width, height);
	}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
		scene.displayChanged(drawable, modeChanged, deviceChanged);
	}
	
}