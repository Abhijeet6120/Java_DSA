package Lecture33_LinkedList_1;

public class Linked_List {

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
	// get operations
	// O(1)
	public int getfirst() {
		return head.data;
		
	}
	// O(1)
	public int getlast() {
		return tail.data;
		
	}
	// O(N)
	public int getatAnyIndex(int k) {
		return GetNode(k).data;
		
	}
	
	// Remove from first operation O(1)
	public int removeFirst() {
		int rv = head.data;
		if(size==1) {
			head = null;
			tail = null;
			size--;
			
		}
		else {
			 
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		
		return rv;
	}
	
	// Remove from last operation
	//O(N)
	public int removeLast() {
		
		if(size == 1) {
			return removeFirst();
		}
		else {
			Node sl = GetNode(size - 2);
			int rv = tail.data;
			tail = sl;
			tail.next = null;
			size--;
			return rv;
		}
	}
	
	// Remove from at any index operation
	// O(N)
	public int removeAtAnyIndex(int k) {
		
		if(k==0) {
			return removeFirst();
		}
		else if(k == size -1) {
			return removeLast();
		}
		else {
			
			Node k_1th = GetNode(k - 1);
			Node kth = GetNode(k);
			k_1th.next = null;
			size--;
			return kth.data;
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
	
	// Adding at any index O(1)
	public void AddatIndex(int item, int k){
		
		if(k==0) {				// if index == 0 the phle add krega
			AddFirst(item);
		}
		else if(k == size) {	// if index == size the last mein add krega
			AddLast(item);
		}
		else {							// kisi particular index pr add kareneg
			Node nn = new Node();
			nn.data = item;
			Node k_1th = GetNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			size++;
		}
		
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

}
