package Lecture29OOPs_2;

public class Stack { 
// This code is for How we can create Stack using array(for interview if ask to create Stack the will do same
	
	protected int[] arr;		// Created array (Using array will create Stack
	private int idx = -1;		// index of array(can take 0 as well instead of -1)
	
	// Constructor of Class
	public Stack() {
		
		arr = new int[5];
	}
	// Taking input size of array
	public Stack(int n) {
		
		arr = new int[n];
	}

	// O(1) Checking if empty or not
	public boolean isEmpty() {
		return idx == -1;
	}

	// O(1) Checking if full or not
	public boolean isfull() {
		return size() == arr.length;
	}

	// O(1)	Adding element in Stack using push function
	public void push(int item) throws Exception {
		
		if (isfull()) {
			throw new Exception("bklol Stack full hai");
		}
		idx++;				// First increasing index 'idx' from -1 to 0 to push first item at index 0
		arr[idx] = item;		// Adding item in stack
	}

	// O(1)	Pop operation performing
	public int pop() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("bklol Stack khaali hai");
		}
		int rv = arr[idx];			// Removing element the decreasing index below 
		idx--;						// Index decreasing
		return rv;					// return popped element
	}

	// O(1)	Checking the Top element of stack
	public int peek() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("bklol Stack khaali hai");
		}
		
		int rv = arr[idx];		// Storing the peek element in rv variable

		return rv;				// Return peek element
	}
 
// O(1)	Size of stack 
	public int size() {
		return idx + 1;				
	}
	
// To Display the stack 
	public void Display() {
		for (int i = 0; i <= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();				// For the next line
	}

}