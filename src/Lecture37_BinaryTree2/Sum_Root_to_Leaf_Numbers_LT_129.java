package Lecture37_BinaryTree2;

public class Sum_Root_to_Leaf_Numbers_LT_129 {
	
	// Definition for a binary tree node.
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
	    public int sumNumbers(TreeNode root) {
	        return Numbers(root, 0);
	    	
	    }
	    
	    public int Numbers(TreeNode root, int sum) {
	    	
	    	if(root == null) {				// Base case
	    		return 0;
	    	}
	    	
	    	if(root.left == null && root.right == null) {	// Base case 2
	    		return sum * 10 + root.val;
	    	}
	    	
	    	int left = Numbers(root.left, sum * 10 + root.val);
	    	int right = Numbers(root.right, sum * 10 + root.val);
	    	
	    	return left + right;	// return left+right sum
	    }
	}

}
