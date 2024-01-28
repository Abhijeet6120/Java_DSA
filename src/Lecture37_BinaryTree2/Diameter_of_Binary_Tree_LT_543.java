package Lecture37_BinaryTree2;


public class Diameter_of_Binary_Tree_LT_543 {
	
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
	 /* TC = O(n*n) Simple solution
	class Solution {
	    public int Diameter(TreeNode root) {
	        
	    	if(root == null) {
	    		return 0;
	    	}
	    	
	    	int leftDiameter = Diameter(root.left);		// Left Diameter
	    	int rightDiameter = Diameter(root.right);	// right Diameter
	    	int selfDiameter = ht(root.left) + ht(root.right) + 2;	// left height+ right height
	    	
	    	return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));	// max of ld,rd,Sd
	    }
	  
	    // Height of Tree
		public int ht(TreeNode node) {
			
			if(node == null) {				// Base Case
				return -1;
			}
			
			int lh = ht(node.left);
			int rh = ht(node.right);
			return Math.max(lh,rh)+1;	
	}
		*/
	  
/************** 2nd Method(Optimized Code) TC= O(N)************/
	  
	  class Solution {
		  
		  public int diameterOfBinaryTree(TreeNode root) {
			  
			  return Diameter(root).dia;
			  
	       }
		  
		    public DiaPair Diameter(TreeNode root) {
		    	
		    	if(root == null) {					// Base case
		    		return new DiaPair();
		    	}
		    
		    	DiaPair ldp = Diameter(root.left);
		    	DiaPair rdp = Diameter(root.right);
		    	DiaPair sdp = new DiaPair();
		    	sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
		    	int sd = ldp.ht + rdp.ht + 2;
		    	sdp.dia = Math.max(sd, Math.max(rdp.dia, ldp.dia));
				return sdp;
		    }

		    class DiaPair {
		    	int dia = 0;
		    	int ht = -1;
		    }
	  }	
}
