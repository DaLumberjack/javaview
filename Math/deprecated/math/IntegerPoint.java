package math;

import java.util.Arrays;
import java.util.Iterator;


public class IntegerPoint implements Iterable<Integer> {
	
	public final int dimension;
	
	protected final int[] array;
	
	
	public IntegerPoint(int dimension) {
		this.dimension = dimension;
		
		array = new int[dimension];
	}
	public IntegerPoint(double... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (int) point[i];
		}
	}
	public IntegerPoint(float... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (int) point[i];
		}
	}
	public IntegerPoint(long... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (int) point[i];
		}
	}
	public IntegerPoint(int... point) {
		this(point.length);
		
		System.arraycopy(point, 0, array, 0, dimension);
	}
	public IntegerPoint(short... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public IntegerPoint(byte... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public IntegerPoint(DoublePoint point) {
		this(point.array);
	}
	public IntegerPoint(FloatPoint point) {
		this(point.array);
	}
	public IntegerPoint(IntegerPoint point) {
		this(point.array);
	}
	public IntegerPoint(BytePoint point) {
		this(point.array);
	}
	public IntegerPoint(DoubleVector vector) {
		this(vector.array);
	}
	public IntegerPoint(FloatVector vector) {
		this(vector.array);
	}
	public IntegerPoint(IntegerVector vector) {
		this(vector.array);
	}
	public IntegerPoint(ByteVector vector) {
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
		if (!(obj instanceof IntegerPoint)) return false;
		
		IntegerPoint point = (IntegerPoint) obj;
		
		if (dimension != point.dimension) return false;
		
		return Arrays.equals(array, point.array);
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public int component(int component) {
		return array[component];
	}
	public Iterator<Integer> iterator() {
		return new DefaultIterator();
	}
	public DoublePoint asDoublePoint() {
		return new DoublePoint(this);
	}
	public FloatPoint asFloatPoint() {
		return new FloatPoint(this);
	}
	public BytePoint asBytePoint() {
		return new BytePoint(this);
	}
	public DoubleVector asDoubleVector() {
		return new DoubleVector(this);
	}
	public FloatVector asFloatVector() {
		return new FloatVector(this);
	}
	public IntegerVector asVector() {
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
	public FloatPoint setComponent(int component, float value) {
		FloatPoint result = new FloatPoint(this);
		
		result.array[component] = value;
		
		return result;
	}
	public IntegerPoint setComponent(int component, int value) {
		IntegerPoint result = new IntegerPoint(this);
		
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
	public FloatPoint add(FloatVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public IntegerPoint add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		IntegerPoint result = new IntegerPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public IntegerPoint add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		IntegerPoint result = new IntegerPoint(dimension);
		
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
	public FloatPoint subtract(FloatVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public IntegerPoint subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		IntegerPoint result = new IntegerPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public IntegerPoint subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		IntegerPoint result = new IntegerPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	
	
	private class DefaultIterator implements Iterator<Integer> {
		private int element;
		
		public DefaultIterator() {}
		
		public boolean hasNext() {
			return element < dimension;
		}
		public Integer next() {
			return array[element++];
		}
		public void remove() {
			throw new RuntimeException("Opperation not supported!");
		}
	}
	
}