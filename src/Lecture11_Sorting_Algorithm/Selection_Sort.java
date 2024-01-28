package Lecture11_Sorting_Algorithm;

public class Selection_Sort {

	public static void main(String[] args) {
		// Selection Sort
		int[] arr = {5,3,4,2,1};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void Sort(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			int min = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
	}

}
