package Lecture9;

public class Swap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,9,5,79,8,11,3,10,14,45,}; 
		System.out.println(arr[0] + " "+ arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " "+ arr[1]);

	}
	public static void Swap(int a,int b) {  // Changes happend in local variable of swap function not in array
		int temp = a;
		a = b;
		b = temp;
	} 

}
