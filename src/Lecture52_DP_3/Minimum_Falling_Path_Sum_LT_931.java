package Lecture52_DP_3;

import java.util.*;

public class Minimum_Falling_Path_Sum_LT_931 {

	public static void main(String[] args) {
	
		int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
		
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int[] a: dp) {					// prefilling -infinite in dp array
			Arrays.fill(a, -9999999);
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<arr[0].length; i++) {		// Loops for col only kyuki col se hi start krna h
			
			ans = Math.min(ans, falling_Path_Sum(arr,0,i,dp));		// finding min
		}
		
		System.out.println(ans);
	}
	
	// Dynamic Approach
	public static int falling_Path_Sum(int[][] arr, int cr, int cc, int[][] dp) {
		
		if(cc < 0 || cc >= arr[0].length) {						// Base Case 1 for col
			return Integer.MAX_VALUE;
		}
		
		if(cr == arr.length - 1) {						// Base Case 2	for row
			return arr[cr][cc];
		}
		
		if(dp[cr][cc] != -9999999) {		// Applying dp here
			return dp[cr][cc];
		}
		
		int ld = falling_Path_Sum(arr, cr+1, cc-1 ,dp);		// ld= Left Diagonal
		int d = falling_Path_Sum(arr, cr + 1, cc, dp);			// down jaa rhe row badhega 
		int rd = falling_Path_Sum(arr, cr + 1, cc + 1, dp);		// right diognal m row and col dono badhega
		
		return dp[cr][cc] = Math.min(d, Math.min(ld,rd)) + arr[cr][cc];		
	}
}
