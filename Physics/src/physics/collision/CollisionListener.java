package physics.collision;

import java.util.HashSet;

import math.DoublePoint2;


public interface CollisionListener {
        
        public void collisionDetected(Collideable collideable1, Collideable collideable2, float contectes, HashSet<DoublePoint2> points);
        
}