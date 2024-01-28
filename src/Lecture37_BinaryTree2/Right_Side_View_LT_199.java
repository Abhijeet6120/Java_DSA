package Lecture37_BinaryTree2;
import java.util.*;

public class Right_Side_View_LT_199 {
	
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
		
	    public List<Integer> rightSideView(TreeNode root) {
	        
	    	List<Integer> ll = new ArrayList<>();
	    	
	    	view(root, 1, ll);
	    	return ll;
	    }
	    int maxDepth = 0;
	    public void view(TreeNode root, int CurrentLevel, List<Integer> ll) {
	    	
	    	if(root == null) {
	    		return;
	    	}
	    	
	    	if(maxDepth < CurrentLevel) {
	    		ll.add(root.val);
	    		maxDepth = CurrentLevel;
	    	}
	    	System.out.println(root.val);
	    	view(root.right , CurrentLevel + 1, ll);				// left recursive call
	    	view(root.left , CurrentLevel + 1, ll);
	    	
	    }
	    
	}
}
