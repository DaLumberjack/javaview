package graphics;

import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public interface Drawable2D extends GLEventListener {
	
	public int getPlane();
	
	public void init(GLAutoDrawable drawable);
	public void display(GLAutoDrawable drawable);
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height);
	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged);
	
}