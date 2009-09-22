package physics.collision;

import math.DoublePoint2;


public class Point implements Collideable {
	
	protected DoublePoint2 position;
	
	
	public Point(DoublePoint2 position) {
		this.position = position;
	}
	
	
	public DoublePoint2 getPosition() {
		return position;
	}
	
	public void setPosition(DoublePoint2 position) {
		this.position = position;
	}
	
}