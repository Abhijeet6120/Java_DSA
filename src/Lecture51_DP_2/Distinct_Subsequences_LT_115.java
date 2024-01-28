package Lecture51_DP_2;

import java.util.Arrays;

public class Distinct_Subsequences_LT_115 {
	// LeetCode: 115. Distinct Subsequences

		public static void main(String[] args) {
		
		String coins = "rabbbit";			// coins
		String amount = "rabbit";			// amount
		int[][] dp = new int[amount.length()][coins.length()];
		
		for(int[] a: dp ) {
			Arrays.fill(a, -1);;
		}
		
		System.out.println(coin_Change(coins, amount,0, 0,dp));
		System.out.println(coin_Change_BottomUp(coins, amount));

	}
		// i-->s-->coin
		// j-->t-->amount
	public static int coin_Change(String coins, String amount, int i, int j, int[][] dp) {
		
		if(i == coins.length()) {
			return 1;
		}
		
		if(j == amount.length()) {
			return 0;
		}
		
		if(dp[j][i] != -1) {
			return dp[j][i];
		}
		
		int inc =0, exc = 0;					// inc= inclusion exc= exclusion
		if(coins.charAt(i) == amount.charAt(j)) {
			inc = coin_Change(coins, amount, i+1 , j+1,dp);
		}
		
		exc = coin_Change(coins, amount, i+1,j, dp);
		return dp[j][i] = exc + inc;
	}
	
	// Bottom Up approach
	public static int coin_Change_BottomUp(String coins, String amount) {
		
		int[][] dp = new int[amount.length()+1][coins.length()+1];
		for(int i = 0; i<dp[0].length; i++) {				// for cols
			dp[0][i] = 1;
		}
		
		for(int am =1; am<dp.length; am++) {
			for(int i = 1; i < dp[0].length; i++) {
				int inc = 0, exc = 0;
				if(am >= coins.charAt(i-1)) {
					inc = dp[am - coins.charAt(i-1)][i];
				}
				exc = dp[am][i-1];
				dp[am][i] = inc + exc;
			}
		}
		return dp[dp.length - 1][dp[0].length-1];
	}


}
