package Lecture9;

public class Array_Reverse_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,3,4,6,7,9,11,14,16,19,23,28,88,89};
		Reverse(arr,3,11);
		for(int i= 3;i<11;i++) {
			System.out.print(arr[i]+ " ");
			
		}
	}
	public static void Reverse(int[] arr, int i, int j) {

		// Two Pointer approach using here
//		i = 3;
//		j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
