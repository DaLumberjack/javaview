package math;

import java.util.Iterator;


public class ByteMatrix4 extends ByteMatrix {
	
	public ByteMatrix4() {
		super(4, 4);
	}
	public ByteMatrix4(double[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != rows) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4[row][column];
			}
		}
	}
	public ByteMatrix4(float[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4[row][column];
			}
		}
	}
	public ByteMatrix4(long[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != rows) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4[row][column];
			}
		}
	}
	public ByteMatrix4(int[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != rows) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4[row][column];
			}
		}
	}
	public ByteMatrix4(short[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != rows) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4[row][column];
			}
		}
	}
	public ByteMatrix4(byte[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != rows) throw new IllegalArgumentException("");
		
		for (int row = 0; row < rows; row++) {
			if (matrix4[row].length != columns) throw new IllegalArgumentException("");
			
			System.arraycopy(matrix4[row], 0, array[row], 0, columns);
		}
	}
	public ByteMatrix4(DoubleMatrix matrix4) {
		this(matrix4.array);
	}
	public ByteMatrix4(FloatMatrix matrix4) {
		this(matrix4.array);
	}
	public ByteMatrix4(IntegerMatrix matrix4) {
		this(matrix4.array);
	}
	public ByteMatrix4(ByteMatrix matrix4) {
		this(matrix4.array);
	}
	public ByteMatrix4(DoubleMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4.array[row][column];
			}
		}
	}
	public ByteMatrix4(FloatMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4.array[row][column];
			}
		}
	}
	public ByteMatrix4(IntegerMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				array[row][column] = (byte) matrix4.array[row][column];
			}
		}
	}
	public ByteMatrix4(ByteMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < rows; row++) {
			System.arraycopy(matrix4.array[row], 0, array[row], 0, columns);
		}
	}
	public ByteMatrix4(boolean columnVector, DoubleVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				if (vector4Array[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				if (vector4Array[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[row].array[column];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, FloatVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				if (vector4Array[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				if (vector4Array[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[row].array[column];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, IntegerVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				if (vector4Array[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				if (vector4Array[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[row].array[column];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, ByteVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				if (vector4Array[column].dimension != rows) throw new IllegalArgumentException("");
				
				for (int row = 0; row < rows; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				if (vector4Array[row].dimension != columns) throw new IllegalArgumentException("");
				
				System.arraycopy(vector4Array[row].array, 0, array[row], 0, columns);
			}
		}
	}
	public ByteMatrix4(boolean columnVector, DoubleVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, FloatVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, IntegerVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				for (int row = 0; row < rows; row++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				for (int column = 0; column < columns; column++) {
					array[row][column] = (byte) vector4Array[column].array[row];
				}
			}
		}
	}
	public ByteMatrix4(boolean columnVector, ByteVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != columns) throw new IllegalArgumentException("");
			
			for (int column = 0; column < columns; column++) {
				for (int row = 0; row < rows; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				System.arraycopy(vector4Array[row].array, 0, array[row], 0, columns);
			}
		}
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
	
	
	public byte component(int row, int column) {
		return super.component(row, column);
	}
	public Iterator<Byte> iterator() {
		return super.iterator();
	}
	public DoubleMatrix4 asDoubleMatrix() {
		return new DoubleMatrix4(this);
	}
	public FloatMatrix4 asFloatMatrix() {
		return new FloatMatrix4(this);
	}
	public IntegerMatrix4 asIntegerMatrix() {
		return new IntegerMatrix4(this);
	}
	
	public DoubleMatrix4 setComponent(int row, int column, double value) {
		DoubleMatrix4 result = new DoubleMatrix4(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public FloatMatrix4 setComponent(int row, int column, float value) {
		FloatMatrix4 result = new FloatMatrix4(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public IntegerMatrix4 setComponent(int row, int column, int value) {
		IntegerMatrix4 result = new IntegerMatrix4(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	public ByteMatrix4 setComponent(int row, int column, byte value) {
		ByteMatrix4 result = new ByteMatrix4(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	
	
	public int determinant() {
		return super.determinant();
	}
	public ByteMatrix4 invert() {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) -array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix4 transpose() {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[column][row] = array[row][column];
			}
		}
		
		return result;
	}
	
	public DoubleMatrix4 add(DoubleMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix4 add(FloatMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix4 add(IntegerMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix4 add(ByteMatrix summand) {
		// TODO Exception
		if (rows != summand.rows) throw new IllegalArgumentException("");
		if (columns != summand.columns) throw new IllegalArgumentException("");
		
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] + summand.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(DoubleMatrix4 summand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix4 add(FloatMatrix4 summand) {
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix4 add(IntegerMatrix4 summand) {
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix4 add(ByteMatrix4 summand) {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] + summand.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(DoubleMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix4 subtract(FloatMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix4 subtract(IntegerMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix4 subtract(ByteMatrix subtrahend) {
		// TODO Exception
		if (rows != subtrahend.rows) throw new IllegalArgumentException("");
		if (columns != subtrahend.columns) throw new IllegalArgumentException("");
		
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] - subtrahend.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(DoubleMatrix4 subtrahend) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public FloatMatrix4 subtract(FloatMatrix4 subtrahend) {
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public IntegerMatrix4 subtract(IntegerMatrix4 subtrahend) {
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public ByteMatrix4 subtract(ByteMatrix4 subtrahend) {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] - subtrahend.array[row][column]);
			}
		}
		
		return result;
	}
	public DoubleMatrix4 scalarMultiply(double factor) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public FloatMatrix4 scalarMultiply(float factor) {
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public IntegerMatrix4 scalarMultiply(int factor) {
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public ByteMatrix4 scalarMultiply(byte factor) {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] * factor);
			}
		}
		
		return result;
	}
	public DoubleMatrix4 scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	public FloatMatrix4 scalarDivide(float divisor) {
		return scalarMultiply(1f / divisor);
	}
	public IntegerMatrix4 scalarDivide(int divisor) {
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = array[row][column] / divisor;
			}
		}
		
		return result;
	}
	public ByteMatrix4 scalarDivide(byte divisor) {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row][column] = (byte) (array[row][column] / divisor);
			}
		}
		
		return result;
	}
	
	public ByteMatrix strikeRow(int row) {
		return super.strikeRow(row);
	}
	public ByteMatrix strikeColumn(int column) {
		return super.strikeColumn(column);
	}
	public ByteMatrix3 strikeRowColumn(int row, int column) {
		ByteMatrix3 result = new ByteMatrix3();
		
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
	public DoubleMatrix4 matrixMultiply(DoubleMatrix4 multiplicand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public FloatMatrix4 matrixMultiply(FloatMatrix4 multiplicand) {
		FloatMatrix4 result = new FloatMatrix4();
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public IntegerMatrix4 matrixMultiply(IntegerMatrix4 multiplicand) {
		IntegerMatrix4 result = new IntegerMatrix4();
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public ByteMatrix4 matrixMultiply(ByteMatrix4 multiplicand) {
		ByteMatrix4 result = new ByteMatrix4();
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(DoubleVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public FloatVector4 matrixMultiply(FloatVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		FloatVector4 result = new FloatVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public IntegerVector4 matrixMultiply(IntegerVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		IntegerVector4 result = new IntegerVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public ByteVector4 matrixMultiply(ByteVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		ByteVector4 result = new ByteVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(DoubleVector4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public FloatVector4 matrixMultiply(FloatVector4 multiplicand) {
		FloatVector4 result = new FloatVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public IntegerVector4 matrixMultiply(IntegerVector4 multiplicand) {
		IntegerVector4 result = new IntegerVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public ByteVector4 matrixMultiply(ByteVector4 multiplicand) {
		ByteVector4 result = new ByteVector4();
		
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	
}