package math;


public class IntMatrix2 {
	
	public static final IntMatrix2 IDENTITY_MATRIX = new IntMatrix2(
			1, 0,
			0, 1
	);
	
	public final int m00, m01;
	public final int m10, m11;
	
	public boolean determinantCalced;
	public int determinant;
	
	
	public IntMatrix2() {
		m00 = 0; m01 = 0;
		m10 = 0; m11 = 0;
	}
	public IntMatrix2(int all) {
		m00 = all; m01 = all;
		m10 = all; m11 = all;
	}
	public IntMatrix2(int... matrix) {
		if (matrix.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		switch (matrix.length) {
			case 1:
				m00 = matrix[0]; m01 = matrix[0];
				m10 = matrix[0]; m11 = matrix[0];
				
				break;
			case 2:
				m00 = matrix[0]; m01 = matrix[0];
				m10 = matrix[1]; m11 = matrix[1];
				
				break;
			case 3:
				m00 = matrix[0]; m01 = matrix[2];
				m10 = matrix[1]; m11 = matrix[0];
				
				break;
			
			default:
				m00 = matrix[0]; m01 = matrix[2];
				m10 = matrix[1]; m11 = matrix[3];
				
				break;
		}
	}
	public IntMatrix2(DoubleVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = (int) columns[0].x; m01 = (int) columns[0].x;
			m10 = (int) columns[0].y; m11 = (int) columns[0].y;
		} else {
			m00 = (int) columns[0].x; m01 = (int) columns[1].x;
			m10 = (int) columns[0].y; m11 = (int) columns[1].y;
		}
	}
	public IntMatrix2(FloatVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = (int) columns[0].x; m01 = (int) columns[0].x;
			m10 = (int) columns[0].y; m11 = (int) columns[0].y;
		} else {
			m00 = (int) columns[0].x; m01 = (int) columns[1].x;
			m10 = (int) columns[0].y; m11 = (int) columns[1].y;
		}
	}
	public IntMatrix2(IntVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = columns[0].x; m01 = columns[0].x;
			m10 = columns[0].y; m11 = columns[0].y;
		} else {
			m00 = columns[0].x; m01 = columns[1].x;
			m10 = columns[0].y; m11 = columns[1].y;
		}
	}
	public IntMatrix2(DoubleMatrix2 matrix) {
		m00 = (int) matrix.m00; m01 = (int) matrix.m01;
		m10 = (int) matrix.m10; m11 = (int) matrix.m11;
	}
	public IntMatrix2(FloatMatrix2 matrix) {
		m00 = (int) matrix.m00; m01 = (int) matrix.m01;
		m10 = (int) matrix.m10; m11 = (int) matrix.m11;
	}
	public IntMatrix2(IntMatrix2 matrix) {
		m00 = matrix.m00; m01 = matrix.m01;
		m10 = matrix.m10; m11 = matrix.m11;
	}
	
	
	public String toString() {
		return	"[" + m00 + ", " + m01 + "]" +
				"[" + m10 + ", " + m11 + "]";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof IntMatrix2)) return false;
		IntMatrix2 matrix = (IntMatrix2) obj;
		
		return	(m00 == matrix.m00) && (m01 == matrix.m01) &&
				(m10 == matrix.m10) && (m11 == matrix.m11);
	}
	public int hashCode() {
		return m00 | m01 | m10 | m11;
	}
	
	
	public DoubleMatrix2 asDoubleMatrix2() {
		return new DoubleMatrix2(this);
	}
	public FloatMatrix2 asFloatMatrix2() {
		return new FloatMatrix2(this);
	}
	
	
	public int determinant() {
		if (determinantCalced) return determinant;
		
		return determinant = m00 * m11 - m01 * m10;
	}
	public IntMatrix2 invert() {
		return new IntMatrix2(
				-m00, -m01,
				-m10, -m11
		);
	}
	public IntMatrix2 transpose() {
		return new IntMatrix2(
				m00, m10,
				m01, m11
		);
	}
	
	public DoubleMatrix2 add(DoubleMatrix2 summand) {
		return new DoubleMatrix2(
				m00 + summand.m00, m01 + summand.m01,
				m10 + summand.m10, m11 + summand.m11
		);
	}
	public FloatMatrix2 add(FloatMatrix2 summand) {
		return new FloatMatrix2(
				m00 + summand.m00, m01 + summand.m01,
				m10 + summand.m10, m11 + summand.m11
		);
	}
	public IntMatrix2 add(IntMatrix2 summand) {
		return new IntMatrix2(
				m00 + summand.m00, m01 + summand.m01,
				m10 + summand.m10, m11 + summand.m11
		);
	}
	public DoubleMatrix2 subtract(DoubleMatrix2 subtrahend) {
		return new DoubleMatrix2(
				m00 - subtrahend.m00, m01 - subtrahend.m01,
				m10 - subtrahend.m10, m11 - subtrahend.m11
		);
	}
	public FloatMatrix2 subtract(FloatMatrix2 subtrahend) {
		return new FloatMatrix2(
				m00 - subtrahend.m00, m01 - subtrahend.m01,
				m10 - subtrahend.m10, m11 - subtrahend.m11
		);
	}
	public IntMatrix2 subtract(IntMatrix2 subtrahend) {
		return new IntMatrix2(
				m00 - subtrahend.m00, m01 - subtrahend.m01,
				m10 - subtrahend.m10, m11 - subtrahend.m11
		);
	}
	public DoubleMatrix2 multiply(DoubleMatrix2 multiplicand) {
		return new DoubleMatrix2(
				m00 * multiplicand.m00, m01 * multiplicand.m01,
				m10 * multiplicand.m10, m11 * multiplicand.m11
		);
	}
	public FloatMatrix2 multiply(FloatMatrix2 multiplicand) {
		return new FloatMatrix2(
				m00 * multiplicand.m00, m01 * multiplicand.m01,
				m10 * multiplicand.m10, m11 * multiplicand.m11
		);
	}
	public IntMatrix2 multiply(IntMatrix2 multiplicand) {
		return new IntMatrix2(
				m00 * multiplicand.m00, m01 * multiplicand.m01,
				m10 * multiplicand.m10, m11 * multiplicand.m11
		);
	}
	public DoubleMatrix2 divide(DoubleMatrix2 divisor) {
		return new DoubleMatrix2(
				m00 / divisor.m00, m01 / divisor.m01,
				m10 / divisor.m10, m11 / divisor.m11
		);
	}
	public FloatMatrix2 divide(FloatMatrix2 divisor) {
		return new FloatMatrix2(
				m00 / divisor.m00, m01 / divisor.m01,
				m10 / divisor.m10, m11 / divisor.m11
		);
	}
	public IntMatrix2 divide(IntMatrix2 divisor) {
		return new IntMatrix2(
				m00 / divisor.m00, m01 / divisor.m01,
				m10 / divisor.m10, m11 / divisor.m11
		);
	}
	public DoubleMatrix2 scalarMultiply(double factor) {
		return new DoubleMatrix2(
				m00 * factor, m01 * factor,
				m10 * factor, m11 * factor
		);
	}
	public FloatMatrix2 scalarMultiply(float factor) {
		return new FloatMatrix2(
				m00 * factor, m01 * factor,
				m10 * factor, m11 * factor
		);
	}
	public IntMatrix2 scalarMultiply(int factor) {
		return new IntMatrix2(
				m00 * factor, m01 * factor,
				m10 * factor, m11 * factor
		);
	}
	public DoubleMatrix2 scalarDivide(double divisor) {
		return new DoubleMatrix2(
				m00 / divisor, m01 / divisor,
				m10 / divisor, m11 / divisor
		);
	}
	public FloatMatrix2 scalarDivide(float divisor) {
		return new FloatMatrix2(
				m00 / divisor, m01 / divisor,
				m10 / divisor, m11 / divisor
		);
	}
	public IntMatrix2 scalarDivide(int divisor) {
		return new IntMatrix2(
				m00 / divisor, m01 / divisor,
				m10 / divisor, m11 / divisor
		);
	}
	
	public DoubleMatrix2 matrixMultiplication(DoubleMatrix2 multiplicand) {
		return new DoubleMatrix2(
				m00 * multiplicand.m00 + m01 * multiplicand.m10, m00 * multiplicand.m01 + m01 * multiplicand.m11,
				m10 * multiplicand.m00 + m11 * multiplicand.m10, m10 * multiplicand.m01 + m11 * multiplicand.m11
		);
	}
	public FloatMatrix2 matrixMultiplication(FloatMatrix2 multiplicand) {
		return new FloatMatrix2(
				m00 * multiplicand.m00 + m01 * multiplicand.m10, m00 * multiplicand.m01 + m01 * multiplicand.m11,
				m10 * multiplicand.m00 + m11 * multiplicand.m10, m10 * multiplicand.m01 + m11 * multiplicand.m11
		);
	}
	public IntMatrix2 matrixMultiplication(IntMatrix2 multiplicand) {
		return new IntMatrix2(
				m00 * multiplicand.m00 + m01 * multiplicand.m10, m00 * multiplicand.m01 + m01 * multiplicand.m11,
				m10 * multiplicand.m00 + m11 * multiplicand.m10, m10 * multiplicand.m01 + m11 * multiplicand.m11
		);
	}
	public DoubleVector2 matrixMultiplication(DoubleVector2 multiplicand) {
		return new DoubleVector2(
				m00 * multiplicand.x + m01 * multiplicand.y,
				m10 * multiplicand.x + m11 * multiplicand.y
		);
	}
	public FloatVector2 matrixMultiplication(FloatVector2 multiplicand) {
		return new FloatVector2(
				m00 * multiplicand.x + m01 * multiplicand.y,
				m10 * multiplicand.x + m11 * multiplicand.y
		);
	}
	public IntVector2 matrixMultiplication(IntVector2 multiplicand) {
		return new IntVector2(
				m00 * multiplicand.x + m01 * multiplicand.y,
				m10 * multiplicand.x + m11 * multiplicand.y
		);
	}
	
}