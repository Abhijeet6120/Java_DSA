package Lecture35LinkedList_3;

public class Cycle_Removal {
	
	class Node{					// hash type
		int data;			// internal data
		Node next;			// Address of next Element/Node
	}
	
	private Node head;			// first element(jisse koi edit na kar sake)
	private Node tail;			// last element
	private int size;			// size of linked list

	// AddFirst operation O(1)
	public void AddFirst(int item) {			// input item
		
		Node nn = new Node();			// created object 'nn' of node class
		nn.data = item;				// adding input in 'nn'
		
		if(size == 0) {		// if Size ==0 the making Head/Tail both same
			head = nn;		
			tail = nn;
			size++;
	
		}
		else {					// if size is not zero
			nn.next = head;		
			head = nn;
			size++;
			
		}
	}
	
		// AddLast Operation O(1)
		public void AddLast(int item) {
			
			if(size == 0) {
				AddFirst(item);		// calling function
			}
			else {						// For size != 0
				Node nn = new Node();	// created new node
				nn.data = item;			// adding from last then Tail will increase
				tail.next = nn;
				tail = nn;
				size++;
			}
			
		}
		
		// getNode Operation O(1)
		private Node GetNode(int k) {
			Node temp = head;
			for(int i=0; i<k; i++) {
				temp = temp.next;
			}
			
			return temp;
		}
		
		// To Create Linked list Cycle
		public void CreateCycle() {
			tail.next = GetNode(2);
		}
		
		// For cycle checking true/false(Cycle detection) 
		public Node hasCycle() {
	    	Node slow = head;
	    	Node fast = head;
	    	while(fast != null && fast.next != null) {
	    		slow = slow.next;				// 1 se aage bdha rhe hai
	    		fast = fast.next.next;			// 2 se aage bdha rhe hai
	    		if(slow == fast) {
	    			return slow;
	    		}
	    	}
	    	return null;				
	        
	    }
		
		// Function for cycle removal(O(n*n))
		
		public void Cycleremoval() {
			
			Node meet  = hasCycle();
			if(meet == null) {
				return;
			}
								
			Node start = head;					// Loop in linked list
			while(start != null) {
				Node temp = meet;
				while(temp.next != meet) {
					if(temp.next == start) {
						temp.next = null;
						return;
					}
					temp = temp.next;
				}
				start = start.next;			// 1 se aage bdha rhe hai
			}
			
		}
		
		// Optimized method(O(N))
		public void Cycleremoval2() {
			
			Node meet  = hasCycle();
			if(meet == null) {
				return;
			}
			// 1.cycle length
			int count = 1;
			Node temp = meet;
			while(temp.next != meet) {
				count++;
				temp = temp.next;
			}
			//2. Fast to count distance move karna
			Node fast = head;
			for(int i=0;i<count; i++) {
				fast = fast .next;
			}
			//3. Cycle Break
			Node slow = head;
			while(slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}
			fast.next = null;
			
		}
		// Display operation
		public void Display() {
			
			Node temp = head;			// Storing head in temp var
			while(temp != null) {		// Loop to print all element
				System.out.print(temp.data+"-->");
				temp = temp.next;				// going to the next element address
			}
			System.out.println(",");
		}
		
		public static void main(String[] args) {
			Cycle_Removal ll = new Cycle_Removal();
			ll.AddLast(1);
			ll.AddLast(2);
			ll.AddLast(3);
			ll.AddLast(4);
			ll.AddLast(5);
			ll.AddLast(6);
			ll.AddLast(7);
			ll.AddLast(8);
			ll.AddLast(9);
			ll.Display();
			ll.Cycleremoval();		// 1st method
			ll.Cycleremoval2();		// 2nd method
		}
		

}
