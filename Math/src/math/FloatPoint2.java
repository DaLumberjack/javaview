package math;


public class FloatPoint2 {
	
	public final float x;
	public final float y;
	
	
	public FloatPoint2() {
		x = 0f;
		y = 0f;
	}
	public FloatPoint2(float both) {
		x = both;
		y = both;
	}
	public FloatPoint2(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public FloatPoint2(float... point) {
		if (point.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		if (point.length == 1) {
			x = point[0];
			y = point[0];
		} else {
			x = point[0];
			y = point[1];
		}
	}
	public FloatPoint2(DoublePoint2 vector) {
		x = (float) vector.x;
		y = (float) vector.y;
	}
	public FloatPoint2(FloatPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public FloatPoint2(IntPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public FloatPoint2(DoubleVector2 vector) {
		x = (float) vector.x;
		y = (float) vector.y;
	}
	public FloatPoint2(FloatVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public FloatPoint2(IntVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	
	
	public String toString() {
		return "(" + x + " | " + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof FloatPoint2)) return false;
		FloatPoint2 point = (FloatPoint2) obj;
		
		return (x == point.x) && (y == point.y);
	}
	public int hashCode() {
		return Float.floatToIntBits(x * y);
	}
	
	
	public DoublePoint2 asDoublePoint2() {
		return new DoublePoint2(this);
	}
	public IntPoint2 asIntPoint2() {
		return new IntPoint2(this);
	}
	public DoubleVector2 asDoubleVector2() {
		return new DoubleVector2(this);
	}
	public FloatVector2 asFloatVector2() {
		return new FloatVector2(this);
	}
	public IntVector2 asIntVector2() {
		return new IntVector2(this);
	}
	
	
	public DoublePoint2 add(DoubleVector2 summand) {
		return new DoublePoint2(x + summand.x, y + summand.y);
	}
	public FloatPoint2 add(FloatVector2 summand) {
		return new FloatPoint2(x + summand.x, y + summand.y);
	}
	public FloatPoint2 add(IntVector2 summand) {
		return new FloatPoint2(x + summand.x, y + summand.y);
	}
	public DoublePoint2 subtract(DoubleVector2 subtrahend) {
		return new DoublePoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public FloatPoint2 subtract(FloatVector2 subtrahend) {
		return new FloatPoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public FloatPoint2 subtract(IntVector2 subtrahend) {
		return new FloatPoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 subtract(DoublePoint2 subtrahend) {
		return new DoubleVector2(this.asDoublePoint2(), subtrahend);
	}
	public FloatVector2 subtract(FloatPoint2 subtrahend) {
		return new FloatVector2(this, subtrahend);
	}
	public FloatVector2 subtract(IntPoint2 subtrahend) {
		return new FloatVector2(this, subtrahend.asFloatPoint2());
	}
	
}