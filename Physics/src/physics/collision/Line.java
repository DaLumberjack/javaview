package physics.collision;

import math.DoublePoint2;


public class Line implements Collideable {
	
	protected Position positionA;
	protected Position positionB;
	
	
	public Line(Position positionA, Position positionB) {
		this.positionA = positionA;
		this.positionB = positionB;
	}
	
	
	public DoublePoint2 getPositionA() {
		return positionA.getPosition();
	}
	public DoublePoint2 getPositionB() {
		return positionB.getPosition();
	}
	
}