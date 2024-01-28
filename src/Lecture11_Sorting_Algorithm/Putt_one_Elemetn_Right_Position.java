package Lecture11_Sorting_Algorithm;

public class Putt_one_Elemetn_Right_Position {
	public static void main(String[] args) {
		// TODO Putting last element(1)at right position 
		int[] arr = {2,3,4,6,7,8,1};
		Insertion_Element(arr, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	// Insertion sort
	public static void Insertion_Element(int[] arr, int i) {
		int j = i-1;
		int item = arr[i];
		while(j>=0 && arr[j]>item) {
			arr[j+1] = arr[j];
			arr[j] = item;
			j--;
		}
	}

}
