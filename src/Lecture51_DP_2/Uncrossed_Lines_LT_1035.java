package Lecture51_DP_2;

public class Uncrossed_Lines_LT_1035 {
	// LeetCode: 1035-Uncrossed Lines
	
	public static void main(String[] args) {

		int[] text1 = {2,5,1,2,5};
		int[] text2 = {10,5,2,1,5,2};
		
		System.out.println(lcsBottomUp(text1, text2));

	}
	
	// only difference is here arr
	public static int lcsBottomUp(int[] text1, int[] text2) {
		int[][] dp = new int[text1.length+1][text2.length+1];
		
		for(int i=1; i<dp.length; i++) {
			for(int j=1; j<dp[0].length; j++) {
				int ans = 0;
				if(text1[i-1] == text2[j-1]) {				// Agar dono ka first character match kiya to
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
