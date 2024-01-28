package Lecture18_Recursion_1;

public class Print_Decreasing_Order {

	public static void main(String[] args) {
		// TODO Print decreasing order of 5 4 3 2 1
		int n = 5;
		Decreasing_Print(n);
		

	}

	public static void Decreasing_Print(int n) {
		
		if(n==0) {				// base case
			return;
		}
		
		System.out.println(n);				
		Decreasing_Print(n-1);				// Smaller problem
		
	}
	// Function to print Increasing order
	public static void Increasing_Print(int n) {
		
		if(n==5) {				// base case
			return;
		}
		
		System.out.println(n);				
		Increasing_Print(n+1);				// Smaller problem
		
	}

}
