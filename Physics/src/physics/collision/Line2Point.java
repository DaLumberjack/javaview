package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Line2Point extends Collision<Line, Point> {
	
	public Line2Point(Line line, Point point) {
		super(line, point);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 line1 = collideable1.position1;
		DoublePoint2 line2 = collideable1.position2;
		DoublePoint2 point = collideable2.position;
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance = new DoubleVector2(line1, line2);
		double lambda = (point.x - line1.x) / distance.x;
		
		if ((lambda >= 0) & (lambda <= 1d)) points.add(point);
		
		return new CollisionEvent(this, points, points.size());
	}
	
}