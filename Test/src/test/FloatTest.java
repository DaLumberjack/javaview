package test;
public class FloatTest {
	
	public static String int2binStr(int bits) {
		String result = "";
		int i = 0;
		
		while (true) {
			result = ((bits >> i) & 1) + result;
			
			if (i > 30) return result;
			
			if ((++i & 7) == 0) result = " " + result;
		}
	}
	
	
	public static void main(String[] args) {
		int signMask		= 0x80000000;
		int exponentMask	= 0x7F800000;
		int mantissaMask	= 0x007FFFFF;
		
		int signShift = 31;
		int exponentShift = 23;
		int mantissaShift = 0;
		
		float f = 12835f;
		
		int bits = Float.floatToIntBits(f);
		int sign = bits & signMask;
		int exponent = bits & exponentMask;
		int mantissa = bits & mantissaMask;
		
		int signValue = sign >>> signShift;
		int exponentValue = exponent >>> exponentShift;
		int mantissaValue = mantissa >>> mantissaShift;
		
		System.out.println("bits:		" + int2binStr(bits)		+ " = " + bits);
		System.out.println("sign:		" + int2binStr(sign)		+ " = " + signValue);
		System.out.println("exponent:	" + int2binStr(exponent)	+ " = " + exponentValue);
		System.out.println("mantissa:	" + int2binStr(mantissa)	+ " = " + mantissaValue);
	}
	
}