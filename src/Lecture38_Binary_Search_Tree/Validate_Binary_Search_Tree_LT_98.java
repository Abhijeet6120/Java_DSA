package Lecture38_Binary_Search_Tree;

public class Validate_Binary_Search_Tree_LT_98 {
	
	//Definition for a binary tree node.
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
	    public boolean isValidBST(TreeNode root) {
	    	return ValidBst(root).isBst;
	        
	    }
	   
	    public BstPair ValidBst(TreeNode root) {
	    	
	    	if(root == null) {
	    		return new BstPair();
	    	}
	    	
	    	BstPair lbst = ValidBst(root.left);
	    	BstPair rbst = ValidBst(root.right);
	    	BstPair sbst = new BstPair();
	    	
	    	sbst.min = Math.min(root.val, Math.min(lbst.min,rbst.min));		
	    	sbst.max = Math.max(root.val, Math.max(lbst.max,rbst.max));
	    	sbst. isBst = lbst.isBst && rbst.isBst && lbst.max<root.val && rbst.min>root.val;
	    	
	    	return sbst;
	    }
	    
	    class BstPair{
    		boolean isBst = true;
    		Long min = Long.MAX_VALUE;			// For min value
    		Long max = Long.MIN_VALUE;			// For max value
    	}
	}

}
