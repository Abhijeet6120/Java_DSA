package Lecture12;

public class Kadens_Algorithm {

	public static void main(String[] args) {
		// TO find the maximum sum of subarray
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(MaximumSum(arr));
	}
	
	public static int MaximumSum(int[] arr) {
		
		int ans = Integer.MIN_VALUE;   // Considering -infinity
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
	
//			for(int j=i;j<arr.length;j++) {
				sum = sum+arr[i];
				ans = Math.max(ans, sum);
// Kadens algorith says if overall sum is -ve then start with sum = 0 and will move to next the index;
				if(sum<0) {
					sum = 0;
				}
//			}
			
		}
		return ans;
	}

}
