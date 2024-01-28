package Lecture51_DP_2;

import java.util.*;

public class LCS {		// 20/01/2024
	
	//LeetCode-1143: Longest Common Subsequence
	
	public static void main(String[] args) {
	
	String text1 = "abcde";
	String text2 = "ace";
	int[][] dp = new int[text1.length()][text2.length()];		// created dp 2d array casue 2 arguments have to maintain
	for(int[] a : dp) {
		Arrays.fill(a, -1);
	}
	System.out.println(lcs(text1, text2, 0,0,dp));
	System.out.println(lcsBottomUp(text1, text2));
	
	
}

	// i--> Text1 k liye
	// j--> text2 k liye
	public static int lcs(String text1, String text2, int i, int j, int[][] dp) {
		
		if(i==text1.length() || j == text2.length()) {			// Base Case
			return 0;
		}
		
		if(dp[i][j] != -1) {				// checking if not equal to -1
			return dp[i][j];
		}
		
		int ans = 0;
		if(text1.charAt(i) == text2.charAt(j)) {				// agar dono ka first character match kiya to
			ans = 1 + lcs(text1, text2, i+1, j+1, dp);
			
		}
		else {
			int f = lcs(text1, text2, i+1, j,dp);					
			int s = lcs(text1, text2, i, j+1, dp);
			
			ans = Math.max(f, s);						// Max of text1 and text2
		}
		return dp[i][j] = ans;			// yaad kar rhe hai
        
    }
	
	public static int lcsBottomUp(String text1, String text2) {
		int[][] dp = new int[text1.length()+1][text2.length()+1];
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				int ans = 0;
				if(text1.charAt(i-1) == text2.charAt(j-1)) {				// agar dono ka first character match kiya to
					ans = 1 + dp[i-1][j-1];
					
				}
				else {
					int f = dp[i-1][j];					
					int s = dp[i][j-1];
					
					ans = Math.max(f, s);						// Max of text1 and text2
				}
				dp[i][j] = ans;	
			}
		}
		
		return dp[dp.length -1][dp[0].length -1];
	}
}
