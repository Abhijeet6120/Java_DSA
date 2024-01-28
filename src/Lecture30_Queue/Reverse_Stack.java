package Lecture30_Queue;

import java.util.*;

public class Reverse_Stack {

	public static void main(String[] args) {
		// Reverse stack using recursion
		
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverseStack(st);
		System.out.println(st);
		
	}
 // Function to reverse the stack
	private static void reverseStack(Stack<Integer> st) {
		// TODO Auto-generated method stub
		if(st.isEmpty()) {
			return;
		}
		
		int x = st.pop();
		reverseStack(st);
		Insert(st, x);
	}
	// Functrion Inserting element in stack
	public static void Insert(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int x = st.pop();
		Insert(st, item);				// recursive call 
		st.push(x);

	}

}
