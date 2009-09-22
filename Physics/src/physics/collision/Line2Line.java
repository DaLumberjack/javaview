package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Line2Line extends Collision<Line, Line> {
	
	public Line2Line(Line line1, Line line2) {
		super(line1, line2);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 line11 = collideable1.position1;
		DoublePoint2 line12 = collideable1.position2;
		DoublePoint2 line21 = collideable2.position1;
		DoublePoint2 line22 = collideable2.position2;
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance1 = new DoubleVector2(line11, line12);
		DoubleVector2 distance2 = new DoubleVector2(line21, line22);
		DoubleVector2 distance12 = new DoubleVector2(line11, line21);
		
		double determinant = distance2.x * distance1.y - distance1.x * distance2.y;
		double lambda = (distance2.x * distance12.y - distance12.x * distance2.y) / determinant;
		double my = (distance1.x * distance12.y - distance12.x * distance1.y) / determinant;
		
		if (((lambda >= 0d) & (lambda <= 1d)) & ((my >= 0d) & (my <= 1d)))
			points.add(line11.add(distance1.scalarMultiply(lambda)));
		
		return new CollisionEvent(this, points, points.size());
	}
	
}