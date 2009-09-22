package physics.collision;

import java.util.LinkedList;

import math.DoublePoint2;
import math.DoubleVector2;


public class Circle2Line extends Collision<Circle, Line> {
	
	public Circle2Line(Circle circle, Line line) {
		super(circle, line);
	}
	
	
	public CollisionEvent detectCollision() {
		DoublePoint2 circle = collideable1.position;
		DoublePoint2 line1 = collideable2.position1;
		DoublePoint2 line2 = collideable2.position2;
		
		LinkedList<DoublePoint2> points = new LinkedList<DoublePoint2>();
		
		DoubleVector2 distance = new DoubleVector2(line1, line2);
		double radius = collideable1.radius;
		
		DoubleVector2 vcircle = new DoubleVector2(circle);
		DoubleVector2 vline1 = new DoubleVector2(line1);
		DoubleVector2 tmp = vline1.subtract(vcircle);
		double a = distance.scalarProduct(distance);
		double b = 2 * distance.scalarProduct(vline1.subtract(vcircle));
		double c = tmp.scalarProduct(tmp) - (radius * radius);
		
		double qa = -b;
		double qb = Math.sqrt(b * b - 4 * a * c);
		double qc = 2 * a;
		
		if ((qc != 0d) & (qb != Double.NaN)) {
			points.add(line1.add(distance.scalarMultiply((qa + qb) / qc)));
			if (qb != 0d) points.add(line1.add(distance.scalarMultiply((qa - qb) / qc)));
		}
		
		return new CollisionEvent(this, points, points.size());
	}
	
}