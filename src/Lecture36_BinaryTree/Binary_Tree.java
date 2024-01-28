package Lecture36_BinaryTree;
import java.util.*;

public class Binary_Tree {			// T.C = O(N)
	
	class Node{						//  creating 1 root node
		int val;
		Node left;
		Node right;
	}
	
	private Node root;						// Main Root private to keep it safe(Starting point if Tree)
	Scanner sc = new Scanner(System.in);			// for input
	public Binary_Tree() {							// constructor
		root = createTree();		// Tree create karne k bad root m daal diye
		 
	}
	
	// ********Creating Binary Tree**************
	private Node createTree() {
		
		int item = sc.nextInt();			// taking input
		Node node = new Node();				// created new Node
		node.val = item;					// Keeping input value in Node 
		
		boolean hlc = sc.nextBoolean();
		if(hlc) {							// has left side child
			node.left = createTree();
		}
		boolean hrc = sc.nextBoolean();			// hrc=has Right child
		if(hrc) {
			node.right = createTree();
		}
		
		return node;					// return node 
	}
	
	// Agar user ko root access nhi hai to ek public function banayenge
	// Created new func because root is private
	public void Display() {
		Display(root);
	}
	
	// To Display Node
	private void Display(Node nn) {
		
		if(nn == null) {				// Base Case
			return;
		}
		
		String s = "";						// for adding arrow(-->/<--)
		s = "<--" + s + nn.val + "-->";
		// For Left Side
		if(nn.left != null) {
			s = nn.left.val +s;					// Adding left side
		}
		else {
			s = "." +s;
		}
		// For Right Side
		if(nn.right != null) {
			s = s + nn.right.val;					// Adding right side
			
		}
		else {
			s = s+ ".";
		}
		
		System.out.println(s);
		Display(nn.left);			// print left side Recursive call
		Display(nn.right);			// print right side
	}
	
	//1-Find the max value in Tree
	
	public int max() {
		return max(root);
		
	}

	private int max(Node nn) {
		
		if(nn == null) {
			return Integer.MIN_VALUE;
		}
		int l = max(nn.left);
		int r = max(nn.right);
		return Math.max(l, Math.max(r,  nn.val));
	}
	
	//2. Search element from tree
	
	public boolean find(int item) {
		return find(root, item);
	}

	private boolean find(Node nn, int item) {
		
		if(nn == null) {						// Base Case
			return false;
		}
		
		if(nn.val == item) {			// checking if exist
			return true;
		}
		
		boolean l = find(nn.left, item);			// for Left side recursive call
		boolean r = find(nn.right, item);			// for Right side recursive call
		
		return false;
	}
	
	//3. Find Height of the Tree
	
	public int ht() {						//ht: height(Max distance b/w RootNode and LeafNode)
		return ht(this.root);
	}
	// jab single node ki height 0 bole to base case mein -1 lenge
	private int ht(Node node) {
		
		if(node == null) {				// Base Case
			return -1;
		}
		
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh,rh)+1;		
		
	}
	
	/* TRAVERSAL
	 * PreOrder  : Root-->Left-->Right
	 * InOrder	 : Left-->Root-->Right
	 * PostOrder : Right-->Left-->Root
	 * LevelOrder: 
	 */
	
	//1. PreOrder  : Root-->Left-->Right
	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
	
		if(node == null) {
			return ;
		}
		System.out.print(node.val+" ");
		PreOrder(node.left);
		PreOrder(node.right);
		
	}
	
	// 2. InOrder : Left-->Root-->Right
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}

	private void INOrder(Node node) {
		
		if(node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val+" ");
		INOrder(node.right);
		
	}
	//3. PostOrder : Left->Right-->Root
	
	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		
		if(node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val+" ");
	}
	
	//4. LevelOrder : Level wise data
	/* 3 step using Linked List instead of Queue(As Queue does not have inbuilt class) 
	 * Start from Root node 
	 * Remove
	 * Print
	 * Left child if exist then Add Child
	 * Right child if exist then Add Child
	 */
	
		public void LevelOrder() {
//			LinkedList<Node> q = new LinkedList<>();	this can also be used(Linked list is child class of queue So we can use linked list as queue)
			Queue<Node> q = new LinkedList<>();
			
			q.add(root);	// adding at last
			while(!q.isEmpty()) {
				Node rv = q.remove();		// remove first
				System.out.print(rv.val+" ");
				
				if(rv.left != null) {
					q.add(rv.left);
				}
				
				if(rv.right != null) {
					q.add(rv.right);
				}	
			}
			System.out.println();
		}
}
