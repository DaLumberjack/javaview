package test;

import java.awt.BorderLayout;

import graphics.Camera2D;
import graphics.Display;
import graphics.Line2D;
import graphics.Point2D;
import graphics.Scene2D;

import javax.swing.JFrame;

import com.sun.opengl.util.Animator;

import math.DoublePoint2;
import math.DoubleVector2;

import physics.collision.CollisionEvent;
import physics.collision.CollisionListener;
import physics.collision.Line;
import physics.collision.Line2Line;
import physics.collision.Line2Point;
import physics.collision.Point;


public class CollisionTest extends JFrame {
	
	private static final long serialVersionUID = 2106346176923488403L;
	
	private final Display display;
	private final Camera2D camera;
	private final Scene2D scene;
	
	private final Point2D point2D1;
	private final Point2D point2D2;
	private final Line2D line2D1;
	private final Line2D line2D2;
	
	private final Point point1;
	private final Line line1;
	private final Line line2;
	private Line2Line lineCollision;
	private Line2Point pointCollision;
	
	
	public CollisionTest() {
		super("Test");
		setLayout(new BorderLayout());
		
		scene = new Scene2D();
		camera = new Camera2D(scene);
		display = new Display(camera);
		
		point2D1 = new Point2D(new DoublePoint2());
		point2D2 = new Point2D(new DoublePoint2());
		line2D1 = new Line2D(new DoublePoint2(-100, 50), new DoublePoint2(50, -100));
		line2D2 = new Line2D(new DoublePoint2(-50, -100), new DoublePoint2(100, 50));
		
		scene.add(point2D1);
		scene.add(point2D2);
		scene.add(line2D1);
		scene.add(line2D2);
		
		point1 = new Point(new DoublePoint2());
		line1 = new Line(new DoublePoint2(-100, 50), new DoublePoint2(50, -100));
		line2 = new Line(new DoublePoint2(-50, -100), new DoublePoint2(100, 50));
		lineCollision = new Line2Line(line1, line2);
		lineCollision.addColisionListener(new CollisionListener() {
			public void collisionDetected(CollisionEvent event) {
				//System.out.println("line-line collision @" + event.getPoints().get(0));
				
				point2D1.setPosition(event.getPoints().get(0));
			}
		});
		pointCollision = new Line2Point(line1, point1);
		pointCollision.addColisionListener(new CollisionListener() {
			public void collisionDetected(CollisionEvent event) {
				System.out.println("line-point collision @" + event.getPoints().get(0));
			}
		});
		
		add(display);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		CollisionTest frame = new CollisionTest();
		
		Animator animator = new Animator(frame.display);
		animator.start();
		
		while (true) {
			DoublePoint2 mouse = new DoublePoint2(frame.getMousePosition().x, -frame.getMousePosition().y);
			mouse = mouse.add(new DoubleVector2(-250, 250));
			frame.line1.setPosition1(mouse);
			frame.line2D1.setPosition1(mouse);
			
			frame.lineCollision.update();
			frame.pointCollision.update();
			
			Thread.sleep(10);
		}
	}
	
}