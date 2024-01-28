package Lecture44_Trie;

import java.util.*;

public class Tries_Contacts_HackerRank {
	
	class Node {
		char ch;
		HashMap<Character, Node> child = new HashMap<>();
		boolean isterminal = false;
		int counter = 0;					// To count

	}

	private Node root;

	public Tries_Contacts_HackerRank() {
		// TODO Auto-generated method stub
		Node nn = new Node();
		nn.ch = '*';
		root = nn;

	}
	
	// Insert function
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
				curr.counter = curr.counter + 1;
			} else {
				Node node = new Node();
				node.ch = ch;
				node.counter = 1;
				curr.child.put(ch, node);
				curr = node;
			}
		}
		curr.isterminal = true;

	}
	
	// Start with
	public int startsWith(String prefix) {
		Node curr = root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			if (curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			} else {
				return 0;
			}
		}
		return curr.counter;
	}

	public static void main(String[] args) {
		Tries_Contacts_HackerRank t = new Tries_Contacts_HackerRank();
		t.insert("hack");
		t.insert("hackerrank");
		System.out.println(t.startsWith("hac"));		// start with hac : 2
		System.out.println(t.startsWith("hak"));		// start with hak : 0
	}

}

	
