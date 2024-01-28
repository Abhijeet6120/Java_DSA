package Lecture10;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Rotate array with step 3(k=3)
// NOTE: This code is not optimized to rotate array , will give time limit exceed error 
		int[] arr = {8,-8,9,-9,10,-11,12};
		int k = 3;
		rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k%n; // take modulo of k(eg- 105,208,etc.) 
		for(int j=1;j<=k;j++) {   // Loop for k
			int item = arr[n-1];
			for(int i = n-2;i>=0;i--) {
				arr[i+1] = arr[i];
			}
			arr[0] = item;
		}
	}

}
