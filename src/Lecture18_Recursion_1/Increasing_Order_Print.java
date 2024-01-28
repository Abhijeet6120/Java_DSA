package Lecture18_Recursion_1;

public class Increasing_Order_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Increasing_Print(n);
	}
	// Function to print Increasing order
		public static void Increasing_Print(int n) {
			
			if(n==0) {				// base case
				return;
			}
					
			Increasing_Print(n-1);				// Smaller problem
			System.out.println(n);	
			
		}

}
