package Lecture50_DP_1;

import java.util.*;

public class House_Robber_LT_198 {

	public static void main(String[] args) {
		// 
		int[] arr = {5,3,1,7,1};
		int[] TDP = new int[arr.length];
		Arrays.fill(TDP,-1);
//		System.out.println(Robber(arr,0));
		System.out.println(RobberTD(arr,0, TDP));

	}
	
	// Recursion approach   Picche se fill kar rhe hai
		public static int Robber1(int[] arr, int i) {
			
			if(i < 0) {							// Base Case
				return 0;
			}
			
			int rob = arr[i] + Robber1(arr, i-2);	//DP[i-2]		// Not robbing adjacent isliye i+2 kiye
			int Dont_rob = Robber1(arr, i-1);	//DP[i-1]
			
			return Math.max(rob, Dont_rob);
		}
		
		// Bottom UP Approach
		public static int RobberBottomUP(int[] arr) {
			
			if(arr.length == 1) {							// Base Case
				return arr[0];
			}
			
			int[] DP = new int[arr.length];
			DP[0] = arr[0];
			DP[1] = Math.max(arr[0], arr[1]);
			
			for(int i=2; i<DP.length; i++) {
				
				int rob = arr[i] + DP[i-2];			// Not robbing adjacent isliye i+2 kiye
				int Dont_rob = DP[i-1];
				DP[i] = Math.max(rob, Dont_rob);
			}
			
			
			return DP[DP.length-1];
		}
	
	// ToDown approach   
	public static int RobberTD(int[] arr, int i, int[] TDP) {
		
		if(i >= arr.length) {							// Base Case
			return 0;
		}
		
		if(TDP[i] != -1) {
			return TDP[i];
		}
		int rob = arr[i] + RobberTD(arr, i+2,TDP);			// Not robbing adjacent isliye i+2 kiye
		int Dont_rob = arr[i] + RobberTD(arr, i+1,TDP);
		TDP[i] = Math.max(rob, Dont_rob);
		
		return Math.max(rob, Dont_rob);
	}
	
	// Normal Recursion approach  
		public static int Robber(int[] arr, int i) {
			
			if(i >= arr.length) {							// Base Case
				return 0;
			}
			int rob = arr[i] + Robber(arr, i+2);			// Not robbing adjacent isliye i+2 kiye
			int Dont_rob = arr[i] + Robber(arr, i+1);
			
			return Math.max(rob, Dont_rob);
		}

}

