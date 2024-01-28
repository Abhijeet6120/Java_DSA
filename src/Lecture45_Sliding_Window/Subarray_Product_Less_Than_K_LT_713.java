package Lecture45_Sliding_Window;

public class Subarray_Product_Less_Than_K_LT_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] arr = {10,5,2,6};
		int k = 100;
		System.out.println(Product_Less_Than_K(arr, k));

	}
	public static int Product_Less_Than_K(int[] arr, int k) {
		int ans = 0;
		int si = 0, ei=0;				//one line declaration
		int p = 1;
		while(ei<arr.length) {
			p = p * arr[ei];		// Grow
			while(p >= k && si <= ei) {			// Shrink
				p = p / arr[si];
				si++;
			}
			// ans update
			ans = ans +(ei-si +1);	
			ei++;
		}
		return ans;
	}

}
