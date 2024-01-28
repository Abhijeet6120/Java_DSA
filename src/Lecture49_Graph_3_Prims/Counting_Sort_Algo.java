package Lecture49_Graph_3_Prims;

import java.util.Arrays;

public class Counting_Sort_Algo {

	public static void main(String[] args) {
		// Counting Sort Algorithm
		
		int[] arr = {2,1,1,0,3,4,5,6,8,7,6,5,3,2,2};
		int[] a = Sort(arr);
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}
	
	public static int[] Sort(int[] arr) {
		
		int max = Arrays.stream(arr).max().getAsInt();		// one line to find max of array element

		int[] frq = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {

			frq[arr[i]]++;							// frq[2]=frq[2]+1;

		}

		for (int i = 1; i < frq.length; i++) {
			frq[i] = frq[i - 1] + frq[i];
		}
		int[] ans = new int[arr.length];
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			int pos = frq[arr[i]];
			ans[pos - 1] = arr[i];
			frq[arr[i]]--;
//			int e = arr[i];
//			int c = frq[]

		}

		// System.out.println(Arrays.toString(frq));
		return ans;
	}

	

}
