package Lecture14;

public class Stairs_Case_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item = 13;							// If not found then print false
		System.out.println(Search(arr,item));

	}
	// Function to Search in 2D Array
	public static boolean Search(int[][] arr, int item) {
		int row= 0;
		int col = arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col] == item) {         // Checking item is quals to rxc value
				return true;
			}
			else if(arr[row][col] >  item) {	// Checking if rxc value greater than item then col decrease
				col--;
			}
			else {								// else row will increase
				row++;
			}
		}
		return false;
	}

}
