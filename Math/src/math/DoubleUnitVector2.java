package math;


public final class DoubleUnitVector2 extends DoubleVector2 {
	
	public DoubleUnitVector2(DoubleUnitVector2 vector) {
		super(vector);
	}
	public DoubleUnitVector2(FloatUnitVector2 vector) {
		super(vector);
	}
	public DoubleUnitVector2(DoubleVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	public DoubleUnitVector2(FloatVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	public DoubleUnitVector2(IntVector2 vector) {
		super(vector.x / vector.norm(), vector.y / vector.norm());
		
		if (vector.norm() == 0d) throw new IllegalArgumentException("The vector cannot be a zero vector!");
	}
	private DoubleUnitVector2(double x, double y) {
		super(x, y);
	}
	
	
	public FloatUnitVector2 asFloatUnitVector2() {
		return new FloatUnitVector2(this);
	}
	
	
	public double norm() {
		return 1d;
	}
	public DoubleUnitVector2 invert() {
		return new DoubleUnitVector2(-x, -y);
	}
	public DoubleUnitVector2 leftNormalVector() {
		return new DoubleUnitVector2(-y,  x);
	}
	public DoubleUnitVector2 rightNormalVector() {
		return new DoubleUnitVector2( y, -x);
	}
	
}