package physics.collision;

import math.DoublePoint2;


public class Line implements Collideable {
	
	protected DoublePoint2 position1;
	protected DoublePoint2 position2;
	
	
	public Line(DoublePoint2 position1, DoublePoint2 position2) {
		this.position1 = position1;
		this.position2 = position2;
	}
	
	
	public DoublePoint2 getPosition1() {
		return position1;
	}
	public DoublePoint2 getPosition2() {
		return position2;
	}
	
	public void setPosition1(DoublePoint2 position1) {
		this.position1 = position1;
	}
	public void setPosition2(DoublePoint2 position2) {
		this.position2 = position2;
	}
	
}