package physics.collision;

import math.DoublePoint2;


public class Circle implements Collideable {
	
	protected Position position;
	protected double radius;
	
	
	public Circle(Position position, double radius) {
		this.position = position;
		this.radius = radius;
	}
	
	
	public DoublePoint2 getPosition() {
		return position.getPosition();
	}
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}