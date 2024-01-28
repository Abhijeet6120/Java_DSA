package Lecture26;
import java.util.*;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,3,4,5,7,8,11};
		int[] arr2 = {1,2,5,6,9,11,13,14};
		
		int[] result = merge_Two_Array(arr1, arr2);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
	public static int[] merge_Two_Array(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int[] ans = new int[n+m];
		
		int i=0, j=0, k=0;			// Initializing the i,j,k in single line
		while(i<n && j<m) {				// while arr1[i]< arr2[j]
			
			if(arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			}
			else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		// if arr1 has remaining element
		while(i<n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}
		// if arr2 has remaining element
		while(j<m) {
			ans[k] = arr2[j];
			k++;
			j++;
		}
		return ans;
				
	}

}
