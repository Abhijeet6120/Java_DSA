package Lecture34_LinkedList_2;

public class Middle_Element_LT_876 {
	
//	Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {
	    	 
	     }
	     ListNode(int val) {
	    	 this.val = val; 
	    }
	    ListNode(int val, ListNode next) { 
	    	 
	    	 this.val = val; this.next = next; 
	    }
	 }
	
	class Solution {
	    public ListNode middleNode(ListNode head) {
	    	ListNode slow = head;
	    	ListNode fast = head;
	    	while(fast != null && fast.next != null) {
	    		slow = slow.next;				// 1 se aage bdha rhe hai
	    		fast = fast.next.next;			// 2 se aage bdha rhe hai
	    	}
	    	return slow;					// 
	        
	    }
	}

}
