package Lecture36_BinaryTree;

public class Binary_Tree_Client {
	
	public static void main(String[] args) {
// Input: 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
		Binary_Tree bt = new Binary_Tree();
		bt.Display();							// calling function to display the tree
		System.out.println(bt.max());
		
		System.out.println(bt.find(56));
		System.out.println(bt.ht());
		
		bt.PreOrder();
		bt.INOrder();
		bt.PostOrder();
		bt.LevelOrder();
	}
}
