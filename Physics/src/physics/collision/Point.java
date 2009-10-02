package physics.collision;

import math.DoublePoint2;


public class Point implements Collideable {
	
	protected Position position;
	
	
	public Point(Position position) {
		this.position = position;
	}
	
	
	public DoublePoint2 getPosition() {
		return position.getPosition();
	}
	
}