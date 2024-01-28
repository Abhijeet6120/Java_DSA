package Lecture41_Heap_PriorityQueue;
import java.util.*;

public class Heap {
	
	private ArrayList<Integer> ll = new ArrayList<>();
	
	public void add(int item) {
		ll.add(item);					// Adding at last in list
		upHeapiFy(ll.size() - 1);
	}
	
	// min Heap
	private void upHeapiFy(int ci) {
		int pi = (ci-1)/2;							// parent index
		
		if(ll.get(pi) > ll.get(ci)) {			// checking if PI > CI
			Swap(pi, ci);						// then swap
			upHeapiFy(pi);				// recursive call
		}
	}
	
	// Swapping parent and child 
	private void Swap(int pi, int ci) {			// Swapping in Array List
		
		int pith = ll.get(pi);
		int cith = ll.get(ci);
		ll.set(pi,  cith);
		ll.set(ci, pith);
		
	}
	
	public int get() {
		return ll.get(0);
	}
	
	// print the list
	public void Display() {
		System.out.println(ll);
	}
	// for size of list
	public int size() {
		return ll.size();
	}
	
	public int remove() {
		int rv = ll.get(0);				// Min. Heap m priority Root ko hoti h to 0th ko remove kar rhe 
		Swap(0, ll.size() - 1);
		ll.remove(ll.size());
		downHeapiFy(0);
		return rv;
	}
	// DownHeapify
	private void downHeapiFy(int pi) {
		
		int lci = 2 * pi +1;				// Left child index
		int rci = 2 * pi +2;				// Right child index
		int mini = pi;
		
		if(lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		
		if(rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		
		if(mini != pi) {
			Swap(pi, mini);
			downHeapiFy(mini);					// recursive call
		}
		
	}

}
