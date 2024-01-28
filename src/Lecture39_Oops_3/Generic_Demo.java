package Lecture39_Oops_3;

public class Generic_Demo {
	// Generic-One time define karo multiple time use karo
	
	public static void main(String[] args) {
		// Generic concept used for non primitive
		
		String[] arr = {"Raj","Abhi","Jeet","Ankita","Kaju","Kismis"};
		Display(arr);
		
		Integer[] arr1 = {10,20,30,40,50,60,70};
		Display(arr1);

	}
	// T will be converted according to data type you have array
	public static <T>void Display(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
