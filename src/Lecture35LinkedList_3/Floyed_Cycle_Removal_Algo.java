package Lecture35LinkedList_3;

public class Floyed_Cycle_Removal_Algo {

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
		
		// Optimized method(O(N))
		public void FloyedCycleRemoval() {
			
			Node meet  = hasCycle();
			if(meet == null) {
				return;
			}
			
			//3. Cycle Break
			Node fast = head;
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
			Floyed_Cycle_Removal_Algo ll = new Floyed_Cycle_Removal_Algo();
			ll.AddLast(1);
			ll.AddLast(2);
			ll.AddLast(3);
			ll.AddLast(4);
			ll.AddLast(5);
			ll.AddLast(6);
			ll.AddLast(7);
			ll.AddLast(8);
			
			ll.Display();
			ll.FloyedCycleRemoval();
		}
		

}
