package Lecture38_Binary_Search_Tree;

public class Binary_Search_Tree {

	class Node{						// declared Node of tree
		int val;
		Node left;
		Node right;
	}
	
	private Node root;			// Root node
	
	public Binary_Search_Tree(int[] arr) {		
		
		root = createTree(arr, 0, arr.length-1);
	}
	
	// Create Binary Search Tree of given array
	private Node createTree(int[] arr, int si, int ei) {
		
		if(si > ei) {						// Base Case
			return null;
		}
		
		int mid = (si+ei) / 2;				// middle element
		Node nn = new Node();			// creating new node
		nn.val = arr[mid];				// node value will be mid element of arr
		
		nn.left = createTree(arr, si, mid-1);	// left search
		nn.right = createTree(arr, mid+1, ei);	// right search
		
		return nn;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60,70,80};
		Binary_Search_Tree bst = new Binary_Search_Tree(arr);
		// to display use display function
	}
}
