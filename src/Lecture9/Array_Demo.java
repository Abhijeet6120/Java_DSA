package Lecture9;
import java.util.*;
public class Array_Demo {

	public static void main(String[] args) {
		// Taking input in array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// Loop to take multiple array input
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		Display(arr);  // Calling function to show all array
	}
	// Fucntion to print input in array
	public static void Display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
