package Lecture29OOPs_2;
import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		// Stack demo(LIFO- Last In First Out)
		Stack<Integer> st = new Stack<>();
		// push() , To add element in Stack
		st.push(10);					// Adding element in Stack
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		// peek() ,Will Print Top element of Stack
		System.out.println(st.peek());		// Top element will print
		System.out.println(st);				// All element in stack will print
		
		// pop() , Peek element will remove from stack
		System.out.println(st.pop());
		System.out.println(st);
		
		// isEmpty() , Will check(True/False) if Stack is empty or not
		System.out.println(st.isEmpty());
		
		// size() , Will show size of Stack
		System.out.println(st.size());
		
		// display() , Will display stack
		
	}
	

}
