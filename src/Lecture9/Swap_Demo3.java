package Lecture9;

public class Swap_Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50}; 
		int[] other= {100,200,300,400,500}; 
		System.out.println(arr[0] + " "+ arr[1]);  // 10, 20
		Swap(arr,other);
		System.out.println(arr[0] + " "+ other[0]); // 10, 100
// NOTE: Java is always pass by value not pass by reference.To change value of array use index instead of reference
 
	}
	// To change value of array use index instead of reference value
	public static void Swap(int[] arr, int[] other) {  // Changes happens in local variable of swap function not in array
		int[] temp = arr;
		arr = other;
		other = temp;
	} 

}
