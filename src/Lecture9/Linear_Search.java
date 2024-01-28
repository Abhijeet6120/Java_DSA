package Lecture9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6,8,11,9,10,14};   // Hardcode array
		int target = 11;
//		System.out.println(arr.length); // Will give array size/length
		System.out.println(Search_element(arr, target));
	}
		public static int Search_element(int[] arr, int target) {
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == target) {
					return i;           // printing 
				}
			}
			return -1;   // Not found element in array
		}

}
