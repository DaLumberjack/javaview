package math;


public class DoubleMatrix2 {
	
	public static final DoubleMatrix2 IDENTITY_MATRIX = new DoubleMatrix2(
			1d, 0d,
			0d, 1d
	);
	
	public final double m00, m01;
	public final double m10, m11;
	
	public boolean determinantCalced;
	public double determinant;
	
	
	public DoubleMatrix2() {
		m00 = 0d; m01 = 0d;
		m10 = 0d; m11 = 0d;
	}
	public DoubleMatrix2(double all) {
		m00 = all; m01 = all;
		m10 = all; m11 = all;
	}
	public DoubleMatrix2(double... matrix) {
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
	public DoubleMatrix2(DoubleVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = columns[0].x; m01 = columns[0].x;
			m10 = columns[0].y; m11 = columns[0].y;
		} else {
			m00 = columns[0].x; m01 = columns[1].x;
			m10 = columns[0].y; m11 = columns[1].y;
		}
	}
	public DoubleMatrix2(FloatVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = columns[0].x; m01 = columns[0].x;
			m10 = columns[0].y; m11 = columns[0].y;
		} else {
			m00 = columns[0].x; m01 = columns[1].x;
			m10 = columns[0].y; m11 = columns[1].y;
		}
	}
	public DoubleMatrix2(IntVector2... columns) {
		if (columns.length < 1) throw new IllegalArgumentException("The array must be bigger than 0!");
		
		if (columns.length == 1) {
			m00 = columns[0].x; m01 = columns[0].x;
			m10 = columns[0].y; m11 = columns[0].y;
		} else {
			m00 = columns[0].x; m01 = columns[1].x;
			m10 = columns[0].y; m11 = columns[1].y;
		}
	}
	public DoubleMatrix2(DoubleMatrix2 matrix) {
		m00 = matrix.m00; m01 = matrix.m01;
		m10 = matrix.m10; m11 = matrix.m11;
	}
	public DoubleMatrix2(FloatMatrix2 matrix) {
		m00 = matrix.m00; m01 = matrix.m01;
		m10 = matrix.m10; m11 = matrix.m11;
	}
	public DoubleMatrix2(IntMatrix2 matrix) {
		m00 = matrix.m00; m01 = matrix.m01;
		m10 = matrix.m10; m11 = matrix.m11;
	}
	
	
	public String toString() {
		return	"[" + m00 + ", " + m01 + "]" +
				"[" + m10 + ", " + m11 + "]";
	}
	public boolean equals(Object obj) {
		if (obj == null) return false;
		
		if (!(obj instanceof DoubleMatrix2)) return false;
		DoubleMatrix2 matrix = (DoubleMatrix2) obj;
		
		return	(m00 == matrix.m00) && (m01 == matrix.m01) &&
				(m10 == matrix.m10) && (m11 == matrix.m11);
	}
	public int hashCode() {
		return (int) Double.doubleToLongBits(m00 * m01 * m10 * m11);
	}
	
	
	public FloatMatrix2 asFloatMatrix2() {
		return new FloatMatrix2(this);
	}
	public IntMatrix2 asIntMatrix2() {
		return new IntMatrix2(this);
	}
	
	
	public double determinant() {
		if (determinantCalced) return determinant;
		
		return determinant = m00 * m11 - m01 * m10;
	}
	public DoubleMatrix2 invert() {
		return new DoubleMatrix2(
				-m00, -m01,
				-m10, -m11
		);
	}
	public DoubleMatrix2 transpose() {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 add(FloatMatrix2 summand) {
		return new DoubleMatrix2(
				m00 + summand.m00, m01 + summand.m01,
				m10 + summand.m10, m11 + summand.m11
		);
	}
	public DoubleMatrix2 add(IntMatrix2 summand) {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 subtract(FloatMatrix2 subtrahend) {
		return new DoubleMatrix2(
				m00 - subtrahend.m00, m01 - subtrahend.m01,
				m10 - subtrahend.m10, m11 - subtrahend.m11
		);
	}
	public DoubleMatrix2 subtract(IntMatrix2 subtrahend) {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 multiply(FloatMatrix2 multiplicand) {
		return new DoubleMatrix2(
				m00 * multiplicand.m00, m01 * multiplicand.m01,
				m10 * multiplicand.m10, m11 * multiplicand.m11
		);
	}
	public DoubleMatrix2 multiply(IntMatrix2 multiplicand) {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 divide(FloatMatrix2 divisor) {
		return new DoubleMatrix2(
				m00 / divisor.m00, m01 / divisor.m01,
				m10 / divisor.m10, m11 / divisor.m11
		);
	}
	public DoubleMatrix2 divide(IntMatrix2 divisor) {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 scalarDivide(double divisor) {
		return new DoubleMatrix2(
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
	public DoubleMatrix2 matrixMultiplication(FloatMatrix2 multiplicand) {
		return new DoubleMatrix2(
				m00 * multiplicand.m00 + m01 * multiplicand.m10, m00 * multiplicand.m01 + m01 * multiplicand.m11,
				m10 * multiplicand.m00 + m11 * multiplicand.m10, m10 * multiplicand.m01 + m11 * multiplicand.m11
		);
	}
	public DoubleMatrix2 matrixMultiplication(IntMatrix2 multiplicand) {
		return new DoubleMatrix2(
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
	public DoubleVector2 matrixMultiplication(FloatVector2 multiplicand) {
		return new DoubleVector2(
				m00 * multiplicand.x + m01 * multiplicand.y,
				m10 * multiplicand.x + m11 * multiplicand.y
		);
	}
	public DoubleVector2 matrixMultiplication(IntVector2 multiplicand) {
		return new DoubleVector2(
				m00 * multiplicand.x + m01 * multiplicand.y,
				m10 * multiplicand.x + m11 * multiplicand.y
		);
	}
	
}