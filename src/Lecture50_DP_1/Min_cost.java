package Lecture50_DP_1;

public class Min_cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,100,1,1,1,100,1,1,100,1};
		
		int[] DP = new int[arr.length];					// DP arr m yaad rakhne k liye
		
		int f = min_Cost(arr,0);
		int s = min_Cost(arr,1);
		
		System.out.println(Math.min(f, s));
		
		System.out.println(min_CostDP(arr,0,DP));
	}
	
	// Top Down Approach 
	public static int min_CostDP(int[] arr, int i, int[] DP) {
		
		if(i >= arr.length) {
			return 0;
		}
		
		if(DP[i] != 0) {
			return DP[i];
		}
		
		int f = min_CostDP(arr, i+1, DP);
		int s = min_CostDP(arr, i+2, DP);
		
		DP[i] = arr[i] + Math.min(f,s);
		return  DP[i];
	}
	
	// Normal Recursion approach
	public static int min_Cost(int[] arr, int i) {
		
		if(i >= arr.length) {
			return 0;
		}
		
		int f = min_Cost(arr, i+1);
		int s = min_Cost(arr, i+2);
		return arr[i] + Math.min(f,s);
	}

}
