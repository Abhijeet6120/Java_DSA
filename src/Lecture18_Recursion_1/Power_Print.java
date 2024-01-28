package Lecture18_Recursion_1;

public class Power_Print {

	public static void main(String[] args) {
		// TODO Print power of number
		int a = 3;
		int b = 4;
		System.out.println(pow(a,b));

	}

	public static int pow(int a, int b) {
		// TODO Print a to the power b
		if(b==0) {							// Base case(Termination condition
			return 1; 
		}
		int ans = pow(a,b-1);				// Calling itself
		return ans*a;						// Return ans*a
		
	}

}
