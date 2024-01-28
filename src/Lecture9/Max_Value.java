package Lecture9;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,79,8,11,9,10,14,45,};   // Hardcode array
//		int target = 11;

		System.out.println(Maximum_value(arr));
	}
	public static int Maximum_value(int[] arr) {
//		int m = arr[0];     // Considering 1st index as maximum value
		int m = Integer.MIN_VALUE;    // -2^31  2nd method to get max value
		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>m) {
//				m = arr[i];           // printing 
//			}
			m = Math.max(m, arr[i]);
		}
		return m;
	}

}
