package Lecture46_Bit_Masking;

public class Shift_Operator {
		// Bitwise operator much faster than other operator
	public static void main(String[] args) {
		
		int a = 9;
		System.out.println(a<<3);			// left Shift(a<<3: a*2^3) 
//		System.out.println(a);
		int a1 = -9;
		System.out.println(a1<<3);
		System.out.println(a>>2); 		// right shift a>>b : a/2^b
		System.out.println(a1>>2); 		// Right Shift
		
		int x = 5;
		int y = -5;
		System.out.println(x<<3);	// left shift operator always even no. dega 
		System.out.println(y<<3);
	}

}
