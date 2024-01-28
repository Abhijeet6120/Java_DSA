 package Lecture10;

public class Reverse_Algorithm {

	public static void main(String[] args) {
		// TODO Rotate array best time complexity code will not give error
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void rotate(int[] arr, int k) {
		int n = arr.length;
		k = k%n; // take modulo of k(eg- 105,208,etc.) 
		Reverse(arr, 0, n-k-1);  // Reverse first n-k element
		Reverse(arr, n-k, n-1);	 // reverse last ke k element 
		Reverse(arr, 0, n-1);	// All reverse
	}
	// Two pointer Approach 
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
