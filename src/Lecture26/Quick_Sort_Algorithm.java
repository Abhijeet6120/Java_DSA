package Lecture26;

public class Quick_Sort_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,7,2,1,8,3,4};
		Sort(arr,0,arr.length-1);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public static void Sort(int[] arr, int si, int ei) {
		// Quick Sort Algorithm
		
		if(si >= ei) {			// Base case
			return;
		}
		int idx = Partition(arr, si,ei);		// These 3 lines are quick sort 
		Sort(arr, si, idx - 1);
		Sort(arr, idx + 1, ei);
		
	}
	// Function for partitioning
	public static int Partition(int[] arr, int si,  int ei) {
		// TODO Auto-generated method stub
		int item = arr[ei];						// considered item = pivot element(last element)
		int idx = si;
		
		for(int i=si; i<ei; i++) {
			if(arr[i] < item) {				
				int temp = arr[idx];	// Swapping index value
				arr[idx] = arr[i];
				arr[i] = temp;
				idx++;
			}
		}
		// agar if cond nhi chala then idx ko last index(ei) ko swap kar rhe h
		int temp = arr[idx];
		arr[idx] = arr[ei];
		arr[ei] = temp;
		
		return idx;			// return index of item 
	}
}
