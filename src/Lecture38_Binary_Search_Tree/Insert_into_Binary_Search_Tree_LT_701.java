package Lecture38_Binary_Search_Tree;

public class Insert_into_Binary_Search_Tree_LT_701 {
	
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
	  
//	  static TreeNode root;
	 
	class Solution {
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        
	    	if(root == null) {						// case 1( If root ==0)
	    		return new TreeNode(val);	    		// returning val in new node
	    	}
	    	
	    	if(root.val < val) {								// case 2(Root > InsetrValue then go in right
	    		root.right = insertIntoBST(root.right, val);
	    	}
	    	else {												// case 3(Root < InsetrValue then go in left)
	    		root.left = insertIntoBST(root.left, val);
	    		
	    	}
	    	return root;										// Will return tree
	    }
	}

	public static void main(String[] args) {
		Insert_into_Binary_Search_Tree_LT_701 ISnode = new Insert_into_Binary_Search_Tree_LT_701();
//		ISnode.display(root);
		

	}
	// Display BST
	private void display(TreeNode node) {
		if (node.left != null) {
			System.out.print(node.left.val + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.val);
		if (node.right != null) {
			System.out.print(" <= " + node.right.val);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}	

}
