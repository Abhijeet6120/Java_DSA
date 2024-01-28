package Lecture33_LinkedList_1;

public class LinkedList_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List ll = new Linked_List();
		
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll .AddLast(90);
		ll.AddatIndex(108, 2); 
		ll.Display();		// Calling display function to print all element
		System.out.println(ll.removeFirst());
		ll.Display();
		/*System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatAnyIndex(2));	// passing index 2
	*/
	}

}
