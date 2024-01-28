package Lecture43_Map_Implemetation;

import java.util.*;

public class HashMap<K, V> {				// Generic class
	// Hash Map Implementation 
	
	class Node{						// Created node
		K key;
		V value;
		Node next;
	}
	
	private ArrayList<Node> bukt;	// Initialize list of bucket Node type to store the address(Starting point of linked list) 
	private int size = 0;				// Map size
	public HashMap(int n) {					// keeping null in list 
		bukt = new ArrayList<>();
		for(int i=0; i<n; i++) {
			bukt.add(null);
		}
	}
	
	public HashMap() {
		this(4);			// Taking previous constructor argument(Size of bucket)
	}
	
	// Adding value in list
	public void put(K key, V value) {
		int idx = hashfun(key);					// idx: Bucket number
		Node temp = bukt.get(idx);
		
		while(temp != null) {				// Value updation 
			if(temp.key.equals(key)) {	// checking temp ka key equals to key(equals address compare karta hai)
				temp.value = value;
				return;
			}
			temp = temp.next;				// else: check next one
		}
		// jab temp m null hoga to ye chalega
		Node nn =  new Node();
		nn.key = key;
		nn.value = value;
		temp = bukt.get(idx);		// keeping value in temp
		nn.next = temp;				// temp ko nn mdaal rhe hai
		bukt.set(idx, nn);			// us bucket m idx index pr nn ko set kar rhe hai
		size++;						// increasing size							
		
		double lf = (1.0 * size) / bukt.size();
		double thf = 2.0;
		if(lf > thf) {								// lf: Load Factor
			rehashing();							// thf: Thresold Factor 
			
		}
	}
	
	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> New_bukt = new ArrayList<>();
		for(int i=0; i<2*bukt.size(); i++) {
			New_bukt.add(null);
		}
		ArrayList<Node> a = bukt;
		bukt = New_bukt;
		size =0;
		for(Node temp : a) {
			while(temp != null) {
				put(temp.key, temp.value);
				temp = temp.next;
			}
		}
		
	}
	
	@Override
	public String toString() {
		String s = "{";
		for(Node temp : bukt) {
			while(temp != null) {
				s = s + temp.key + "=" + temp.value + ",";
				temp = temp.next;
			}
		}
		return s + "}";
	}
	

	//containsKey
	public boolean containsKey(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	// get 
	public V get(K key) {
		int idx = hashfun(key);
		Node temp = bukt.get(idx);
		while(temp != null) {
			if(temp.key.equals(key)) {
				
				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}
		
	// remove 
	public V remove(K key) {
		int idx = hashfun(key);
		Node curr = bukt.get(idx);
		Node prev = null;
		while(curr != null) {
			if(curr.key.equals(key)) {
				
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		
		if(curr == null) {						// case 1
			return null;
		}
		else if (prev == null){						// case 2
			bukt.set(idx, curr.next);
			curr.next = null;
			size--;
			return curr.value;
			
		}
		else {								// case 3
			prev.next = curr.next;
			curr.next = null;
			size--;
			return curr.value;
		}
	}
	
	// For bucket number
	private int hashfun(K key) {
		int idx = key.hashCode() % bukt.size();		// HashCode has unique value
		if(idx < 0) {								// HashCode can be -ve
			idx += bukt.size();
		}
		return idx;
	}
	
}
