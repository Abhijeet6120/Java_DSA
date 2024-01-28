package Lecture18_Recursion_1;

public class Tail_Recursion {

	public static void main(String[] args) {
		// Find factorial of number using tail recursion
		int n = 5;
		
		System.out.println(Factorial(n,1));				// Calling function
		
	}
	// Function for tail recursion 
	public static int Factorial(int n, int ans) {
		if(n==1) {
			return ans;
		}
		return Factorial(n-1, ans*n);
		
	}

}
