package math;

import java.util.Arrays;
import java.util.Iterator;


public class ByteMatrix implements Iterable<Byte> {
	
	public final int rows;
	public final int columns;
	
	protected final byte[][] array;
	
	protected boolean determinantCalced;
	protected int determinant;
	
	
	public ByteMatrix(int rows, int columns) {
		// TODO Exception
		if (rows < 1) throw new IllegalArgumentException("");
		if (columns < 1) throw new IllegalArgumentException("");
		
		this.rows = rows;
		this.columns = columns;
		
		array = new byte[rows][columns];
	}
	public ByteMatrix(double[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix[row][column];
			}
		}
	}
	public ByteMatrix(float[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix[row][column];
			}
		}
	}
	public ByteMatrix(long[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix[row][column];
			}
		}
	}
	public ByteMatrix(int[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix[row][column];
			}
		}
	}
	public ByteMatrix(short[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix[row][column];
			}
		}
	}
	public ByteMatrix(byte[]... matrix) {
		// TODO Exception
		this(matrix.length, matrix[0].length);
		
		for (int row = 0; row < rows; row++) {
			if (matrix[row].length != columns) throw new IllegalArgumentException("");
			
			System.arraycopy(matrix[row], 0, array[row], 0, columns);
		}
	}
	public ByteMatrix(DoubleMatrix matrix) {
		this(matrix.array);
	}
	public ByteMatrix(FloatMatrix matrix) {
		this(matrix.array);
	}
	public ByteMatrix(IntegerMatrix matrix) {
		this(matrix.array);
	}
	public ByteMatrix(ByteMatrix matrix) {
		this(matrix.array);
	}
	public ByteMatrix(boolean columnVector, DoubleVector... vectors) {
		// TODO Exception
		this(columnVector ? vectors[0].dimension : vectors.length,
				columnVector ? vectors.length : vectors[0].dimension);
		
		if (columnVector) {
			for (int column = 0; column < columns; column++) {
				if (vectors[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vectors[column].array[row];
				}
			}
		} else {
			for (int row = 0; row < rows; row++) {
				if (vectors[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vectors[row].array[column];
				}
			}
		}
	}
	public ByteMatrix(boolean columnVector, FloatVector... vectors) {
		// TODO Exception
		this(columnVector ? vectors[0].dimension : vectors.length,
				columnVector ? vectors.length : vectors[0].dimension);
		
		if (columnVector) {
			for (int column = 0; column < columns; column++) {
				if (vectors[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vectors[column].array[row];
				}
			}
		} else {
			for (int row = 0; row < rows; row++) {
				if (vectors[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vectors[row].array[column];
				}
			}
		}
	}
	public ByteMatrix(boolean columnVector, IntegerVector... vectors) {
		// TODO Exception
		this(columnVector ? vectors[0].dimension : vectors.length,
				columnVector ? vectors.length : vectors[0].dimension);
		
		if (columnVector) {
			for (int column = 0; column < columns; column++) {
				if (vectors[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vectors[column].array[row];
				}
			}
		} else {
			for (int row = 0; row < rows; row++) {
				if (vectors[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vectors[row].array[column];
				}
			}
		}
	}
	public ByteMatrix(boolean columnVector, ByteVector... vectors) {
		// TODO Exception
		this(columnVector ? vectors[0].dimension : vectors.length,
				columnVector ? vectors.length : vectors[0].dimension);
		
		if (columnVector) {
			for (int column = 0; column < columns; column++) {
				if (vectors[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = vectors[column].array[row];
				}
			}
		} else {
			for (int row = 0; row < rows; row++) {
				if (vectors[row].dimension != columns) throw new IllegalArgumentException("");
				
				System.arraycopy(vectors[row].array, 0, array[row], 0, columns);
			}
		}
	}
	
	
	public String toString() {
		String result = "";
		
		for (int row = 0; row < rows; row++) {
			result += Arrays.toString(array[row]);
			if (row < rows - 1) result += System.getProperty("line.separator");
		}
		
		return result;
	}
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		if (!(obj instanceof ByteMatrix)) return false;
		
		ByteMatrix matrix = (ByteMatrix) obj;
		
		if (rows != matrix.rows) return false;
		if (columns != matrix.columns) return false;
		
		for (int row = 0; row < rows; row++) {
			if (!Arrays.equals(array[row], matrix.array[row])) return false;
		}
		
		return true;
	}
	public int hashCode() {
		return Arrays.hashCode(array);
	}
	
	
	public byte component(int row, int column) {
		return array[row][column];
	}
	public Iterator<Byte> iterator() {
		return new DefaultIterator();
	}
	public DoubleMatrix asDoubleMatrix() {
		return new DoubleMatrix(this);
	}
	public FloatMatrix asFloatMatrix() {
		return new FloatMatrix(this);
	}
	public IntegerMatrix asIntegerMatrix() {
		return new IntegerMatrix(this);
	}
	
	public DoubleMatrix setComponent(int row, int column, double value) {
		DoubleMatrix result = new DoubleMatrix(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public FloatMatrix setComponent(int row, int column, float value) {
		FloatMatrix result = new FloatMatrix(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public IntegerMatrix setComponent(int row, int column, int value) {
		IntegerMatrix result = new IntegerMatrix(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public ByteMatrix setComponent(int row, int column, byte value) {
		ByteMatrix result = new ByteMatrix(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	
	
	public int determinant() {
		// TODO Exception
		if (rows != columns) throw new IllegalArgumentException();
		
		if (determinantCalced) return determinant;
		
		if (rows == 1) return array[0][0];
		if (rows == 2) return determinant2D();
		if (rows == 3) return determinant3D();
		
		int result = 0;
		int tmp;
		
		for (int row = 0; row < rows; row++) {
			if (array[row][0] == 0f) continue;
			tmp = array[row][0] * strikeRowColumn(row, 0).determinant();
			
			if ((row & 1) == 0) result += tmp;
			else result -= tmp;
		}
		
		return determinant = result;
	}
	private int determinant2D() {
		return	array[0][0] * array[1][1] -
				array[1][0] * array[0][1];
	}
	private int determinant3D() {
		return	array[0][0] * array[1][1] * array[2][2] +
				array[1][0] * array[2][1] * array[0][2] +
				array[2][0] * array[0][1] * array[1][2] -
				array[2][0] * array[1][1] * array[0][2] -
				array[1][0] * array[0][1] * array[2][2] -
				array[0][0] * array[2][1] * array[1][2];
	}
	public ByteMatrix invert() {
		ByteMatrix result = new ByteMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) -array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix transpose() {
		ByteMatrix result = new ByteMatrix(columns, rows);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[column][row] = array[row][column];
			}
		}
		
		return result;
	}
	
	public DoubleMatrix add(DoubleMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix add(FloatMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		FloatMatrix result = new FloatMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix add(IntegerMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		IntegerMatrix result = new IntegerMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix add(ByteMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] + summand.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix subtract(DoubleMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix subtract(FloatMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		FloatMatrix result = new FloatMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix subtract(IntegerMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		IntegerMatrix result = new IntegerMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix subtract(ByteMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] - subtrahend.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix scalarMultiply(double factor) {
		DoubleMatrix result = new DoubleMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public FloatMatrix scalarMultiply(float factor) {
		FloatMatrix result = new FloatMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public IntegerMatrix scalarMultiply(int factor) {
		IntegerMatrix result = new IntegerMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public ByteMatrix scalarMultiply(byte factor) {
		ByteMatrix result = new ByteMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] * factor);
			}
		}
		
		return result;
	}
	public DoubleMatrix scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	public FloatMatrix scalarDivide(float divisor) {
		return scalarMultiply(1f / divisor);
	}
	public IntegerMatrix scalarDivide(int divisor) {
		IntegerMatrix result = new IntegerMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] / divisor;
			}
		}
		
		return result;
	}
	public ByteMatrix scalarDivide(byte divisor) {
		ByteMatrix result = new ByteMatrix(rows, columns);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] / divisor);
			}
		}
		
		return result;
	}
	
	public ByteMatrix strikeRow(int row) {
		// TODO Exception
		if ((row < 0) || (row >= rows)) throw new IllegalArgumentException("");
		if (rows == 1) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows - 1, columns);
		
		int offsetRow = 0;
		
		for (int newRow = 0; newRow < result.rows; newRow++) {
			if (newRow == row) offsetRow++;
			
			result.array[newRow] = array[newRow + offsetRow];
		}
		
		return result;
	}
	public ByteMatrix strikeColumn(int column) {
		// TODO Exception
		if ((column < 0) || (column >= columns)) throw new IllegalArgumentException("");
		if (columns == 1) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows, columns - 1);
		
		int offsetColumn = 0;
		
		for (int row = 0; row < rows; row++) {
			offsetColumn = 0;
			
			for (int newColumn = 0; newColumn < result.columns; newColumn++) {
				if (newColumn == column) offsetColumn++;
				
				result.array[row][newColumn] = array[row][newColumn + offsetColumn];
			}
		}
		
		return result;
	}
	public ByteMatrix strikeRowColumn(int row, int column) {
		// TODO Exception
		if ((row < 0) || (row >= rows)) throw new IllegalArgumentException("");
		if (rows == 1) throw new IllegalArgumentException("");
		if ((column < 0) || (column >= columns)) throw new IllegalArgumentException("");
		if (columns == 1) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows - 1, columns - 1);
		
		int offsetRow = 0;
		int offsetColumn = 0;
		
		for (int newRow = 0; newRow < result.rows; newRow++) {
			if (newRow == row) offsetRow++;
			
			offsetColumn = 0;
			
			for (int newColumn = 0; newColumn < result.columns; newColumn++) {
				if (newColumn == column) offsetColumn++;
				
				result.array[newRow][newColumn] = array[newRow + offsetRow][newColumn + offsetColumn];
			}
		}
		
		return result;
	}
	
	public DoubleMatrix matrixMultiply(DoubleMatrix multiplicand) {
		// TODO Exception
		if (columns != multiplicand.rows) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(rows, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public FloatMatrix matrixMultiply(FloatMatrix multiplicand) {
		// TODO Exception
		if (columns != multiplicand.rows) throw new IllegalArgumentException("");
		
		FloatMatrix result = new FloatMatrix(rows, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public IntegerMatrix matrixMultiply(IntegerMatrix multiplicand) {
		// TODO Exception
		if (columns != multiplicand.rows) throw new IllegalArgumentException("");
		
		IntegerMatrix result = new IntegerMatrix(rows, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public ByteMatrix matrixMultiply(ByteMatrix multiplicand) {
		// TODO Exception
		if (columns != multiplicand.rows) throw new IllegalArgumentException("");
		
		ByteMatrix result = new ByteMatrix(rows, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public DoubleVector matrixMultiply(DoubleVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector result = new DoubleVector(rows);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public FloatVector matrixMultiply(FloatVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		FloatVector result = new FloatVector(rows);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public IntegerVector matrixMultiply(IntegerVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		IntegerVector result = new IntegerVector(rows);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public ByteVector matrixMultiply(ByteVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		ByteVector result = new ByteVector(rows);
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	
	
	private class DefaultIterator implements Iterator<Byte> {
		private final int lastElement;
		private int element;
		
		public DefaultIterator() {
			lastElement = rows * columns;
		}
		
		public boolean hasNext() {
			return element < lastElement;
		}
		public Byte next() {
			return array[element / columns][element++ % columns];
		}
		public void remove() {
			throw new RuntimeException("Opperation not supported!");
		}
	}
	
}