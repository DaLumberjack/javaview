package test;

import java.awt.BorderLayout;

import graphics.Camera2D;
import graphics.Circle2D;
import graphics.Display;
import graphics.Line2D;
import graphics.Point2D;
import graphics.Scene2D;

import javax.swing.JFrame;

import com.sun.opengl.util.Animator;

import math.DoublePoint2;
import math.DoubleVector2;

import physics.Positionable;
import physics.collision.Circle;
import physics.collision.Circle2Line;
import physics.collision.CollisionEvent;
import physics.collision.CollisionListener;
import physics.collision.Line;


public class CollisionTest extends JFrame {
	
	private static final long serialVersionUID = 2106346176923488403L;
	
	private final Display display;
	private final Camera2D camera;
	private final Scene2D scene;
	
	private final Point2D point2D1;
	private final Point2D point2D2;
	private final Line2D line2D;
	private final Circle2D circle2D;
	
	private final Line line;
	private final Circle circle;
	private Circle2Line circleCollision;
	
	private final Positionable mousePosition = new Positionable() {
		public DoublePoint2 getPosition() {
			DoublePoint2 mouse = new DoublePoint2(getMousePosition().x, -getMousePosition().y);
			mouse = mouse.add(new DoubleVector2(-250, 250));
			
			return mouse;
		}
	};
	
	
	public CollisionTest() {
		super("Test");
		setLayout(new BorderLayout());
		
		scene = new Scene2D();
		camera = new Camera2D(scene);
		display = new Display(camera);
		
		point2D1 = new Point2D(new DoublePoint2());
		point2D2 = new Point2D(new DoublePoint2());
		line2D = new Line2D(new DoublePoint2(-100, 100), new DoublePoint2());
		circle2D = new Circle2D(new DoublePoint2(0, 0), 50, 100);
		
		scene.add(point2D1);
		scene.add(point2D2);
		scene.add(line2D);
		scene.add(circle2D);
		
		line = new Line(new Positionable() {
			public DoublePoint2 getPosition() {
				return new DoublePoint2(-100, 100);
			}
		}, mousePosition);
		circle = new Circle(new Positionable() {
			public DoublePoint2 getPosition() {
				return new DoublePoint2(0, 0);
			}
		}, 50);
		circleCollision = new Circle2Line(circle, line);
		circleCollision.addColisionListener(new CollisionListener() {
			public void collisionDetected(CollisionEvent event) {
				System.out.println("circle-line collision with " + event.getCount() + " contacts");
				
				if (event.getCount() > 0) point2D1.setPosition(event.getPoints().get(0));
				if (event.getCount() > 1) point2D2.setPosition(event.getPoints().get(1));
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
			
			frame.line2D.setPosition2(mouse);
			
			frame.circleCollision.update();
			
			Thread.sleep(10);
		}
	}
	
}