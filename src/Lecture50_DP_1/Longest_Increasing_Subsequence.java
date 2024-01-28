package Lecture50_DP_1;
import java.util.*;

public class Longest_Increasing_Subsequence {

	public static void main(String[] args) {
		// 
		
		int[] arr = {10,9,2,5,3,7,101,18};
		
		System.out.println(list(arr));

	}
	
	public static int list(int[] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, 1);
		
		for( int i=1; i<dp.length; i++) {
			for(int j=i-1; j>=0; j--) {
				if(arr[i] < arr[i]) {
					int l = dp[j];
					dp[i] = Math.max(dp[i], l+1);
				}
			}
		}
		
		return Arrays.stream(dp).max().getAsInt();
	}
}
