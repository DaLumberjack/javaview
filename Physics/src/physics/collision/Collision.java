package physics.collision;

import java.util.LinkedList;


public abstract class Collision {
	
	protected final Collideable collideable1;
	protected final Collideable collideable2;
	
	private final LinkedList<CollisionListener> collisionListeners;
	
	
	public Collision(Collideable collideable1, Collideable collideable2) {
		this.collideable1 = collideable1;
		this.collideable2 = collideable2;
		
		collisionListeners = new LinkedList<CollisionListener>();
	}
	
	
	public Collideable getCollideable1() {
		return collideable1;
	}
	public Collideable getCollideable2() {
		return collideable2;
	}
	
	
	public void addColisionListener(CollisionListener collisionListener) {
		collisionListeners.add(collisionListener);
	}
	
	public boolean removeColisionListener(CollisionListener collisionListener) {
		return collisionListeners.remove(collisionListener);
	}
	
	
	public abstract CollisionEvent detectCollision();
	
	public void update() {
		CollisionEvent event = detectCollision();
		
		for (CollisionListener listener : collisionListeners) {
			listener.collisionDetected(event);
		}
	}
	
}