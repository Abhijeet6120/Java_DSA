package Lecture34_LinkedList_2;


public class Reverse_Linked_List_LT_206 {
	
//	Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	class Solution {
		
	    public ListNode reverseList(ListNode head) {
	    	return reverse(head, null);
	        
	    }
	    
		public ListNode reverse(ListNode curr, ListNode prev) {
			
			if(curr == null) {				// Base case
				return prev;			
			}
			ListNode temp = reverse(curr.next, curr);		// recursive call
			curr.next = prev;
			return temp;								// reversed Head  Node
		}
	}

}
