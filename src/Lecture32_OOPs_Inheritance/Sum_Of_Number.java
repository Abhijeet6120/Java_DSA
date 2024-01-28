package Lecture32_OOPs_Inheritance;

public class Sum_Of_Number {

	public static void main(String[] args) {
		System.out.println(Add(2,7));
		System.out.println(Add(2,7,11));
		System.out.println(Add(2,7,9.5));
		System.out.println(Add(2,3,45,6,6,6,6,6,6,6,6,6,66,6,6,6,66,6,6,6,6));
		

	}
	// Method Overloading
	public static int Add(int a, int b) {
		
		return a+b;
	}
	public static int Add(int a, int b, int c) {
		
		return a+b+c;
	}
	public static int Add(int a, int b, double c) {
	
	return (int) (a+b+c);			// type casting
	}
	
	// triple dot arguments (Can't use multiple dot many
	public static int Add(int x, int... a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
//	public static int Add(int a, int b) {
//		
//		return a + b;
//	}
//	public static int Add(int a, int b, int c) {
//		
//		return a + b + c;
//	}
//	public static int Add(int a, int b, double c) {
//	
//	return (int) (a + b + c);			// type casting
//	
//	}
	
	
	

}
