package math;


public final class FloatUnitVector2 extends FloatVector2 {
	
	public FloatUnitVector2(DoubleUnitVector2 vector) {
		super(vector);
	}
	public FloatUnitVector2(FloatUnitVector2 vector) {
		super(vector);
	}
	public FloatUnitVector2(DoubleVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	public FloatUnitVector2(FloatVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	public FloatUnitVector2(IntVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	private FloatUnitVector2(float x, float y) {
		super(x, y);
	}
	
	
	public DoubleUnitVector2 asDobuleUnitVector2() {
		return new DoubleUnitVector2(this);
	}
	
	
	public double norm() {
		return 1d;
	}
	public FloatUnitVector2 invert() {
		return new FloatUnitVector2(-x, -y);
	}
	public FloatUnitVector2 leftNormalVector() {
		return new FloatUnitVector2(-y,  x);
	}
	public FloatUnitVector2 rightNormalVector() {
		return new FloatUnitVector2( y, -x);
	}
	
}