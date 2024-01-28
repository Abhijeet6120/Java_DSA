package Lecture30_Queue;

public class Queue {
	// Queue data structure (FIFO-First In First Out)
	protected int[] arr;			// Converted private to protected for dynamic queue class
	protected int front=0;			// index(front) of queue
	
	private int size = 0;			// initial size of Queue
	
	// Manually set of queue size
	public Queue() {
		arr = new int[5];
	}
	// Takne input 'n' size of queue
	public Queue(int n) {
		arr = new int[n];
	}
	
	// isEmpty operator (To check if empty queue)
	public boolean isEmpty() {
		
		return size == 0;			
	}
	
	//To check if queue is full or not
	protected boolean isFull() {
		
		return size == arr.length;
	}
	
	// Enqueue operation
	public void Enqueue(int item) throws Exception{
		
		if(isFull()) {
			throw new Exception("Baklol Queue full ho gya");
		}
		
		int idx = (front + size) % arr.length;	// taking modulo for circular queue
		arr[idx] = item;				// Adding element
		size++;				// increasing size
	}
	

	// Dequeue operation(Removing element from queue)
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Baklol Queue khaali hai");
		}
		int rv = arr[front];			// 1st index ko yaad kar rahe hai
		front = (front+1) % arr.length;						// index increasing in circular queue
		size--;					//size decreasing

		return rv;			
	}
	
	// size operation
	public int size() {
		return size;
	}
	
	// To get 1st element
	public int getFront() throws Exception{
		
		if(isEmpty()) {							// if blank array then throw error
			throw new Exception("Baklol Queue khaali hai");
		}
		int rv = arr[front];
		return rv;
		
	}
	
	// Display operation
	public void Display() {
		for(int i=0; i<size; i++) {
			int idx = (front+i) % arr.length;	// Modulo for circular queue
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	
	// Main function
	public static void main(String[] args) throws Exception{
		Queue  q = new Queue();
		
		q.Enqueue(10);		// Adding element
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		System.out.println(q.Dequeue());		// removing 1st element
		System.out.println(q.Dequeue());		// removing 2nd element
		q.Enqueue(50);				
		q.Enqueue(60);		// Adding element 
		q.Display();
		
	}
	
	
}
