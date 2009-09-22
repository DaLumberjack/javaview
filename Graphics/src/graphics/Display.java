package graphics;

import java.awt.Color;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;


public class Display extends GLCanvas implements GLEventListener {
	
	private static final long serialVersionUID = 2908684880862104485L;
	
	
	private Camera2D camera;
	
	private Color clearColor;
	
	
	public Display(Camera2D camera) {
		this.camera = camera;
		clearColor = Color.white;
		
		addGLEventListener(this);
	}
	
	
	public void init(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glClearColor(clearColor.getRed(), clearColor.getGreen(), clearColor.getBlue(), 255);
		
		camera.init(drawable);
	}
	public void display(GLAutoDrawable drawable) {
		GL gl = drawable.getGL();
		
		gl.glClear(GL.GL_COLOR_BUFFER_BIT);
		
		camera.display(drawable);
	}
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
		GL gl = drawable.getGL();
		
		gl.glViewport(0, 0, getWidth(), getHeight());
		
		camera.reshape(drawable, x, y, width, height);
	}
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
		camera.displayChanged(drawable, modeChanged, deviceChanged);
	}
	
}