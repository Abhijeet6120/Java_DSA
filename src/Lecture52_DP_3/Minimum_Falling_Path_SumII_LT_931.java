package Lecture52_DP_3;

import java.util.*;

public class Minimum_Falling_Path_SumII_LT_931 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,1,3},{6,5,4},{7,8,9}};
		
		int[][] dp = new int[arr.length][arr[0].length];
		
		for(int[] a: dp) {
			Arrays.fill(a, -9999999);
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<arr[0].length; i++) {
			
			ans = Math.min(ans, falling_Path_Sum2(arr,0,i,dp));
		}
		
		System.out.println(ans);
	}
	
	public static int falling_Path_Sum2(int[][] arr, int cr, int cc, int[][] dp) {
		
		if(cr == arr.length - 1) {						// Base Case 2
			return arr[cr][cc];
		}
		
		if(dp[cr][cc] != -9999999) {
			return dp[cr][cc];
		}
		int ans = Integer.MAX_VALUE;
		for(int i=0; i<arr[0].length; i++) {
			if(i != cc) {
				ans  = Math.min(ans, falling_Path_Sum2(arr, cr+1, i,dp));
			}
		}
		
		
		return dp[cr][cc] = ans + arr[cr][cc];
	}

}
