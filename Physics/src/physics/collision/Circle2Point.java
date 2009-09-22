package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Circle2Point extends Collision<Circle, Point> {
	
	public Circle2Point(Circle circle, Point point) {
		super(circle, point);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 circle = collideable1.position;
		DoublePoint2 point = collideable2.position;
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance = new DoubleVector2(circle, point);
		double radius = collideable1.radius;
		
		if ((radius * radius) == distance.scalarProduct(distance)) points.add(point);
		
		return new CollisionEvent(this, points, points.size());
	}
	
}