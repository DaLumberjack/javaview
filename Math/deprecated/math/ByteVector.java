package math;

import java.util.Arrays;
import java.util.Iterator;


public class ByteVector implements Iterable<Byte> {
	
	public final int dimension;
	
	protected final byte[] array;
	
	protected boolean normCalced;
	protected double norm;
	
	
	public ByteVector(int dimension) {
		this.dimension = dimension;
		
		array = new byte[dimension];
	}
	public ByteVector(double... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) vector[i];
		}
	}
	public ByteVector(float... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) vector[i];
		}
	}
	public ByteVector(long... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) vector[i];
		}
	}
	public ByteVector(int... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) vector[i];
		}
	}
	public ByteVector(short... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) vector[i];
		}
	}
	public ByteVector(byte... vector) {
		this(vector.length);
		
		System.arraycopy(vector, 0, array, 0, dimension);
	}
	public ByteVector(DoubleVector vector) {
		this(vector.array);
	}
	public ByteVector(FloatVector vector) {
		this(vector.array);
	}
	public ByteVector(IntegerVector vector) {
		this(vector.array);
	}
	public ByteVector(ByteVector vector) {
		this(vector.array);
	}
	public ByteVector(DoublePoint point) {
		this(point.array);
	}
	public ByteVector(FloatPoint point) {
		this(point.array);
	}
	public ByteVector(IntegerPoint point) {
		this(point.array);
	}
	public ByteVector(BytePoint point) {
		this(point.array);
	}
	
	
	public String toString() {
		String result = "(";
		
		for (int i = 0; i < dimension; i++) {
			result += array[i];
			if (i < dimension - 1) result += ", ";
		}
		
		return result + ")";
	}
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		if (!(obj instanceof ByteVector)) return false;
		
		ByteVector vector = (ByteVector) obj;
		
		if (dimension != vector.dimension) return false;
		
		return Arrays.equals(array, vector.array);
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public byte component(int component) {
		return array[component];
	}
	public Iterator<Byte> iterator() {
		return new DefaultIterator();
	}
	public DoubleVector asDoubleVector() {
		return new DoubleVector(this);
	}
	public FloatVector asFloatVector() {
		return new FloatVector(this);
	}
	public IntegerVector asIntegerVector() {
		return new IntegerVector(this);
	}
	public DoublePoint asDoublePoint() {
		return new DoublePoint(this);
	}
	public FloatPoint asFloatPoint() {
		return new FloatPoint(this);
	}
	public IntegerPoint asIntegerPoint() {
		return new IntegerPoint(this);
	}
	public BytePoint asPoint() {
		return new BytePoint(this);
	}
	
	public DoubleVector setComponent(int component, double value) {
		DoubleVector result = new DoubleVector(this);
		
		result.array[component] = value;
		
		return result;
	}
	public FloatVector setComponent(int component, float value) {
		FloatVector result = new FloatVector(this);
		
		result.array[component] = value;
		
		return result;
	}
	public IntegerVector setComponent(int component, int value) {
		IntegerVector result = new IntegerVector(this);
		
		result.array[component] = value;
		
		return result;
	}
	public ByteVector setComponent(int component, byte value) {
		ByteVector result = new ByteVector(this);
		
		result.array[component] = value;
		
		return result;
	}
	
	
	public double norm() {
		if (normCalced) return norm;
		
		normCalced = true;
		return norm = Math.sqrt(scalarProduct(this));
	}
	public ByteVector invert() {
		ByteVector result = new ByteVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) -array[i];
		}
		
		return result;
	}
	public FloatUnitVector unitVector() {
		return new FloatUnitVector(this);
	}
	
	public DoubleVector add(DoubleVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public FloatVector add(FloatVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public IntegerVector add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		IntegerVector result = new IntegerVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public ByteVector add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		ByteVector result = new ByteVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] + summand.array[i]);
		}
		
		return result;
	}
	public DoubleVector subtract(DoubleVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public FloatVector subtract(FloatVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public IntegerVector subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		IntegerVector result = new IntegerVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public ByteVector subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		ByteVector result = new ByteVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] - subtrahend.array[i]);
		}
		
		return result;
	}
	public DoubleVector scalarMultiply(double factor) {
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] * factor;
		}
		
		return result;
	}
	public FloatVector scalarMultiply(float factor) {
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] * factor;
		}
		
		return result;
	}
	public IntegerVector scalarMultiply(int factor) {
		IntegerVector result = new IntegerVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] * factor;
		}
		
		return result;
	}
	public ByteVector scalarMultiply(byte factor) {
		ByteVector result = new ByteVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] * factor);
		}
		
		return result;
	}
	public DoubleVector scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	public FloatVector scalarDivide(float divisor) {
		return scalarMultiply(1f / divisor);
	}
	public IntegerVector scalarDivide(int divisor) {
		IntegerVector result = new IntegerVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] / divisor;
		}
		
		return result;
	}
	public ByteVector scalarDivide(byte divisor) {
		ByteVector result = new ByteVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] / divisor);
		}
		
		return result;
	}
	
	public double scalarProduct(DoubleVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		double result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public float scalarProduct(FloatVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		float result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public int scalarProduct(IntegerVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		int result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public byte scalarProduct(ByteVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		byte result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public DoubleVector crossProduct(DoubleVector... multiplicands) {
		return asDoubleVector().crossProduct(multiplicands);
	}
	public FloatVector crossProduct(FloatVector... multiplicands) {
		return asFloatVector().crossProduct(multiplicands);
	}
	public IntegerVector crossProduct(IntegerVector... multiplicands) {
		return asIntegerVector().crossProduct(multiplicands);
	}
	public ByteVector crossProduct(ByteVector... multiplicands) {
		// TODO Exception
		if (dimension != (multiplicands.length + 2)) throw new IllegalArgumentException("");
		for (ByteVector vector : multiplicands) {
			if (dimension != vector.dimension) throw new IllegalArgumentException("");
		}
		
		if (dimension == 3) return crossProduct3D(multiplicands[0]);
		
		ByteVector nullVector = new ByteVector(dimension);
		ByteVector result = nullVector;
		
		ByteVector[] columns = new ByteVector[dimension - 1];
		columns[0] = this;
		System.arraycopy(multiplicands, 0, columns, 1, multiplicands.length);
		
		FloatMatrix matrix = new FloatMatrix(true, columns);
		byte determinat;
		
		for (int row = 0; row < dimension; row++) {
			determinat = (byte) matrix.strikeRow(row).determinant();
			if ((row & 1) == 1) determinat = (byte) -determinat;
			
			result = result.add(nullVector.setComponent(row, (byte) 1).scalarMultiply(determinat));
		}
		
		return result;
	}
	private ByteVector crossProduct3D(ByteVector multiplicand) {
		ByteVector result = new ByteVector(dimension);
		
		result.array[0] = (byte) (array[1] * multiplicand.array[2] - array[2] * multiplicand.array[1]);
		result.array[1] = (byte) (array[2] * multiplicand.array[0] - array[0] * multiplicand.array[2]);
		result.array[2] = (byte) (array[0] * multiplicand.array[1] - array[1] * multiplicand.array[0]);
		
		return result;
	}
	
	public DoubleVector matrixMultiply(DoubleMatrix multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.rows) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(multiplicand.columns);
		
		for (int column = 0; column < dimension; column++) {
			for (int row = 0; row < multiplicand.rows; row++) {
				result.array[column] += array[row] * multiplicand.array[row][column];
			}
		}
		
		return result;
	}
	public FloatVector matrixMultiply(FloatMatrix multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.rows) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(multiplicand.columns);
		
		for (int column = 0; column < dimension; column++) {
			for (int row = 0; row < multiplicand.rows; row++) {
				result.array[column] += array[row] * multiplicand.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerVector matrixMultiply(IntegerMatrix multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.rows) throw new IllegalArgumentException("");
		
		IntegerVector result = new IntegerVector(multiplicand.columns);
		
		for (int column = 0; column < dimension; column++) {
			for (int row = 0; row < multiplicand.rows; row++) {
				result.array[column] += array[row] * multiplicand.array[row][column];
			}
		}
		
		return result;
	}
	public ByteVector matrixMultiply(ByteMatrix multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.rows) throw new IllegalArgumentException("");
		
		ByteVector result = new ByteVector(multiplicand.columns);
		
		for (int column = 0; column < dimension; column++) {
			for (int row = 0; row < multiplicand.rows; row++) {
				result.array[column] += array[row] * multiplicand.array[row][column];
			}
		}
		
		return result;
	}
	
	
	private class DefaultIterator implements Iterator<Byte> {
		private int element;
		
		public DefaultIterator() {}
		
		public boolean hasNext() {
			return element < dimension;
		}
		public Byte next() {
			return array[element++];
		}
		public void remove() {
			throw new RuntimeException("Opperation not supported!");
		}
	}
	
}