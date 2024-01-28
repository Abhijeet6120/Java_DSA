package Lecture37_BinaryTree2;

public class Flip_Equivalent_Binary_Trees_LT_951 {
	
	// Definition for a binary tree node.
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	 
	class Solution {
	    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
	        
	    	if(root1 == null && root2 == null) {		// base case 1
	        	return true;
	        }
	        
	        if(root1 == null || root2 == null) {	// checking of no(// base case 2)
	        	return false;
	        }
	        
	        if(root1.val != root2.val) {			// base case 3
	        	return false;
	        }
	        
	        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
	        boolean NoFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
	        
	        return flip && NoFlip;
	    }
	}

}
