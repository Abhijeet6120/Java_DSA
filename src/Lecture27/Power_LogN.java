package Lecture27;

public class Power_LogN {

	public static void main(String[] args) {
		// Proof of Power function
		int a = 3;
		int n = 7;
		System.out.println(pow(a,n));

	}
	// Function to proof LHS == RHS(a power b == a power b)
	public static int pow(int a, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {						// Base case
			return 1;
		}
		int ans = pow(a, n/2);
		ans = ans * ans;
		if(n % 2 !=0) {
			ans = ans * a;
			
		}
		return ans;
	}

}
