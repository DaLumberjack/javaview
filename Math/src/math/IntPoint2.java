package math;


public class IntPoint2 {
	
	public final int x;
	public final int y;
	
	
	public IntPoint2() {
		x = 0;
		y = 0;
	}
	public IntPoint2(int both) {
		x = both;
		y = both;
	}
	public IntPoint2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public IntPoint2(int... point) {
		if (point.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		if (point.length == 1) {
			x = point[0];
			y = point[0];
		} else {
			x = point[0];
			y = point[1];
		}
	}
	public IntPoint2(DoublePoint2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntPoint2(FloatPoint2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntPoint2(IntPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public IntPoint2(DoubleVector2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntPoint2(FloatVector2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntPoint2(IntVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	
	
	public String toString() {
		return "(" + x + " | " + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof IntPoint2)) return false;
		IntPoint2 point = (IntPoint2) obj;
		
		return (x == point.x) && (y == point.y);
	}
	public int hashCode() {
		return x | y;
	}
	
	
	public DoublePoint2 asDoublePoint2() {
		return new DoublePoint2(this);
	}
	public FloatPoint2 asFloatPoint2() {
		return new FloatPoint2(this);
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
	public IntPoint2 add(IntVector2 summand) {
		return new IntPoint2(x + summand.x, y + summand.y);
	}
	public DoublePoint2 subtract(DoubleVector2 subtrahend) {
		return new DoublePoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public FloatPoint2 subtract(FloatVector2 subtrahend) {
		return new FloatPoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public IntPoint2 subtract(IntVector2 subtrahend) {
		return new IntPoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 subtract(DoublePoint2 subtrahend) {
		return new DoubleVector2(this.asDoublePoint2(), subtrahend);
	}
	public FloatVector2 subtract(FloatPoint2 subtrahend) {
		return new FloatVector2(this.asFloatPoint2(), subtrahend);
	}
	public IntVector2 subtract(IntPoint2 subtrahend) {
		return new IntVector2(this, subtrahend);
	}
	
}