package Lecture38_Binary_Search_Tree;

public class Delete_Node_in_BST_LT_450 {

	//Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {
	      }
	      TreeNode(int val) { 
	    	  this.val = val; 
	    	  }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	class Solution {
	    public TreeNode deleteNode(TreeNode root, int key) {
	        
	    	if (root == null) {					// Base Case
	    		return null;
	    	}
	    	
	    	if(root.val < key) {								// Case-1(Root< Key then will go in right)
	    		root.right = deleteNode(root.right,  key);
	    	}
	    	else if(root.val > key) {							// Case-2(Root> Key then will go in left)
	    		root.left = deleteNode(root.left, key);
	    	}
	    	// Element mil gya delete karna h
	    	else {												// Case-3
	    		
	    		if(root.left == null) {						// Left mein null hai to right m check karenge
	    			return root.right;
	    		}
	    		else if(root.right == null) {			// right mein null hai to left m check karenge
	    			return root.left;
	    		}
	    		else {											// 0 children h(not in left/right)
	    			int m = max(root.left);
	    			root.left = deleteNode(root.left, m);
	    			root.val = m;
	    			
	    		}
	    	}
	    	return root;										
	    }
	    
	    public int max(TreeNode root) {
	    	if(root == null) {
	    		return Integer.MIN_VALUE;
	    	}
	    	
	    	int r = max(root.right);
	    	return Math.max(r, root.val);
	    }
	}
}
