package math;

import java.util.Iterator;


public class FloatVector4 extends FloatVector {
	
	public static final FloatVector4 nullVector = new FloatVector4();
	public static final FloatVector4 axisX = nullVector.setComponent(0, 1f);
	public static final FloatVector4 axisY = nullVector.setComponent(1, 1f);
	public static final FloatVector4 axisZ = nullVector.setComponent(2, 1f);
	public static final FloatVector4 axisW = nullVector.setComponent(3, 1f);
	
	
	public FloatVector4() {
		super(4);
	}
	public FloatVector4(double... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) vector4[i];
		}
	}
	public FloatVector4(float... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		System.arraycopy(vector4, 0, array, 0, 4);
	}
	public FloatVector4(long... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector4[i];
		}
	}
	public FloatVector4(int... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector4[i];
		}
	}
	public FloatVector4(short... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector4[i];
		}
	}
	public FloatVector4(byte... vector4) {
		this();
		
		if (vector4.length != 4) throw new IllegalArgumentException("");
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector4[i];
		}
	}
	public FloatVector4(DoubleVector vector) {
		this(vector.array);
	}
	public FloatVector4(FloatVector vector) {
		this(vector.array);
	}
	public FloatVector4(IntegerVector vector) {
		this(vector.array);
	}
	public FloatVector4(ByteVector vector) {
		this(vector.array);
	}
	public FloatVector4(DoubleVector4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = (float) vector.array[i];
		}
	}
	public FloatVector4(FloatVector4 vector) {
		this();
		
		System.arraycopy(vector.array, 0, array, 0, 4);
	}
	public FloatVector4(IntegerVector4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector.array[i];
		}
	}
	public FloatVector4(ByteVector4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector.array[i];
		}
	}
	public FloatVector4(DoublePoint point) {
		this(point.array);
	}
	public FloatVector4(FloatPoint point) {
		this(point.array);
	}
	public FloatVector4(IntegerPoint point) {
		this(point.array);
	}
	public FloatVector4(BytePoint point) {
		this(point.array);
	}
	public FloatVector4(DoublePoint4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = (float) vector.array[i];
		}
	}
	public FloatVector4(FloatPoint4 vector) {
		this();
		
		System.arraycopy(vector.array, 0, array, 0, 4);
	}
	public FloatVector4(IntegerPoint4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector.array[i];
		}
	}
	public FloatVector4(BytePoint4 vector) {
		this();
		
		for (int i = 0; i < 4; i++) {
			array[i] = vector.array[i];
		}
	}
	
	
	public String toString() {
		return super.toString();
	}
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	public int hashCode() {
		return super.hashCode();
	}
	
	
	public float component(int component) {
		return super.component(component);
	}
	public Iterator<Float> iterator() {
		return super.iterator();
	}
	public DoubleVector4 asDoubleVector() {
		return new DoubleVector4(this);
	}
	public IntegerVector4 asIntegerVector() {
		return new IntegerVector4(this);
	}
	public ByteVector4 asByteVector() {
		return new ByteVector4(this);
	}
	public DoublePoint4 asDoublePoint() {
		return new DoublePoint4(this);
	}
	public FloatPoint4 asPoint() {
		return new FloatPoint4(this);
	}
	public IntegerPoint4 asIntegerPoint() {
		return new IntegerPoint4(this);
	}
	public BytePoint4 asBytePoint() {
		return new BytePoint4(this);
	}
	
	public DoubleVector4 setComponent(int component, double value) {
		DoubleVector4 result = new DoubleVector4(this);
		
		result.array[component] = value;
		
		return result;
	}
	public FloatVector4 setComponent(int component, float value) {
		FloatVector4 result = new FloatVector4(this);
		
		result.array[component] = value;
		
		return result;
	}
	
	
	public double norm() {
		return Math.sqrt(scalarProduct(this));
	}
	public FloatVector4 invert() {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = -array[0];
		result.array[1] = -array[1];
		result.array[2] = -array[2];
		result.array[3] = -array[3];
		
		return result;
	}
	public FloatUnitVector4 unitVector() {
		return new FloatUnitVector4(this);
	}
	
	public DoubleVector4 add(DoubleVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(FloatVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public DoubleVector4 add(DoubleVector4 summand) {
		DoubleVector4 result = new DoubleVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(FloatVector4 summand) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(IntegerVector4 summand) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public FloatVector4 add(ByteVector4 summand) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] + summand.array[0];
		result.array[1] = array[1] + summand.array[1];
		result.array[2] = array[2] + summand.array[2];
		result.array[3] = array[3] + summand.array[3];
		
		return result;
	}
	public DoubleVector4 subtract(DoubleVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(FloatVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public DoubleVector4 subtract(DoubleVector4 subtrahend) {
		DoubleVector4 result = new DoubleVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(FloatVector4 subtrahend) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(IntegerVector4 subtrahend) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public FloatVector4 subtract(ByteVector4 subtrahend) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] - subtrahend.array[0];
		result.array[1] = array[1] - subtrahend.array[1];
		result.array[2] = array[2] - subtrahend.array[2];
		result.array[3] = array[3] - subtrahend.array[3];
		
		return result;
	}
	public DoubleVector4 scalarMultiply(double factor) {
		DoubleVector4 result = new DoubleVector4();
		
		result.array[0] = array[0] * factor;
		result.array[1] = array[1] * factor;
		result.array[2] = array[2] * factor;
		result.array[3] = array[3] * factor;
		
		return result;
	}
	public FloatVector4 scalarMultiply(float factor) {
		FloatVector4 result = new FloatVector4();
		
		result.array[0] = array[0] * factor;
		result.array[1] = array[1] * factor;
		result.array[2] = array[2] * factor;
		result.array[3] = array[3] * factor;
		
		return result;
	}
	public DoubleVector4 scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	public FloatVector4 scalarDivide(float divisor) {
		return scalarMultiply(1f / divisor);
	}
	
	public double scalarProduct(DoubleVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(FloatVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(IntegerVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(ByteVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public double scalarProduct(DoubleVector4 multiplicand) {
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(FloatVector4 multiplicand) {
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(IntegerVector4 multiplicand) {
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public float scalarProduct(ByteVector4 multiplicand) {
		return array[0] * multiplicand.array[0] + array[1] * multiplicand.array[1] +
				array[2] * multiplicand.array[2] + array[3] * multiplicand.array[3];
	}
	public DoubleVector4 crossProduct(DoubleVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length + 1];
		
		newMultiplicands[0] = asDoubleVector();
		System.arraycopy(multiplicands, 0, newMultiplicands, 1, multiplicands.length);
		
		return DoubleVector4.crossProduct4D(newMultiplicands);
	}
	public FloatVector4 crossProduct(FloatVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i];
		}
		
		return crossProduct4D(newMultiplicands);
	}
	public FloatVector4 crossProduct(IntegerVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asFloatVector();
		}
		
		return crossProduct4D(newMultiplicands);
	}
	public FloatVector4 crossProduct(ByteVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asFloatVector();
		}
		
		return crossProduct4D(newMultiplicands);
	}
	protected static FloatVector4 crossProduct4D(FloatVector... multiplicands) {
		// TODO Exception
		if (multiplicands.length != 3) throw new IllegalArgumentException("");
		if (multiplicands[0].dimension != 4) throw new IllegalArgumentException("");
		
		FloatMatrix matrix = new FloatMatrix(true, multiplicands);
		
		FloatVector4 result;
		
		result = axisX.scalarMultiply(matrix.strikeRow(0).determinant());
		result = result.subtract(axisY.scalarMultiply(matrix.strikeRow(1).determinant()));
		result = result.add(axisZ.scalarMultiply(matrix.strikeRow(2).determinant()));
		result = result.subtract(axisW.scalarMultiply(matrix.strikeRow(3).determinant()));
		
		return result;
	}
	
	public DoubleVector matrixMultiply(DoubleMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public FloatVector matrixMultiply(FloatMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public FloatVector matrixMultiply(IntegerMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public FloatVector matrixMultiply(ByteMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public DoubleVector4 matrixMultiply(DoubleMatrix4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		double sum;
		
		for (int column = 0; column < 4; column++) {
			 sum  = array[0] * multiplicand.array[0][column];
			 sum += array[1] * multiplicand.array[1][column];
			 sum += array[2] * multiplicand.array[2][column];
			 sum += array[3] * multiplicand.array[3][column];
			 
			 result.array[column] = sum;
		}
		
		return result;
	}
	public FloatVector4 matrixMultiply(FloatMatrix4 multiplicand) {
		FloatVector4 result = new FloatVector4();
		float sum;
		
		for (int column = 0; column < 4; column++) {
			 sum  = array[0] * multiplicand.array[0][column];
			 sum += array[1] * multiplicand.array[1][column];
			 sum += array[2] * multiplicand.array[2][column];
			 sum += array[3] * multiplicand.array[3][column];
			 
			 result.array[column] = sum;
		}
		
		return result;
	}
	public FloatVector4 matrixMultiply(IntegerMatrix4 multiplicand) {
		FloatVector4 result = new FloatVector4();
		float sum;
		
		for (int column = 0; column < 4; column++) {
			 sum  = array[0] * multiplicand.array[0][column];
			 sum += array[1] * multiplicand.array[1][column];
			 sum += array[2] * multiplicand.array[2][column];
			 sum += array[3] * multiplicand.array[3][column];
			 
			 result.array[column] = sum;
		}
		
		return result;
	}
	public FloatVector4 matrixMultiply(ByteMatrix4 multiplicand) {
		FloatVector4 result = new FloatVector4();
		float sum;
		
		for (int column = 0; column < 4; column++) {
			 sum  = array[0] * multiplicand.array[0][column];
			 sum += array[1] * multiplicand.array[1][column];
			 sum += array[2] * multiplicand.array[2][column];
			 sum += array[3] * multiplicand.array[3][column];
			 
			 result.array[column] = sum;
		}
		
		return result;
	}
	
}