package math;

import java.util.Iterator;


public class DoubleUnitVector extends DoubleVector {
	
	private DoubleUnitVector(int dimension) {
		super(dimension);
		
		norm = 1d;
		normCalced = true;
	}
	public DoubleUnitVector(double... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(float... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(long... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(int... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(short... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(byte... vector) {
		// TODO Exception
		this(vector.length);
		
		double factor = 0d;
		
		for (int i = 0; i < dimension; i++) {
			factor += vector[i] * vector[i];
		}
		
		if (factor == 0d) throw new IllegalArgumentException("");
		factor = 1d / Math.sqrt(factor);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i] * factor;
		}
	}
	public DoubleUnitVector(DoubleUnitVector unitVector) {
		super(unitVector.dimension);
		
		System.arraycopy(unitVector.array, 0, array, 0, dimension);
	}
	public DoubleUnitVector(FloatUnitVector unitVector) {
		super(unitVector.dimension);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = unitVector.array[i];
		}
	}
	public DoubleUnitVector(DoubleVector vector) {
		this(vector.array);
	}
	public DoubleUnitVector(FloatVector vector) {
		this(vector.array);
	}
	public DoubleUnitVector(IntegerVector vector) {
		this(vector.array);
	}
	public DoubleUnitVector(ByteVector vector) {
		this(vector.array);
	}
	public DoubleUnitVector(DoublePoint point) {
		this(point.array);
	}
	public DoubleUnitVector(FloatPoint point) {
		this(point.array);
	}
	public DoubleUnitVector(IntegerPoint point) {
		this(point.array);
	}
	public DoubleUnitVector(BytePoint point) {
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
	
	
	public double component(int component) {
		return super.component(component);
	}
	public Iterator<Double> iterator() {
		return super.iterator();
	}
	public FloatUnitVector asFloatUnitVector() {
		return new FloatUnitVector(this);
	}
	public FloatVector asFloatVector() {
		return super.asFloatVector();
	}
	public IntegerVector asIntegerVector() {
		return super.asIntegerVector();
	}
	public ByteVector asByteVector() {
		return super.asByteVector();
	}
	public DoublePoint asPoint() {
		return super.asPoint();
	}
	public FloatPoint asFloatPoint() {
		return super.asFloatPoint();
	}
	public IntegerPoint asIntegerPoint() {
		return super.asIntegerPoint();
	}
	public BytePoint asBytePoint() {
		return super.asBytePoint();
	}
	
	public DoubleUnitVector setComponent(int component, double value) {
		double[] result = new double[dimension];
		System.arraycopy(array, 0, result, 0, dimension);
		
		result[component] = value;
		
		return new DoubleUnitVector(result);
	}
	
	
	public double norm() {
		return 1d;
	}
	public DoubleUnitVector invert() {
		DoubleUnitVector result = new DoubleUnitVector(this);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = -result.array[i];
		}
		
		return result;
	}
	public DoubleUnitVector unitVector() {
		return this;
	}
	
	public DoubleVector add(DoubleVector summand) {
		return super.add(summand);
	}
	public DoubleVector add(FloatVector summand) {
		return super.add(summand);
	}
	public DoubleVector add(IntegerVector summand) {
		return super.add(summand);
	}
	public DoubleVector add(ByteVector summand) {
		return super.add(summand);
	}
	public DoubleVector subtract(DoubleVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public DoubleVector subtract(FloatVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public DoubleVector subtract(IntegerVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public DoubleVector subtract(ByteVector subtrahend) {
		return super.subtract(subtrahend);
	}
	public DoubleVector scalarMultiply(double factor) {
		return super.scalarMultiply(factor);
	}
	public DoubleVector scalarDivide(double divisor) {
		return super.scalarDivide(divisor);
	}
	
	public double scalarProduct(DoubleVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public double scalarProduct(FloatVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public double scalarProduct(IntegerVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public double scalarProduct(ByteVector multiplicand) {
		return super.scalarProduct(multiplicand);
	}
	public DoubleVector crossProduct(DoubleVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public DoubleVector crossProduct(FloatVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public DoubleVector crossProduct(IntegerVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	public DoubleVector crossProduct(ByteVector... multiplicands) {
		return super.crossProduct(multiplicands);
	}
	
	public DoubleVector matrixMultiply(DoubleMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public DoubleVector matrixMultiply(FloatMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public DoubleVector matrixMultiply(IntegerMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	public DoubleVector matrixMultiply(ByteMatrix multiplicand) {
		return super.matrixMultiply(multiplicand);
	}
	
}