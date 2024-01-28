package Lecture50_DP_1;

public class Fibo {
	
	// DP: Those who can not remember past and condemned to repeat it.

	public static void main(String[] args) {
		
		int n=6;
		int[] DP = new int[n+1];				// DP arr yaad rakhne k liye
		
		System.out.println(fibTopDown(n,DP));
		
		System.out.println(fibBottomUP(n));
		
		

	}
	// TOP Down Approach(Memorization) 
	public static int fibTopDown(int n, int[] DP) {
		
		if(n==0 || n==1) {
			return n;
		}
		
		if(DP[n] != 0) {					// Dp apply kar rhe
			return DP[n];
		}
		
		int f1 = fibTopDown(n-1, DP);
		int f2 = fibTopDown(n-2, DP);
		
		return DP[n] = f1+f2;				// Yaad kar rhe
		
	}
	
	// Bottom UP Approach(Tabulation method: Table banane wala)
		public static int fibBottomUP(int n) {
			
			int[] DP = new int[n+1];					// Created array yaad karne k liye
			
			DP[0] = 0;							// Manually assigned base case in array
			DP[1] = 1;
			
			for(int i=2; i<DP.length; i++) {			// TC(N)
				DP[i] = DP[i-1] + DP[i-2];		// 
			}
			
			return DP[n];				// Yaad kar rhe
			
		}
	
	// Normal Recursion solution
		public static int fib(int n) {			
		
			if(n==0 || n==1) {
				return n;
			}
		
			int f1 = fib(n-1);
			int f2 = fib(n-2);
		
			return f1+f2;
		
		}

}
