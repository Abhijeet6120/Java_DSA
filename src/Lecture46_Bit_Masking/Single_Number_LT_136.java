package Lecture46_Bit_Masking;

public class Single_Number_LT_136 {

	public static void main(String[] args) {
		// XOR operator using to solve this problem	
		
		int[] nums = {2,2,1};
		
		System.out.println(Single_Number(nums));
		

	}
	// Function
	public static int Single_Number(int[] nums) {
		int ans = 0;
		for(int i=0; i<nums.length; i++) {
			ans ^= nums[i];						// ans = ans^nums[i]
		}
		return ans;
	}

}
