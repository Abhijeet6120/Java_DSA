package Lecture18_Recursion_1;

public class First_Occurence {

	public static void main(String[] args) {
		// TODO Find the number where is is first found
		
		int[] arr = {2,3,4,3,4,1,2,5,3,8,4};
		int item = 4;
		Find_Item(arr,item,0);
	}
	
	// Function to find the first occurrence of 
	public static int Find_Item(int[] arr, int item, int i) {
		
		if(i == arr.length) {		// Base case(Termination condition)
			return -1;
		}
		
		if(arr[i] == item) {
			return i;
		}
	
		return Find_Item(arr,item,i+1);
	}

}
