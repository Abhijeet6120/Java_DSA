package Lecture51_DP_2;

public class Zero_One_knapSack {
	// 0-1 KnapSack

	public static void main(String[] args) {
		
		int[] wt = { 1, 2, 3, 2, 2 };
		int cap = 4;						// Maximum capacity
		int[] val = { 8, 4, 0, 5, 3 };
		int[][] dp = new int[wt.length][];						// Dp  to store
		System.out.println(KnapSack(wt, val, cap, 0));

	}

	public static int KnapSack(int[] wt, int[] val, int cap, int i) {
		
		if(i == wt.length || cap == 0) {				// Base case
			return 0;
		}
		
		int inc =0, exc = 0;
		
		if(cap >= wt[i]) {
			inc = val[i] + KnapSack(wt,val, cap - wt[i], i+1);
		}
		
		exc = KnapSack(wt,val, cap, i+1);
		
		return Math.max(inc, exc);
	}

}
