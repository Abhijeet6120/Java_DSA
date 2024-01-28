package Lecture34_LinkedList_2;


public class Cyclic_LinkedList_LT_141 {
	
//	Definition for singly-linked list.
	 class ListNode { 
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	 class Solution {
		    public boolean hasCycle(ListNode head) {
		    	ListNode slow = head;
		    	ListNode fast = head;
		    	while(fast != null && fast.next != null) {
		    		slow = slow.next;				// 1 se aage bdha rhe hai
		    		fast = fast.next.next;			// 2 se aage bdha rhe hai
		    		if(slow == fast) {
		    			return false;
		    		}
		    	}
		    	return true;					// 
		        
		    }
	 }
}
