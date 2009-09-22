package physics.collision;

import java.util.List;

import math.DoublePoint2;


public class CollisionEvent {
	
	private final Collision<?, ?> collision;
	
	private final List<DoublePoint2> points;
	private final float count;
	
	
	public CollisionEvent(Collision<?, ?> collision, List<DoublePoint2> points, float count) {
		this.collision = collision;
		
		this.points = points;
		this.count = count;
	}
	
	
	public Collision<?, ?> getCollision() {
		return collision;
	}
	public List<DoublePoint2> getPoints() {
		return points;
	}
	public float getCount() {
		return count;
	}
	public boolean noCollision() {
		return count == 0;
	}
	
}