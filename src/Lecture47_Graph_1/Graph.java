package Lecture47_Graph_1;

import java.util.*;

public class Graph {
	// Indirected Graph representation
	HashMap<Integer, HashMap<Integer, Integer>> map; // Created HashMap(1--> 2(Int2) with cost 3(Int3)
	// 		Vertex			  Neighbor, Cost in map
	
	public Graph(int v) { 				// Class Constructor providing no. of vertex
		map = new HashMap<>();			// bahar v kar sakte hai initialise
		for (Integer i = 1; i <= v; i++) {				
			map.put(i, new HashMap<>()); // Adding vertex in map with blank cost and neighbor
		}
	}

	// Function to connect vertices
	public void AddEdge(int v1, int v2, int cost) { // Adding v1 and v2 with edge

		map.get(v1).put(v2, cost); // getting v1 with cost at V1(V1 ke index par v2 and cost daale diya)
		map.get(v2).put(v1, cost);		// v2-->v1 ka cost : v2 get kiya then put v1 and cost
	}

	// Adding vertex
	public void AddVertex(int v) {
		map.put(v, new HashMap<>());

	}

	// Checking if contains edge or not
	public boolean ContainsEdge(int v1) {
		return map.get(v1).containsKey(v1);
	}

	// Checking if contains Vertex or not
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}

	// Number of edge
	public int noofEdge() {
		int sum = 0;
		for (int vtx : map.keySet()) {			// key ke correspoding hashmap k size and sum kr rhe h
			sum = sum + map.get(vtx).size();
		}

		return sum / 2; // if duplicates found the will decrease the count
	}

	// Remove edge
	public void removeEdge(int v1, int v2) {

		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}

	// Remove Vertex
	public void removeVertex(int v1) {

		for (int neighbors : map.get(v1).keySet()) {
			map.get(neighbors).remove(v1);
		}

		map.remove(v1); // remove vertex
	}

	// Display
	public void display() {

		for (int key : map.keySet()) { // Enhance for loop
			System.out.println(key + " " + map.get(key));	// key ke corresponding neighbor wala map print kar rhe
		}
	}
	// Checking if two vertex has path or not(same thing will do by BFS Algorithm) using Recursion
	public boolean hasPath(int src, int dst, HashSet<Integer> visited) {

		if (src == dst) {				// Base case
			return true;
		}

		visited.add(src);					// adding visited in set

		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {						// checking if not already visuited
				boolean ans = hasPath(nbrs, dst, visited);		// recursive call
				if (ans) {
					return ans;
				}
			}

		}
		visited.remove(src);			// Backtrack kr rhe
		return false;
	}
	
	// Print all path
	public void PrintAllPath(int src, int dst, HashSet<Integer> visited, String str) {

		if (src == dst) {
			System.out.println(str);
			return;
		}

		visited.add(src);

		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				PrintAllPath(nbrs, dst, visited, str+ src);		// recursive function
			}

		}
		visited.remove(src);
		
	}
/********************BFS(Breadth First Search Algorithm)***********************************/
	
	public boolean BFS(int src, int dst) {
		Queue<Integer> q = new LinkedList<>();			// q to add all vertices 
		HashSet<Integer> visited = new HashSet<>();		// to store visited vertices
		
		q.add(src);
		while(!q.isEmpty()) {
			//1. Remove
			int v = q.remove();
			
			//2. Ignore if already visited
			if(visited.contains(v)) {
				continue;
			}
			
			// 3. Marked Visited
			visited.add(v);
			
			// 4. Self Work
			if(v == dst) {
				return true;
			}
			
			// 5. Add unvisited nbrs
			for(int nbrs : map.get(v).keySet()) {
				if(!visited.contains(nbrs)) {
					q.add(nbrs);
				}
			}
		}
		return false;
	}
	
/********************DFS(Depth First Search Algorithm)***********************************/
	
	public boolean DFS(int src, int dst) {
		Stack<Integer> stk = new Stack<>();			// Stack to add all vertices 
		HashSet<Integer> visited = new HashSet<>();		// to store visited vertices
		
		stk.push(src);
		while(!stk.isEmpty()) {
			//1. Remove
			int v = stk.pop();
			
			//2. Ignore if already visited
			if(visited.contains(v)) {
				continue;
			}
			
			// 3. Marked Visited
			visited.add(v);
			
			// 4. Self Work
			if(v == dst) {
				return true;
			}
			
			// 5. Add unvisited nbrs
			for(int nbrs : map.get(v).keySet()) {
				if(!visited.contains(nbrs)) {
					stk.push(nbrs);
				}
			}
		}
		return false;
	}
	
}
