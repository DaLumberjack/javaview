package test;

import graphics.Camera2D;
import graphics.Circle2D;
import graphics.Display;
import graphics.OffsetSpring2D;
import graphics.Scene2D;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import math.DoublePoint2;
import math.DoubleVector2;

import com.sun.opengl.util.Animator;


public class GraphicsTest extends JFrame {
	
	private static final long serialVersionUID = -4196781443943967588L;
	
	
	private final Display display;
	private final Camera2D camera;
	private final Scene2D scene;
	private final OffsetSpring2D spring;
	private final Circle2D circle;
	
	
	public GraphicsTest() {
		super("Test");
		setLayout(new BorderLayout());
		
		scene = new Scene2D();
		camera = new Camera2D(scene);
		display = new Display(camera);
		
		spring = new OffsetSpring2D(new DoublePoint2(0, 200), new DoublePoint2(0, -200), 20, 50, 10);
		scene.add(spring);
		circle = new Circle2D(new DoublePoint2(0, 0), 200, 1000);
		scene.add(circle);
		
		add(display);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		GraphicsTest frame = new GraphicsTest();
		
		Animator animator = new Animator(frame.display);
		animator.start();
		
		DoubleVector2 lenght = new DoubleVector2(0d, -300);
		double counter = 0;
		
		while (true) {
			DoubleVector2 delta = new DoubleVector2(0d, 100 * Math.sin((counter += 1) * (Math.PI / 180d)));
			
			frame.spring.setPosition2(frame.spring.getPosition1().add(lenght.add(delta)));
			
			Thread.sleep(10);
		}
	}
	
}