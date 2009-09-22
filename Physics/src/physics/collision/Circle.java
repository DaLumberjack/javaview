package physics.collision;

import math.DoublePoint2;


public class Circle implements Collideable {
	
	protected DoublePoint2 position;
	protected double radius;
	
	
	public Circle(DoublePoint2 position, double radius) {
		this.position = position;
		this.radius = radius;
	}
	
	
	public DoublePoint2 getPosition() {
		return position;
	}
	public double getRadius() {
		return radius;
	}
	
	public void setPosition(DoublePoint2 position) {
		this.position = position;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}