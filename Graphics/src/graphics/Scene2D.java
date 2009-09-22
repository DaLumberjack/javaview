package graphics;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public class Scene2D implements GLEventListener {
	
	private LinkedList<Drawable2D> drawables;
	
	
	public Scene2D() {
		drawables = new LinkedList<Drawable2D>();
	}
	
	
	public String toString() {
		return drawables.toString();
	}
	
	
	private static Comparator<Drawable2D> drawableComparator = new Comparator<Drawable2D>() {
		public int compare(Drawable2D drawable1, Drawable2D drawable2) {
			return drawable2.getPlane() - drawable1.getPlane();
		}
	};
	public void add(Drawable2D drawable) {
		drawables.add(drawable);
		
		Collections.sort(drawables, drawableComparator);
	}
	public boolean remove(Drawable2D drawable) {
		boolean result = drawables.remove(drawable);
		
		Collections.sort(drawables, drawableComparator);
		
		return result;
	}
	
	
	public void init(GLAutoDrawable autoDrawable) {
		for (Drawable2D drawable : drawables) {
			drawable.init(autoDrawable);
		}
	}
	public void display(GLAutoDrawable autoDrawable) {
		for (Drawable2D drawable : drawables) {
			drawable.display(autoDrawable);
		}
	}
	public void reshape(GLAutoDrawable autoDrawable, int x, int y, int width, int height) {
		for (Drawable2D drawable : drawables) {
			drawable.reshape(autoDrawable, x, y, width, height);
		}
	}
	public void displayChanged(GLAutoDrawable autoDrawable, boolean modeChanged, boolean deviceChanged) {
		for (Drawable2D drawable : drawables) {
			drawable.displayChanged(autoDrawable, modeChanged, deviceChanged);
		}
	}
	
}