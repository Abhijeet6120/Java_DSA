package Lecture34_LinkedList_2;

public class Intersection_of_Two_Linked_Lists_LT_160 {
//	 Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) {
	         val = x;
	         next = null;
	     }
	 }
	 
	 public class Solution {
		    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		    	
		    	ListNode A1 = headA;			// A1 = BoyFrined
		    	ListNode B1 = headB;			// B1 = GirlFriend
		    	
		    	while(A1 != B1) {
		    		if(A1 == null) {
		    			A1 = headB;
		    		}
		    		else {
		    			A1 = A1.next;
		    		}
		    		
		    		if(B1 == null) {
		    			B1 = headA;
		    		}
		    		else {
		    			B1 = B1.next;
		    		}
		    		
		    	}
		    	return A1;
		    }
		}
}
