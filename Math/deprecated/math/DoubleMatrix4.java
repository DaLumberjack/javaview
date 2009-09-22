package math;

import java.util.Iterator;


public class DoubleMatrix4 extends DoubleMatrix {
	
	public DoubleMatrix4() {
		super(4, 4);
	}
	public DoubleMatrix4(double[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			System.arraycopy(matrix4[row], 0, array[row], 0, 4);
		}
	}
	public DoubleMatrix4(float[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4[row][column];
			}
		}
	}
	public DoubleMatrix4(long[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4[row][column];
			}
		}
	}
	public DoubleMatrix4(int[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4[row][column];
			}
		}
	}
	public DoubleMatrix4(short[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4[row][column];
			}
		}
	}
	public DoubleMatrix4(byte[]... matrix4) {
		// TODO Exception
		this();
		
		if (matrix4.length != 4) throw new IllegalArgumentException("");
		
		for (int row = 0; row < 4; row++) {
			if (matrix4[row].length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4[row][column];
			}
		}
	}
	public DoubleMatrix4(DoubleMatrix matrix4) {
		this(matrix4.array);
	}
	public DoubleMatrix4(FloatMatrix matrix4) {
		this(matrix4.array);
	}
	public DoubleMatrix4(IntegerMatrix matrix4) {
		this(matrix4.array);
	}
	public DoubleMatrix4(ByteMatrix matrix4) {
		this(matrix4.array);
	}
	public DoubleMatrix4(DoubleMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < 4; row++) {
			System.arraycopy(matrix4.array[row], 0, array[row], 0, 4);
		}
	}
	public DoubleMatrix4(FloatMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4.array[row][column];
			}
		}
	}
	public DoubleMatrix4(IntegerMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4.array[row][column];
			}
		}
	}
	public DoubleMatrix4(ByteMatrix4 matrix4) {
		this();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				array[row][column] = matrix4.array[row][column];
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, DoubleVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				if (vector4Array[column].dimension != 4) throw new IllegalArgumentException("");
				
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				if (vector4Array[row].dimension != 4) throw new IllegalArgumentException("");
				
				System.arraycopy(vector4Array[row].array, 0, array[row], 0, 4);
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, FloatVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				if (vector4Array[column].dimension != 4) throw new IllegalArgumentException("");
				
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				if (vector4Array[row].dimension != 4) throw new IllegalArgumentException("");
				
				for (int column = 0; column < 4; column++) {
					array[row][column] = vector4Array[row].array[column];
				}
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, IntegerVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				if (vector4Array[column].dimension != 4) throw new IllegalArgumentException("");
				
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != rows) throw new IllegalArgumentException("");
			
			for (int row = 0; row < rows; row++) {
				if (vector4Array[row].dimension != columns) throw new IllegalArgumentException("");
				
				for (int column = 0; column < columns; column++) {
					array[row][column] = vector4Array[row].array[column];
				}
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, ByteVector... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				if (vector4Array[column].dimension != 4) throw new IllegalArgumentException("");
				
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				if (vector4Array[row].dimension != 4) throw new IllegalArgumentException("");
				
				for (int column = 0; column < 4; column++) {
					array[row][column] = vector4Array[row].array[column];
				}
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, DoubleVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				System.arraycopy(vector4Array[row].array, 0, array[row], 0, 4);
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, FloatVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				for (int column = 0; column < 4; column++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, IntegerVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				for (int column = 0; column < 4; column++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		}
	}
	public DoubleMatrix4(boolean columnVector, ByteVector4... vector4Array) {
		// TODO Exception
		this();
		
		if (columnVector) {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int column = 0; column < 4; column++) {
				for (int row = 0; row < 4; row++) {
					array[row][column] = vector4Array[column].array[row];
				}
			}
		} else {
			if (vector4Array.length != 4) throw new IllegalArgumentException("");
			
			for (int row = 0; row < 4; row++) {
				for (int column = 0; column < 4; column++) {
					array[row][column] = vector4Array[column].array[row];
				}
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
	
	
	public double component(int row, int column) {
		return super.component(row, column);
	}
	public Iterator<Double> iterator() {
		return super.iterator();
	}
	public FloatMatrix4 asFloatMatrix() {
		return new FloatMatrix4(this);
	}
	public IntegerMatrix4 asIntegerMatrix() {
		return new IntegerMatrix4(this);
	}
	public ByteMatrix4 asByteMatrix() {
		return new ByteMatrix4(this);
	}
	
	public DoubleMatrix4 setComponent(int row, int column, double value) {
		DoubleMatrix4 result = new DoubleMatrix4(this);
		
		result.array[row][column] = value;
		
		return result;
	}
	
	
	public double determinant() {
		return super.determinant();
	}
	public DoubleMatrix4 invert() {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = -array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 transpose() {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[column][row] = array[row][column];
			}
		}
		
		return result;
	}
	
	public DoubleMatrix4 add(DoubleMatrix summand) {
		// TODO Exception
		if (summand.rows != 4) throw new IllegalArgumentException("");
		if (summand.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(FloatMatrix summand) {
		// TODO Exception
		if (summand.rows != 4) throw new IllegalArgumentException("");
		if (summand.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(IntegerMatrix summand) {
		// TODO Exception
		if (summand.rows != 4) throw new IllegalArgumentException("");
		if (summand.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(ByteMatrix summand) {
		// TODO Exception
		if (summand.rows != 4) throw new IllegalArgumentException("");
		if (summand.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(DoubleMatrix4 summand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(FloatMatrix4 summand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(IntegerMatrix4 summand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 add(ByteMatrix4 summand) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] + summand.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(DoubleMatrix subtrahend) {
		// TODO Exception
		if (subtrahend.rows != 4) throw new IllegalArgumentException("");
		if (subtrahend.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(FloatMatrix subtrahend) {
		// TODO Exception
		if (subtrahend.rows != 4) throw new IllegalArgumentException("");
		if (subtrahend.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(IntegerMatrix subtrahend) {
		// TODO Exception
		if (subtrahend.rows != 4) throw new IllegalArgumentException("");
		if (subtrahend.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(ByteMatrix subtrahend) {
		// TODO Exception
		if (subtrahend.rows != 4) throw new IllegalArgumentException("");
		if (subtrahend.columns != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(DoubleMatrix4 subtrahend) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(FloatMatrix4 subtrahend) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(IntegerMatrix4 subtrahend) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 subtract(ByteMatrix4 subtrahend) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] - subtrahend.array[row][column];
			}
		}
		
		return result;
	}
	public DoubleMatrix4 scalarMultiply(double factor) {
		DoubleMatrix4 result = new DoubleMatrix4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row][column] = array[row][column] * factor;
			}
		}
		
		return result;
	}
	public DoubleMatrix4 scalarDivide(double divisor) {
		return scalarMultiply(1d / divisor);
	}
	
	public DoubleMatrix strikeRow(int row) {
		return super.strikeRow(row);
	}
	public DoubleMatrix strikeColumn(int column) {
		return super.strikeColumn(column);
	}
	public DoubleMatrix3 strikeRowColumn(int row, int column) {
		DoubleMatrix3 result = new DoubleMatrix3();
		
		int offsetRow = 0;
		int offsetColumn = 0;
		
		for (int newRow = 0; newRow < 3; newRow++) {
			if (newRow == row) offsetRow++;
			
			offsetColumn = 0;
			
			for (int newColumn = 0; newColumn < 3; newColumn++) {
				if (newColumn == column) offsetColumn++;
				
				result.array[newRow][newColumn] = array[newRow + offsetRow][newColumn + offsetColumn];
			}
		}
		
		return result;
	}
	
	public DoubleMatrix matrixMultiply(DoubleMatrix multiplicand) {
		// TODO Exception
		if (multiplicand.rows != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(4, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public DoubleMatrix matrixMultiply(FloatMatrix multiplicand) {
		// TODO Exception
		if (multiplicand.rows != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(4, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public DoubleMatrix matrixMultiply(IntegerMatrix multiplicand) {
		// TODO Exception
		if (multiplicand.rows != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(4, multiplicand.columns);
		
		for (int row = 0; row < result.rows; row++) {
			for (int column = 0; column < result.columns; column++) {
				for (int k = 0; k < columns; k++) {
					result.array[row][column] += array[row][k] * multiplicand.array[k][column];
				}
			}
		}
		
		return result;
	}
	public DoubleMatrix matrixMultiply(ByteMatrix multiplicand) {
		// TODO Exception
		if (multiplicand.rows != 4) throw new IllegalArgumentException("");
		
		DoubleMatrix result = new DoubleMatrix(4, multiplicand.columns);
		
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
	public DoubleMatrix4 matrixMultiply(FloatMatrix4 multiplicand) {
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
	public DoubleMatrix4 matrixMultiply(IntegerMatrix4 multiplicand) {
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
	public DoubleMatrix4 matrixMultiply(ByteMatrix4 multiplicand) {
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
	public DoubleVector4 matrixMultiply(DoubleVector multiplicand) {
		// TODO Exception
		if (multiplicand.dimension != 4) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(FloatVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(IntegerVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(ByteVector multiplicand) {
		// TODO Exception
		if (columns != multiplicand.dimension) throw new IllegalArgumentException("");
		
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(DoubleVector4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(FloatVector4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(IntegerVector4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	public DoubleVector4 matrixMultiply(ByteVector4 multiplicand) {
		DoubleVector4 result = new DoubleVector4();
		
		for (int row = 0; row < 4; row++) {
			for (int column = 0; column < 4; column++) {
				result.array[row] += array[row][column] * multiplicand.array[column];
			}
		}
		
		return result;
	}
	
}