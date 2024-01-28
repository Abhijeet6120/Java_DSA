package Lecture31_Stack_Queue_Problems;

import java.util.*;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,9,13,21,3};
//		Scanner scn = new Scanner(System.in);
//
//		int t = scn.nextInt();
//
//		while (t > 0) {
//			int n = scn.nextInt();
//			int[] arr = new int[n];
//
//			for (int i = 0; i < arr.length; i++)
//				arr[i] = scn.nextInt();
//
		nextGreaterElement(arr);
//
//			t--;
//		}

	}
	// Function to check NGE 
	public static void nextGreaterElement(int[] arr) {
		
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];			// to store NGE
		
		for(int i=0; i<arr.length; i++) {
			
			while(!st.isEmpty()&& arr[i] > arr[st.peek()]) {	// checking is stack empty and element gt than st k peek se
				
				ans[st.pop()] = arr[i];				// LIFO operation in stack Performing
		// jo value pop hoga us index pr hum arr ki ith idex value daal rhe hai ans array mein
			}
			st.push(i);					// else adding element in stack
			
		}
		
		// This loop for checking if not in stack the add -1
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] +" "+ans[i]);
		}
		

	}

}
