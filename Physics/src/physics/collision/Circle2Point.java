package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Circle2Point extends Collision<Circle, Point> {
	
	public Circle2Point(Circle circle, Point point) {
		super(circle, point);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 circle = collideableA.getPosition();
		DoublePoint2 point = collideableB.getPosition();
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance = new DoubleVector2(circle, point);
		double radius = collideableA.radius;
		
		if ((radius * radius) == distance.scalarProduct(distance)) points.add(point);
		
		return new CollisionEvent(this, points, points.size());
	}
	
}