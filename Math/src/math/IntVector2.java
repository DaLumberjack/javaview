package math;


public class IntVector2 {
	
	public static final IntVector2 ZERO_VECTOR = new IntVector2();
	
	public static final IntVector2 AXIS_X = new IntVector2(1, 0);
	public static final IntVector2 AXIS_Y = new IntVector2(0, 1);
	
	public final int x;
	public final int y;
	
	private double norm = -1d;
	
	
	public IntVector2() {
		x = 0;
		y = 0;
	}
	public IntVector2(double both) {
		x = (int) both;
		y = (int) both;
	}
	public IntVector2(float both) {
		x = (int) both;
		y = (int) both;
	}
	public IntVector2(int both) {
		x = both;
		y = both;
	}
	public IntVector2(double x, double y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	public IntVector2(float x, float y) {
		this.x = (int) x;
		this.y = (int) y;
	}
	public IntVector2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public IntVector2(int... vector) {
		if (vector.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		if (vector.length == 1) {
			x = vector[0];
			y = vector[0];
		} else {
			x = vector[0];
			y = vector[1];
		}
	}
	public IntVector2(DoublePoint2 tail, DoublePoint2 apex) {
		x = (int) (apex.x - tail.x);
		y = (int) (apex.y - tail.y);
	}
	public IntVector2(FloatPoint2 tail, FloatPoint2 apex) {
		x = (int) (apex.x - tail.x);
		y = (int) (apex.y - tail.y);
	}
	public IntVector2(IntPoint2 tail, IntPoint2 apex) {
		x = apex.x - tail.x;
		y = apex.y - tail.y;
	}
	public IntVector2(DoubleVector2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntVector2(FloatVector2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntVector2(IntVector2 vector) {
		x = vector.x;
		y = vector.y;
	}
	public IntVector2(DoublePoint2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntVector2(FloatPoint2 vector) {
		x = (int) vector.x;
		y = (int) vector.y;
	}
	public IntVector2(IntPoint2 vector) {
		x = vector.x;
		y = vector.y;
	}
	
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof IntVector2)) return false;
		IntVector2 vector = (IntVector2) obj;
		
		return (x == vector.x) && (y == vector.y);
	}
	public int hashCode() {
		return x | y;
	}
	
	
	public DoubleVector2 asDoubleVector2() {
		return new DoubleVector2(this);
	}
	public FloatVector2 asFloatVector2() {
		return new FloatVector2(this);
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
	public FloatUnitVector2 unitVector() {
		return new FloatUnitVector2(this);
	}
	public IntVector2 invert() {
		return new IntVector2(-x, -y);
	}
	public IntVector2 leftNormalVector() {
		return new IntVector2(-y,  x);
	}
	public IntVector2 rightNormalVector() {
		return new IntVector2( y, -x);
	}
	
	public DoubleVector2 add(DoubleVector2 summand) {
		return new DoubleVector2(x + summand.x, y + summand.y);
	}
	public FloatVector2 add(FloatVector2 summand) {
		return new FloatVector2(x + summand.x, y + summand.y);
	}
	public IntVector2 add(IntVector2 summand) {
		return new IntVector2(x + summand.x, y + summand.y);
	}
	public DoubleVector2 subtract(DoubleVector2 subtrahend) {
		return new DoubleVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public FloatVector2 subtract(FloatVector2 subtrahend) {
		return new FloatVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public IntVector2 subtract(IntVector2 subtrahend) {
		return new IntVector2(x - subtrahend.x, y - subtrahend.y);
	}
	public DoubleVector2 multiply(DoubleVector2 multiplicand) {
		return new DoubleVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public FloatVector2 multiply(FloatVector2 multiplicand) {
		return new FloatVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public IntVector2 multiply(IntVector2 multiplicand) {
		return new IntVector2(x * multiplicand.x, y * multiplicand.y);
	}
	public DoubleVector2 divide(DoubleVector2 divisor) {
		return new DoubleVector2(x / divisor.x, y / divisor.y);
	}
	public FloatVector2 divide(FloatVector2 divisor) {
		return new FloatVector2(x / divisor.x, y / divisor.y);
	}
	public IntVector2 divide(IntVector2 divisor) {
		return new IntVector2(x / divisor.x, y / divisor.y);
	}
	public DoubleVector2 scalarMultiply(double factor) {
		return new DoubleVector2(x * factor, y * factor);
	}
	public FloatVector2 scalarMultiply(float factor) {
		return new FloatVector2(x * factor, y * factor);
	}
	public IntVector2 scalarMultiply(int factor) {
		return new IntVector2(x * factor, y * factor);
	}
	public DoubleVector2 scalarDivide(double divisor) {
		return new DoubleVector2(x / divisor, y / divisor);
	}
	public FloatVector2 scalarDivide(float divisor) {
		return new FloatVector2(x / divisor, y / divisor);
	}
	public IntVector2 scalarDivide(int divisor) {
		return new IntVector2(x / divisor, y / divisor);
	}
	
	public double scalarProduct(DoubleVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	public float scalarProduct(FloatVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	public int scalarProduct(IntVector2 multiplicand) {
		return x * multiplicand.x + y * multiplicand.y;
	}
	
	public DoubleVector2 matrixMultiplication(DoubleMatrix2 multiplicand) {
		return new DoubleVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	public FloatVector2 matrixMultiplication(FloatMatrix2 multiplicand) {
		return new FloatVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	public IntVector2 matrixMultiplication(IntMatrix2 multiplicand) {
		return new IntVector2(
				x * multiplicand.m00 + y * multiplicand.m10,
				x * multiplicand.m01 + y * multiplicand.m11
		);
	}
	
}