package math;

import java.util.Arrays;
import java.util.Iterator;


public class DoubleVector implements Iterable<Double> {
	
	public final int dimension;
	
	protected final double[] array;
	
	protected boolean normCalced;
	protected double norm;
	
	
	public DoubleVector(int dimension) {
		// TODO Exception
		if (dimension < 1) throw new IllegalArgumentException("");
		
		this.dimension = dimension;
		
		array = new double[dimension];
	}
	public DoubleVector(double... vector) {
		this(vector.length);
		
		System.arraycopy(vector, 0, array, 0, dimension);
	}
	public DoubleVector(float... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public DoubleVector(long... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public DoubleVector(int... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public DoubleVector(short... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public DoubleVector(byte... vector) {
		this(vector.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = vector[i];
		}
	}
	public DoubleVector(DoubleVector vector) {
		this(vector.array);
	}
	public DoubleVector(FloatVector vector) {
		this(vector.array);
	}
	public DoubleVector(IntegerVector vector) {
		this(vector.array);
	}
	public DoubleVector(ByteVector vector) {
		this(vector.array);
	}
	public DoubleVector(DoublePoint point) {
		this(point.array);
	}
	public DoubleVector(FloatPoint point) {
		this(point.array);
	}
	public DoubleVector(IntegerPoint point) {
		this(point.array);
	}
	public DoubleVector(BytePoint point) {
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
		if (!(obj instanceof DoubleVector)) return false;
		
		DoubleVector vector = (DoubleVector) obj;
		
		if (dimension != vector.dimension) return false;
		
		return Arrays.equals(array, vector.array);
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public double component(int component) {
		return array[component];
	}
	public Iterator<Double> iterator() {
		return new DefaultIterator();
	}
	public FloatVector asFloatVector() {
		return new FloatVector(this);
	}
	public IntegerVector asIntegerVector() {
		return new IntegerVector(this);
	}
	public ByteVector asByteVector() {
		return new ByteVector(this);
	}
	public DoublePoint asPoint() {
		return new DoublePoint(this);
	}
	public FloatPoint asFloatPoint() {
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
	
	
	public double norm() {
		if (normCalced) return norm;
		
		normCalced = true;
		return norm = Math.sqrt(scalarProduct(this));
	}
	public DoubleVector invert() {
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = -array[i];
		}
		
		return result;
	}
	public DoubleUnitVector unitVector() {
		return new DoubleUnitVector(this);
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
	public DoubleVector add(FloatVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoubleVector add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoubleVector add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
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
	public DoubleVector subtract(FloatVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public DoubleVector subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public DoubleVector subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(dimension);
		
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
	public DoubleVector scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
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
	public double scalarProduct(FloatVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		double result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public double scalarProduct(IntegerVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		double result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public double scalarProduct(ByteVector multiplicand) {
		// TODO Exception
		if (dimension != multiplicand.dimension) throw new IllegalArgumentException("");
		
		double result = 0;
		
		for (int i = 0; i < dimension; i++) {
			result += array[i] * multiplicand.array[i];
		}
		
		return result;
	}
	public DoubleVector crossProduct(DoubleVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		System.arraycopy(multiplicands, 0, newMultiplicands, 1, multiplicands.length);
		
		return crossProductAll(newMultiplicands);
	}
	public DoubleVector crossProduct(FloatVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asDoubleVector();
		}
		
		return crossProductAll(newMultiplicands);
	}
	public DoubleVector crossProduct(IntegerVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length + 1];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asDoubleVector();
		}
		
		return crossProductAll(newMultiplicands);
	}
	public DoubleVector crossProduct(ByteVector... multiplicands) {
		DoubleVector[] newMultiplicands = new DoubleVector[multiplicands.length];
		
		newMultiplicands[0] = this;
		
		for (int i = 1; i < multiplicands.length; i++) {
			newMultiplicands[i] = multiplicands[i].asDoubleVector();
		}
		
		return crossProductAll(newMultiplicands);
	}
	protected static DoubleVector crossProductAll(DoubleVector... multiplicands) {
		int dimension = multiplicands.length + 1;
		
		if (dimension == 3) return multiplicands[0].crossProduct3D(multiplicands[1]);
		
		DoubleVector nullVector = new DoubleVector(dimension);
		DoubleVector result = nullVector;
		
		DoubleMatrix matrix = new DoubleMatrix(true, multiplicands);
		double determinat;
		
		for (int row = 0; row < dimension; row++) {
			determinat = matrix.strikeRow(row).determinant();
			if ((row & 1) == 1) determinat = -determinat;
			
			result = result.add(nullVector.setComponent(row, 1d).scalarMultiply(determinat));
		}
		
		return result;
	}
	private DoubleVector crossProduct3D(DoubleVector multiplicand) {
		DoubleVector result = new DoubleVector(3);
		
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
	public DoubleVector matrixMultiply(FloatMatrix multiplicand) {
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
	public DoubleVector matrixMultiply(IntegerMatrix multiplicand) {
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
	public DoubleVector matrixMultiply(ByteMatrix multiplicand) {
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
	
	
	private class DefaultIterator implements Iterator<Double> {
		private int element;
		
		public DefaultIterator() {}
		
		public boolean hasNext() {
			return element < dimension;
		}
		public Double next() {
			return array[element++];
		}
		public void remove() {
			throw new RuntimeException("Opperation not supported!");
		}
	}
	
}