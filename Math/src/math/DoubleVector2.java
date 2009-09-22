package math;


public class DoubleVector2 {
	
	public static final DoubleVector2 ZERO_VECTOR = new DoubleVector2();
	
	public static final DoubleVector2 AXIS_X = new DoubleVector2(1d, 0d);
	public static final DoubleVector2 AXIS_Y = new DoubleVector2(0d, 1d);
	
	public final double x;
	public final double y;
	
	private double norm = -1d;
	
	
	public DoubleVector2() {
		x = 0d;
		y = 0d;
	}
	public DoubleVector2(double both) {
		x = both;
		y = both;
	}
	public DoubleVector2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public DoubleVector2(double... vector) {
		if (vector.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		if (vector.length == 1) {
			x = vector[0];
			y = vector[0];
		} else {
			x = vector[0];
			y = vector[1];
		}
	}
	public DoubleVector2(DoublePoint2 tail, DoublePoint2 apex) {
		x = apex.x - tail.x;
		y = apex.y - tail.y;
	}
	public DoubleVector2(FloatPoint2 tail, FloatPoint2 apex) {
		x = apex.x - tail.x;
		y = apex.y - tail.y;
	}
	public DoubleVector2(IntPoint2 tail, IntPoint2 apex) {
		x = apex.x - tail.x;
		y = apex.y - tail.y;
	}
	public DoubleVector2(DoubleVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoubleVector2(FloatVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoubleVector2(IntVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoubleVector2(DoublePoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoubleVector2(FloatPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public DoubleVector2(IntPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof DoubleVector2)) return false;
		DoubleVector2 vector = (DoubleVector2) obj;
		
		return (x == vector.x) && (y == vector.y);
	}
	public int hashCode() {
		return (int) Double.doubleToLongBits(x * y);
	}
	
	
	public FloatVector2 asFloatVector2() {
		return new FloatVector2(this);
	}
	public IntVector2 asIntVector2() {
		return new IntVector2(this);
	}
	public DoublePoint2 asDoublePoint2() {
		return new DoublePoint2(this);
	}
	public FloatPoint2 asFloatPoint2() {
		return new FloatPoint2(this);
	}
	public IntPoint2 asIntPoint2() {
		return new IntPoint2(this);
	}
	
	
	public double norm() {
		if (norm != -1d) return norm;
		
		return norm = Math.sqrt(x * x + y * y);
	}
	public DoubleUnitVector2 unitVector() {
		return new DoubleUnitVector2(this);
	}
	public DoubleVector2 invert() {
		return new DoubleVector2(-x, -y);
	}
	public DoubleVector2 leftNormalVector() {
		return new DoubleVector2(-y,  x);
	}
	public DoubleVector2 rightNormalVector() {
		return new DoubleVector2( y, -x);
	}
	
	public DoubleVector2 add(DoubleVector2 summand) {
		return new DoubleVector2(x + summand.x, y + summand.y);
	}
	public DoubleVector2 add(FloatVector2 summand) {
		return new DoubleVector2(x + summand.x, y + summand.y);
	}
	public DoubleVector2 add(IntVector2 summand) {
		return new DoubleVector2(x + summand.x, y + summand.y);
	}
	public DoubleVector2 subtract(DoubleVector2 subtrahend) {
		return new DoubleVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 subtract(FloatVector2 subtrahend) {
		return new DoubleVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 subtract(IntVector2 subtrahend) {
		return new DoubleVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 multiply(DoubleVector2 multiplicand) {
		return new DoubleVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public DoubleVector2 multiply(FloatVector2 multiplicand) {
		return new DoubleVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public DoubleVector2 multiply(IntVector2 multiplicand) {
		return new DoubleVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public DoubleVector2 divide(DoubleVector2 divisor) {
		return new DoubleVector2(x / divisor.x, y / divisor.y);
	}
	public DoubleVector2 divide(FloatVector2 divisor) {
		return new DoubleVector2(x / divisor.x, y / divisor.y);
	}
	public DoubleVector2 divide(IntVector2 divisor) {
		return new DoubleVector2(x / divisor.x, y / divisor.y);
	}
	public DoubleVector2 scalarMultiply(double factor) {
		return new DoubleVector2(x * factor, y * factor);
	}
	public DoubleVector2 scalarDivide(double divisor) {
		return new DoubleVector2(x / divisor, y / divisor);
	}
	
	public double scalarProduct(DoubleVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	public double scalarProduct(FloatVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	public double scalarProduct(IntVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	
	public DoubleVector2 matrixMultiplication(DoubleMatrix2 multiplicand) {
		return new DoubleVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	public DoubleVector2 matrixMultiplication(FloatMatrix2 multiplicand) {
		return new DoubleVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	public DoubleVector2 matrixMultiplication(IntMatrix2 multiplicand) {
		return new DoubleVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	
}