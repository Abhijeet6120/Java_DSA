package Lecture18_Recursion_1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}

	public static int fact(int n) {
		if(n==1) {
			return n; 
		}
//		int fn = fact(n-1); // Smaller Problem			// Tale recursion
//		return n*fn; 					
		return n*fact(n-1);				// Head recursion
		
	}
}