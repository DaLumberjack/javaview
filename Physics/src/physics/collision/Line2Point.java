package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Line2Point extends Collision<Line, Point> {
	
	public Line2Point(Line line, Point point) {
		super(line, point);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 line1 = collideableA.getPositionA();
		DoublePoint2 line2 = collideableA.getPositionB();
		DoublePoint2 point = collideableB.getPosition();
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance = new DoubleVector2(line1, line2);
		double lambdaX = (point.x - line1.x) / distance.x;
		double lambdaY = (point.y - line1.y) / distance.y;
		
		if (lambdaX == lambdaY)
			if ((lambdaX >= 0) & (lambdaX <= 1d)) points.add(point);
		
		return new CollisionEvent(this, points, points.size());
	}
	
}