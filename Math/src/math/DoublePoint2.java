package math;


public class DoublePoint2 {
	
	public final double x;
	public final double y;
	
	
	public DoublePoint2() {
		x = 0d;
		y = 0d;
	}
	public DoublePoint2(double both) {
		x = both;
		y = both;
	}
	public DoublePoint2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public DoublePoint2(double... point) {
		if (point.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		if (point.length == 1) {
			x = point[0];
			y = point[0];
		} else {
			x = point[0];
			y = point[1];
		}
	}
	public DoublePoint2(DoublePoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoublePoint2(FloatPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoublePoint2(IntPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoublePoint2(DoubleVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoublePoint2(FloatVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoublePoint2(IntVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	
	
	public String toString() {
		return "(" + x + " | " + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof DoublePoint2)) return false;
		DoublePoint2 point = (DoublePoint2) obj;
		
		return (x == point.x) && (y == point.y);
	}
	public int hashCode() {
		return (int) Double.doubleToLongBits(x * y);
	}
	
	
	public FloatPoint2 asFloatPoint2() {
		return new FloatPoint2(this);
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
	public DoublePoint2 add(FloatVector2 summand) {
		return new DoublePoint2(x + summand.x, y + summand.y);
	}
	public DoublePoint2 add(IntVector2 summand) {
		return new DoublePoint2(x + summand.x, y + summand.y);
	}
	public DoublePoint2 subtract(DoubleVector2 subtrahend) {
		return new DoublePoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoublePoint2 subtract(FloatVector2 subtrahend) {
		return new DoublePoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoublePoint2 subtract(IntVector2 subtrahend) {
		return new DoublePoint2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 subtract(DoublePoint2 subtrahend) {
		return new DoubleVector2(this, subtrahend);
	}
	public DoubleVector2 subtract(FloatPoint2 subtrahend) {
		return new DoubleVector2(this, subtrahend.asDoublePoint2());
	}
	public DoubleVector2 subtract(IntPoint2 subtrahend) {
		return new DoubleVector2(this, subtrahend.asDoublePoint2());
	}
	
}