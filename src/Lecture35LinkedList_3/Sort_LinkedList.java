package Lecture35LinkedList_3;

public class Sort_LinkedList {

	// Definition for singly-linked list.
		 public class ListNode {
		     int val;
		     ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		 }
		 
	// Sorting linked list using merge sort algorithm
		 class Solution {
			    public ListNode sortList(ListNode head) {
			    	
			    	
					return head;
			        
			    }
			    
			    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			    	ListNode Dummy = new ListNode();
			    	ListNode temp = Dummy;
			    	
			    	while(list1 != null && list2 != null) {
			    		if(list1.val > list2.val) {
			    			Dummy.next = list2;
			    			list2 = list2.next;		// list2 ko 1-1 aage bdha rhe hai
			    			Dummy = Dummy.next;
			    		}
			    		else {
			    			Dummy.next = list1;
			    			list1 = list1.next;		// list1 ko 1-1 aage bdha rhe hai
			    			Dummy = Dummy.next;
			    		}
			    	}
			    	if(list1 == null) {
			    		Dummy.next = list2;
			    	}
			    	if(list2 == null) {
			    		Dummy.next = list1;
			    	}
			        return temp.next;
			    }
			    
			    // Middle element
			    
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
