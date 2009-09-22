package math;

import java.util.Arrays;
import java.util.Iterator;


public class BytePoint implements Iterable<Byte> {
	
	public final int dimension;
	
	protected final byte[] array;
	
	
	public BytePoint(int dimension) {
		this.dimension = dimension;
		
		array = new byte[dimension];
	}
	public BytePoint(double... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) point[i];
		}
	}
	public BytePoint(float... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) point[i];
		}
	}
	public BytePoint(long... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) point[i];
		}
	}
	public BytePoint(int... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) point[i];
		}
	}
	public BytePoint(short... point) {
		this(point.length);
		
		for (int i = 0; i < dimension; i++) {
			array[i] = (byte) point[i];
		}
	}
	public BytePoint(byte... point) {
		this(point.length);
		
		System.arraycopy(point, 0, array, 0, dimension);
	}
	public BytePoint(DoublePoint point) {
		this(point.array);
	}
	public BytePoint(FloatPoint point) {
		this(point.array);
	}
	public BytePoint(IntegerPoint point) {
		this(point.array);
	}
	public BytePoint(BytePoint point) {
		this(point.array);
	}
	public BytePoint(DoubleVector vector) {
		this(vector.array);
	}
	public BytePoint(FloatVector vector) {
		this(vector.array);
	}
	public BytePoint(IntegerVector vector) {
		this(vector.array);
	}
	public BytePoint(ByteVector vector) {
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
		if (!(obj instanceof BytePoint)) return false;
		
		BytePoint point = (BytePoint) obj;
		
		if (dimension != point.dimension) return false;
		
		return Arrays.equals(array, point.array);
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public int component(int component) {
		return array[component];
	}
	public Iterator<Byte> iterator() {
		return new DefaultIterator();
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
	public DoubleVector asDoubleVector() {
		return new DoubleVector(this);
	}
	public FloatVector asFloatVector() {
		return new FloatVector(this);
	}
	public IntegerVector asIntegerVector() {
		return new IntegerVector(this);
	}
	public ByteVector asVector() {
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
	public BytePoint setComponent(int component, byte value) {
		BytePoint result = new BytePoint(this);
		
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
	public BytePoint add(ByteVector summand) {
		// TODO Exception
		if (dimension != summand.dimension) throw new IllegalArgumentException("");
		
		BytePoint result = new BytePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] + summand.array[i]);
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
	public BytePoint subtract(ByteVector subtrahend) {
		// TODO Exception
		if (dimension != subtrahend.dimension) throw new IllegalArgumentException("");
		
		BytePoint result = new BytePoint(dimension);
		
		for (int i = 0; i < dimension; i++) {
			result.array[i] = (byte) (array[i] - subtrahend.array[i]);
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