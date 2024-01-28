package Lecture31_Stack_Queue_Problems;

import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// LT_Daily Temperature
		int[] arr = {30,35,40,38,35};
		
		cal_Span(arr);						// Calling function
		

	}
	// Function to check stock span 
		public static void cal_Span(int[] arr) {
			
			Stack<Integer> st = new Stack<>();
			int[] ans = new int[arr.length];			// to store NGE
			
			for(int i=0; i<arr.length; i++) {
				
				while(!st.isEmpty()&& arr[i] > arr[st.peek()]) {	// checking is stack empty and element gt than st k peek se
					
					st.pop();				// LIFO operation in stack Performing
					
				}
				if(st.isEmpty()) {
					ans[i] = i + 1;
				}
				else {
					ans[i] = i - st.peek();
				}
				
				st.push(i);					// else adding element in stack
				
			}
			
			for(int i=0; i<arr.length; i++) {
//				System.out.print(arr[i] +" ");
				System.out.print(ans[i]+",");
			}
			System.out.println("END");

		}

}
