package math;

import java.util.Arrays;
import java.util.Iterator;


public class FloatVector implements Iterable<Float> {
	
	public final int dimension;
	
	protected final float[] array;
	
	protected boolean normCalced;
	protected double norm;
	
	
	public FloatVector(int dimension) {
		this.dimension = dimension;
		
		array = new float[dimension];
	}
	public FloatVector(double... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) vector[i];
		}
	}
	public FloatVector(float... vector) {
		this(vector.length);
		
		System.arraycopy(vector, 0, array, 0, dimension);
	}
	public FloatVector(long... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public FloatVector(int... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public FloatVector(short... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public FloatVector(byte... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public FloatVector(DoubleVector vector) {
		this(vector.array);
	}
	public FloatVector(FloatVector vector) {
		this(vector.array);
	}
	public FloatVector(IntegerVector vector) {
		this(vector.array);
	}
	public FloatVector(ByteVector vector) {
		this(vector.array);
	}
	public FloatVector(DoublePoint point) {
		this(point.array);
	}
	public FloatVector(FloatPoint point) {
		this(point.array);
	}
	public FloatVector(IntegerPoint point) {
		this(point.array);
	}
	public FloatVector(BytePoint point) {
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
		if (!(obj instanceof FloatVector)) return false;
		
		FloatVector vector = (FloatVector) obj;
		
		if (dimension != vector.dimension) return false;
		
		return Arrays.equals(array, vector.array);
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public float component(int component) {
		return array[component];
	}
	public Iterator<Float> iterator() {
		return new DefaultIterator();
	}
	public DoubleVector asDoubleVector() {
		return new DoubleVector(this);
	}
	public IntegerVector asIntegerVector() {
		return new IntegerVector(this);
	}
	public ByteVector asByteVector() {
		return new ByteVector(this);
	}
	public DoublePoint asDoublePoint() {
		return new DoublePoint(this);
	}
	public FloatPoint asPoint() {
		return new FloatPoint(this);
	}
	public IntegerPoint asIntegerPoint() {
		return new IntegerPoint(this);
	}
	public BytePoint asBytePoint() {
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
	
	
	public double norm() {
		if (normCalced) return norm;
		
		normCalced = true;
		return norm = Math.sqrt(scalarProduct(this));
	}
	public FloatVector invert() {
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = -array[i];
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
	public FloatVector add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public FloatVector add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
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
	public FloatVector subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public FloatVector subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
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
	public DoubleVector scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	public FloatVector scalarDivide(float divisor) {
		return scalarMultiply(1f / divisor);
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
	public float scalarProduct(IntegerVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		float result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public float scalarProduct(ByteVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		float result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public DoubleVector crossProduct(DoubleVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length + 1];
		
		newMultiplicands[0] = asDoubleVector();
		System.arraycopy(multiplicands, 0, newMultiplicands, 1, multiplicands.length);
		
		return DoubleVector.crossProductAll(newMultiplicands);
	}
	public FloatVector crossProduct(FloatVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		System.arraycopy(multiplicands, 0, newMultiplicands, 1, multiplicands.length);
		
		return crossProductAll(newMultiplicands);
	}
	public FloatVector crossProduct(IntegerVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asFloatVector();
		}
		
		return crossProductAll(newMultiplicands);
	}
	public FloatVector crossProduct(ByteVector... multiplicands) {
		FloatVector[] newMultiplicands = new FloatVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asFloatVector();
		}
		
		return crossProductAll(newMultiplicands);
	}
	protected static FloatVector crossProductAll(FloatVector... multiplicands) {
		int dimension = multiplicands.length + 1;
		
		if (dimension == 3) return multiplicands[0].crossProduct3D(multiplicands[1]);
		
		FloatVector nullVector = new FloatVector(dimension);
		FloatVector result = nullVector;
		
		FloatMatrix matrix = new FloatMatrix(true, multiplicands);
		float determinat;
		
		for (int row = 0; row < dimension; row++) {
			determinat = matrix.strikeRow(row).determinant();
			if ((row & 1) == 1) determinat = -determinat;
			
			result = result.add(nullVector.setComponent(row, 1f).scalarMultiply(determinat));
		}
		
		return result;
	}
	private FloatVector crossProduct3D(FloatVector multiplicand) {
		FloatVector result = new FloatVector(3);
		
		result.array[0] = array[1] * multiplicand.array[2] - array[2] * multiplicand.array[1];
		result.array[1] = array[2] * multiplicand.array[0] - array[0] * multiplicand.array[2];
		result.array[2] = array[0] * multiplicand.array[1] - array[1] * multiplicand.array[0];

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
	public FloatVector matrixMultiply(IntegerMatrix multiplicand) {
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
	public FloatVector matrixMultiply(ByteMatrix multiplicand) {
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
	
	
	private class DefaultIterator implements Iterator<Float> {
		private int element;
		
		public DefaultIterator() {}
		
		public boolean hasNext() {
			return element < dimension;
		}
		public Float next() {
			return array[element++];
		}
		public void remove() {
			throw new RuntimeException("Opperation not supported!");
		}
	}
	
}