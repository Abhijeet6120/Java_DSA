package Lecture9;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,3,4,6,7,9};
		Reverse(arr);
		// This loop used to print reverse array
		for(int i= 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
//		for(int i=arr.length;i>0;i--) {
//			System.out.println(arr[i]);
//		}
	}
	public static void Reverse(int[] arr) {
//		for(int i=arr.length-1;i>=0;i--) { // This is to print array in reverse
//			System.out.print(arr[i]);
//		}
		// Two Pointer approach using here
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
