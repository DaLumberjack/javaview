package math;

import java.util.Iterator;


public class FloatUnitVector extends FloatVector {
	
	private FloatUnitVector(int dimension) {
		super(dimension);
		
		norm = 1d;
		normCalced = true;
	}
	public FloatUnitVector(double... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(float... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(long... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(int... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(short... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(byte... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) (vector[i] * factor);
		}
	}
	public FloatUnitVector(DoubleUnitVector unitVector) {
		super(unitVector.dimension);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) unitVector.array[i];
		}
	}
	public FloatUnitVector(FloatUnitVector unitVector) {
		super(unitVector.dimension);
		
		System.arraycopy(unitVector.array, 0, array, 0, dimension);
	}
	public FloatUnitVector(DoubleVector vector) {
		this(vector.array);
	}
	public FloatUnitVector(FloatVector vector) {
		this(vector.array);
	}
	public FloatUnitVector(IntegerVector vector) {
		this(vector.array);
	}
	public FloatUnitVector(ByteVector vector) {
		this(vector.array);
	}
	public FloatUnitVector(DoublePoint point) {
		this(point.array);
	}
	public FloatUnitVector(FloatPoint point) {
		this(point.array);
	}
	public FloatUnitVector(IntegerPoint point) {
		this(point.array);
	}
	public FloatUnitVector(BytePoint point) {
		this(point.array);
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
	public DoubleUnitVector asDoubleUnitVector() {
		return new DoubleUnitVector(this);
	}
	public DoubleVector asDoubleVector() {
		return super.asDoubleVector();
	}
	public IntegerVector asIntegerVector() {
		return super.asIntegerVector();
	}
	public ByteVector asByteVector() {
		return super.asByteVector();
	}
	public DoublePoint asDoublePoint() {
		return super.asDoublePoint();
	}
	public FloatPoint asFloat() {
		return super.asPoint();
	}
	public IntegerPoint asIntegerPoint() {
		return super.asIntegerPoint();
	}
	public BytePoint asBytePoint() {
		return super.asBytePoint();
	}
	
	public DoubleUnitVector setComponent(int component, double value) {
		double[] result = new double[dimension];
		
		for (int i = 0; i < dimension; i++) {
			result[i] = array[i];
		}
		
		result[component] = value;
		
		return new DoubleUnitVector(result);
	}
	public FloatUnitVector setComponent(int component, float value) {
		float[] result = new float[dimension];
		
		System.arraycopy(array, 0, result, 0, dimension);
		result[component] = value;
		
		return new FloatUnitVector(result);
	}
	
	
	public double norm() {
		return 1d;
	}
	public FloatUnitVector invert() {
		FloatUnitVector result = new FloatUnitVector(this);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = -result.array[i];
		}
		
		return result;
	}
	public FloatUnitVector unitVector() {
		return this;
	}
	
	public DoubleVector add(DoubleVector summand) {
		return super.add(summand);
	}
	public FloatVector add(FloatVector summand) {
		return super.add(summand);
	}
	public FloatVector add(IntegerVector summand) {
		return super.add(summand);
	}
	public FloatVector add(ByteVector summand) {
		return super.add(summand);
	}
	public DoubleVector subtract(DoubleVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public FloatVector subtract(FloatVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public FloatVector subtract(IntegerVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public FloatVector subtract(ByteVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public DoubleVector scalarMultiply(double factor) {
		return super.scalarMultiply(factor);
	}
	public FloatVector scalarMultiply(float factor) {
		return super.scalarMultiply(factor);
	}
	public DoubleVector scalarDivide(double divisor) {
		return super.scalarDivide(divisor);
	}
	public FloatVector scalarDivide(float divisor) {
		return super.scalarDivide(divisor);
	}
	
	public double scalarProduct(DoubleVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public float scalarProduct(FloatVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public float scalarProduct(IntegerVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public float scalarProduct(ByteVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public DoubleVector crossProduct(DoubleVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public FloatVector crossProduct(FloatVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public FloatVector crossProduct(IntegerVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public FloatVector crossProduct(ByteVector... multiplicands) {
		return super.crossProduct(multiplicands);
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
	
}