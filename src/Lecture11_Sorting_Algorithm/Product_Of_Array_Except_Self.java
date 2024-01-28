package Lecture11_Sorting_Algorithm;

public class Product_Of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6};
		// Strong product in array format
		int[] ans = Product_Array(arr);
// Loop to access all stored element in ans variable
		for(int i = 0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}
// Function return in array format as we have taken int in array format(int[])
	public static int[] Product_Array(int[] arr) {
		int n = arr.length;
// Loop for left side array product(Auxiliary array) excluding self
		int[] left  = new int[n];
		left[0] = 1;
		for(int i=1;i<n;i++) {
			left[i] = left[i-1] * arr[i-1];
		}
// Loop for left side array product(Auxilarry array)
		int[] right  = new int[n];
		right[n-1] = 1;
		for(int i=n-2;i>=0;i--) {
			right[i] = right[i+1] * arr[i+1];
		}
// Loop for Both prduct(Left*right) 
		
		for(int i=0;i<n;i++) {
			left[i] = left[i]*right[i];
		}
		return left;
		
		//is also fine
		/*for(int i=0;i<n;i++) {
			right[i] = left[i]*right[i];
		}
		return right;  */
		
	}

}
