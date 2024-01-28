package Lecture26;

public class Merge_Sort_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,3,2,1};
		
		int[] ans = Sort(arr, 0, arr.length-1);
		for(int i =0; i<ans.length; i++) {			// print updated array
			System.out.print(ans[i]+" ");
		}
		
	}
	//TC=o(nlog(n)), S.C = O(n)
	public static int[] Sort(int[] arr, int si, int ei) {
		if(si == ei) {					// Base case
			int[] bs = new int[1];
			bs[0] = arr[si];
			return bs;
		}
		
		int mid = (si+ei) / 2;
		int[] fs = Sort(arr, si, mid);			// Recursive 1st array function
		int[] ss = Sort(arr, mid+1, ei);		// 2nd array
		return merge_Two_Array(fs, ss);			// return merged array
	}
	// Merging both divided array
	public static int[] merge_Two_Array(int[] arr1, int[] arr2) {
		
		int n = arr1.length;
		int m = arr2.length;
		
		int[] ans = new int[n+m];
		
		int i=0, j=0, k=0;				// Initializing the i,j,k in single line
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
