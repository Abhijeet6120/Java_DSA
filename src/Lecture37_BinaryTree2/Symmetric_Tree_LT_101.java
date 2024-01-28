package Lecture37_BinaryTree2;

public class Symmetric_Tree_LT_101 {
	
	 // Definition for a Binary tree node.
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
	    public boolean isSymmetric(TreeNode root) {
	    	return Symmetric(root.left, root.right);	// Calling function
	        
	    }
	    // mirroring tree
	    public boolean Symmetric(TreeNode root1 , TreeNode root2) {
	    	
	        if(root1 == null && root2 == null) {		// Case 1
	        	return true;
	        }
	        
	        if(root1 == null || root2 == null) {	// // Case 2: checking if any one root has null 
	        	return false;
	        }
	        
	        if(root1.val != root2.val) {		// Case 3
	        	return false;
	        }
	        
	        boolean left = Symmetric(root1.left , root2.right);	// recursive call of left
	        boolean right = Symmetric(root1.right , root2.left);	// recursive call of right	
	        
	        return left && right;					// if both true then true/if both false then false
	    }
	}

}
