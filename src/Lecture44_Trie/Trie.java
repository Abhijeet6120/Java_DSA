package Lecture44_Trie;

import java.util.*;

public class Trie {
	
	class Node{
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal = false;
	}
	
	private Node root;				// Root Node
	
	public Trie() {
		Node nn = new Node();			// Created new Node
		nn.ch = '*';					// Keeping * in nn object
		root = nn;						// Assigning nn in root
	}
	
	public void insert(String word) {
		
		Node curr = root;						// 
		for(int i=0; i<word.length(); i++) {	// When found character
			char ch = word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				
			}
			else {						// When not found character
				Node node = new Node();			// Creating new node child
				node.ch = ch;
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;
	}
	
	public boolean search(String word) {			// Searching algo in Trie
		Node curr = root;
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}
			else {
				return false;
			}
			
		}
		return curr.isterminal;
	}
	
	// LT 208 Implement Trie (Prefix Tree)
	public boolean startsWith(String prefix) {			// Searching Algo in Trie
		Node curr = root;
		for(int i=0; i<prefix.length(); i++){
			char ch = prefix.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}
			else {
				return false;
			}
			
		}
		return true;
		
	}
}
