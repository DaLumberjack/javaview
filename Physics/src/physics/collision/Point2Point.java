package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;


public class Point2Point extends Collision<Point, Point> {
	
	public Point2Point(Point point1, Point point2) {
		super(point1, point2);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 point1 = collideableA.getPosition();
		DoublePoint2 point2 = collideableB.getPosition();
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		if (point1.equals(point2)) points.add(point1);
		
		return new CollisionEvent(this, points, points.size());
	}
	
}