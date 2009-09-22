package math;

import java.util.Arrays;
import java.util.Iterator;


public class FloatPoint implements Iterable<Float> {
	
	public final int dimension;
	
	protected final float[] array;
	
	
	public FloatPoint(int dimension) {
		this.dimension = dimension;
		
		array = new float[dimension];
	}
	public FloatPoint(double... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (float) point[i];
		}
	}
	public FloatPoint(float... point) {
		this(point.length);
		
		System.arraycopy(point, 0, array, 0, dimension);
	}
	public FloatPoint(long... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public FloatPoint(int... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public FloatPoint(short... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public FloatPoint(byte... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = point[i];
		}
	}
	public FloatPoint(DoublePoint point) {
		this(point.array);
	}
	public FloatPoint(FloatPoint point) {
		this(point.array);
	}
	public FloatPoint(IntegerPoint point) {
		this(point.array);
	}
	public FloatPoint(BytePoint point) {
		this(point.array);
	}
	public FloatPoint(DoubleVector vector) {
		this(vector.array);
	}
	public FloatPoint(FloatVector vector) {
		this(vector.array);
	}
	public FloatPoint(IntegerVector vector) {
		this(vector.array);
	}
	public FloatPoint(ByteVector vector) {
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
		if (!(obj instanceof FloatPoint)) return false;
		
		FloatPoint point = (FloatPoint) obj;
		
		if (dimension != point.dimension) return false;
		
		return Arrays.equals(array, point.array);
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
	public DoublePoint asDoublePoint() {
		return new DoublePoint(this);
	}
	public IntegerPoint asIntegerPoint() {
		return new IntegerPoint(this);
	}
	public BytePoint asBytePoint() {
		return new BytePoint(this);
	}
	public DoubleVector asDoubleVector() {
		return new DoubleVector(this);
	}
	public FloatVector asVector() {
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
	public FloatPoint setComponent(int component, float value) {
		FloatPoint result = new FloatPoint(this);
		
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
	public FloatPoint add(IntegerVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] + summand.array[i];
		}
		
		return result;
	}
	public FloatPoint add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
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
	public FloatPoint subtract(IntegerVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
		}
		
		return result;
	}
	public FloatPoint subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		FloatPoint result = new FloatPoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = array[i] - subtrahend.array[i];
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