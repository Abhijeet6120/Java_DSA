package Lecture53_DP4;

public class Wine_Problem {
	// SPOJ: Treats for the COWS
	
	public static void main(String[] args) {
		
		int[] wine = {2,3,5,1,4};
		
		System.out.println(maximum_Profit(wine, 0, wine.length-1, 1));	// Normal recursive
		System.out.println(maximum_Profit_BtmUP(wine));
		

	}
	
	// Normal Recursion approach
	public static int maximum_Profit(int[] wine, int i, int j, int year) {
		
		if(i > j) {
			return 0;
		}
		
		int fs = wine[i] * year + maximum_Profit(wine, i + 1, j, year + 1);
		int ls = wine[j] * year + maximum_Profit(wine, i , j-1, year + 1);
		
		return Math.max(ls, fs);
		
	}
	
	// Bottom Up Approach
	public static int maximum_Profit_BtmUP(int[] wine) {
		
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for(int i=0; i<dp.length; i++) {
			dp[i][i] = wine[i] * year;
		}
		year--;
		
		for(int gap = 1; gap < dp.length; gap++) {
			for(int j = gap; j < dp.length; j++) {
				int i = j - gap;
				int fs = wine[i] * year + dp[i+1][j];
				int ls = wine[j] * year + dp[i][j-1];
				
				dp[i][j] = Math.max(fs, ls);
			}
			year--;
		}
		return dp[0][dp[0].length-1];
	}
	
	/* Monu Bhaiya Sheet for practice
	 *  DP https://docs.google.com/spreadsheets/d/1kq0gps4e8mh7z3n7U53rcGY-WsqZoLa4F96qNNxJWsE/edit#gid=0				
		LeetCode https://docs.google.com/spreadsheets/d/1kq0gps4e8mh7z3n7U53rcGY-WsqZoLa4F96qNNxJWsE/edit#gid=0				

		Tree https://docs.google.com/spreadsheets/d/1KCjx5lbe5_TKjmfTRLXbhuR78VscHZogi5CBvSZfovg/edit#gid=0
		Must do questions https://docs.google.com/spreadsheets/d/1KCjx5lbe5_TKjmfTRLXbhuR78VscHZogi5CBvSZfovg/edit#gid=0
	 */

}
