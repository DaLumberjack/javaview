package math;

import java.util.Arrays;
import java.util.Iterator;


public class DoublePoint implements Iterable<Double> {
	
	public final int dimension;
	
	protected final double[] array;
	
	
	public DoublePoint(int dimension) {
		this.dimension = dimension;
		
		array = new double[dimension];
	}
	public DoublePoint(double... point) {
		this(point.length);
		
		System.arraycopy(point, 0, array, 0, dimension);
	}
	public DoublePoint(float... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public DoublePoint(long... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public DoublePoint(int... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public DoublePoint(short... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public DoublePoint(byte... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public DoublePoint(DoublePoint point) {
		this(point.array);
	}
	public DoublePoint(FloatPoint point) {
		this(point.array);
	}
	public DoublePoint(IntegerPoint point) {
		this(point.array);
	}
	public DoublePoint(BytePoint point) {
		this(point.array);
	}
	public DoublePoint(DoubleVector vector) {
		this(vector.array);
	}
	public DoublePoint(FloatVector vector) {
		this(vector.array);
	}
	public DoublePoint(IntegerVector vector) {
		this(vector.array);
	}
	public DoublePoint(ByteVector vector) {
		this(vector.array);
	}
	
	
	public String toString() {
		String result = "(";
		
		for (int i = 0; i < dimension; i++) {
			result += array[i];
			if (i < dimension - 1) result += " | ";
		}
		
		return result + ")";
	}
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		if (!(obj instanceof DoublePoint)) return false;
		
		DoublePoint point = (DoublePoint) obj;
		
		if (dimension != point.dimension) return false;
		
		return Arrays.equals(array, point.array);
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
	public FloatPoint asFloatPoint() {
		return new FloatPoint(this);
	}
	public IntegerPoint asIntegerPoint() {
		return new IntegerPoint(this);
	}
	public BytePoint asBytePoint() {
		return new BytePoint(this);
	}
	public DoubleVector asVector() {
		return new DoubleVector(this);
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
	
	public DoublePoint setComponent(int component, double value) {
		DoublePoint result = new DoublePoint(this);
		
		result.array[component] = value;
		
		return result;
	}
	
	
	public DoublePoint add(DoubleVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoublePoint add(FloatVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoublePoint add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoublePoint add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public DoublePoint subtract(DoubleVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public DoublePoint subtract(FloatVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public DoublePoint subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public DoublePoint subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		DoublePoint result = new DoublePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
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