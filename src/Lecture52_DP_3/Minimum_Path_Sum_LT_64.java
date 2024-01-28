package Lecture52_DP_3;

import java.util.Arrays;

public class Minimum_Path_Sum_LT_64 {

	public static void main(String[] args) {
		// LeetCode: 64. Minimum Path Sum
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int[] a: dp) {
			Arrays.fill(a, -999999);
		}
		
		System.out.println(minPathSum(arr, 0, 0));
		

		System.out.println(minPathSumDP(arr, 0, 0, dp));
		

	}
	
	// Recursive approach
	 public static int minPathSum(int[][] arr, int cr, int cc) {
		 
		 if(cr == arr.length-1 && cc == arr[0].length-1) {				// Base Case
			 return arr[cr][cc];
		 }
	        
		 if(cr >= arr.length || cc >= arr[0].length) {	// row/col ke length ke equal ya bahar jayega tab
			 return Integer.MAX_VALUE;
		 }
		 
		 int right = minPathSum(arr, cr, cc + 1);		// Right jayenge to col increase hoga
		 int down = minPathSum(arr, cr + 1, cc);		// Down jayenge to row increase hoga
		 
		 return Math.min(right, down) + arr[cr][cc];		// min path sum 
	 }
	 
	 //  Dynamic Approach
	 public static int minPathSumDP(int[][] arr, int cr, int cc, int[][] dp) {
		 
		 if(cr == arr.length-1 && cc == arr[0].length-1) {				// Base Case
			 return arr[cr][cc];
		 }
	        
		 if(cr >= arr.length || cc >= arr[0].length) {	// row/col ke length ke equal ya bahar jayega tab
			 return Integer.MAX_VALUE;
		 }
		 
		 if(dp[cr][cc] != -999999) {		// Applying dp here
			 return dp[cr][cc];
		 }
		 
		 int right = minPathSumDP(arr, cr, cc + 1, dp);		// Right jayenge to col increase hoga
		 int down = minPathSumDP(arr, cr + 1, cc, dp);		// Down jayenge to row increase hoga
		 
		 return dp[cr][cc] = Math.min(right, down) + arr[cr][cc];		// min path sum  dp m yaad kar rhe h
	 }


}
