package Lecture18_Recursion_1;

public class Tail_Recursion_Power {

	public static void main(String[] args) {
		// TODO Find the power using Tail Recursion
		int a = 3;
		int b = 4;
		System.out.println(Power(a,b,1));
	}
	// Function to find the power using Tail recursion
	public static int Power(int a, int b, int ans) {
		// Termination condition(Base case)
		if(b==0) {
			return ans;
		}
		
		return Power(a, b-1, ans*a);	// Last Recursive Statement (After this we are not performing any task)
	}

}
