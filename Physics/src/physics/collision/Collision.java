package physics.collision;

import java.util.LinkedList;


public abstract class Collision<T1 extends Collideable, T2 extends Collideable> {
	
	protected final T1 collideableA;
	protected final T2 collideableB;
	
	private final LinkedList<CollisionListener> collisionListeners;
	
	
	public Collision(T1 collideable1, T2 collideable2) {
		this.collideableA = collideable1;
		this.collideableB = collideable2;
		
		collisionListeners = new LinkedList<CollisionListener>();
	}
	
	
	public T1 getCollideable1() {
		return collideableA;
	}
	public T2 getCollideable2() {
		return collideableB;
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
		
		if (event.getCount() == 0f) return;
		
		for (CollisionListener listener : collisionListeners) {
			listener.collisionDetected(event);
		}
	}
	
}