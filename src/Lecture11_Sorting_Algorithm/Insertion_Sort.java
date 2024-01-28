package Lecture11_Sorting_Algorithm;

public class Insertion_Sort {

	public static void main(String[] args) {
		// Insertion Concept refer Put one element at their right position
		int[] arr = {2,3,4,6,7,8,1};
		Insertion_Element(arr, arr.length-1);
		for(int i=0;i<arr.length;i++) {				// To print all sorted element
			System.out.print(arr[i]+" ");
		}
		
		
	}
	// Loop for insertion sort
//	public static void sort(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			Insertion_Element(arr,i);
//		`}
//	}

	// Loop swap unsorted element at their right position
	public static void Insertion_Element(int[] arr, int i) {
		int j = i-1;							
		int item = arr[i];					// i= array length, j= jisse compare kar rhe h
		while(j>=0 && arr[j]>item) {		// Sorting from last element
			arr[j+1] = arr[j];
			arr[j] = item;
			j--;
		}
	}

}
