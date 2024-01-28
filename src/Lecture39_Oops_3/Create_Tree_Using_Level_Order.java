package Lecture39_Oops_3;
import java.util.*;
import java.util.LinkedList;

public class Create_Tree_Using_Level_Order {
	// How to create tree using level order by taking input
	
	class Node{							// Created Node of int data data
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public Create_Tree_Using_Level_Order() {			// Constructor
		CreateTree();
	}
	private void CreateTree() {
		
		int item = sc.nextInt();
		Node nn = new Node();			// Created new Node
		nn.val = item;
		root = nn;					// nn ki value root m daal rhe hai
		
		Queue<Node> q = new LinkedList<>();			// Created queue
		
		q.add(nn);
		while(!q.isEmpty()) {						// Checking if queue is empty or not
			Node rn = q.remove();
			int c1 = sc.nextInt();				
			int c2 = sc.nextInt();
			
			if(c1 != -1) {						// Left child
				Node node = new Node();
				node.val = c1;
				nn.left = node;
				q.add(node);
			
			}
			if(c2 != -1) {
				Node node = new Node();			// Right child
				node.val = c2;				
				nn.right = node;				// Node ko right daal rhe hai
				q.add(node);					// Adding in Queue
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_Tree_Using_Level_Order obj = new Create_Tree_Using_Level_Order();
		
//		obj.Display();			// Print using display function

	}

}

	