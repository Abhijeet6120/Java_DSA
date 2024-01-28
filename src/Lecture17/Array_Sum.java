package Lecture17;
import java.util.*;
public class Array_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,0,2,9};
		int[] arr2 = {3,4,5,6,7};
		
		// CValling function
		Sum_of_Two_Array(arr1, arr2);

	}
	// Function to array sum
	public static void Sum_of_Two_Array(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<>();
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		while(i>=0 && j>=0) {
			int sum = arr1[i]+arr2[j] +carry;
			list.add(sum % 10);
			carry = sum /10;					
			i--;
			j--;
		}
		// For 1st array
		while(i>=0) {
			int sum = arr1[i] +carry;
			list.add(sum % 10);
			carry = sum /10;
			i--;
		}
		// For 2nd array
		while(j>=0) {
			int sum = arr2[j] +carry;
			list.add(sum % 10);
			carry = sum /10;
			j--;
		}
		// Adding carry if remaining not zero
		if(carry !=0) {
			list.add(carry);
		}
		// Loop to display the sum of array
		for(i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println("END");
	}
}
