package Lecture48_Graph_2;

import java.util.*;

public class Graph_2 {

	// Indirected Graph representation
	HashMap<Integer, HashMap<Integer, Integer>> map; // Created HashMap

	public Graph_2(int v) { 					// Class Constructor
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>()); 			// Adding vertex in map
		}
	}
	
	// Function to connect vertices
		public void AddEdge(int v1, int v2, int cost) { // Adding v1 and v2 with edge

			map.get(v1).put(v2, cost); // getting v1 with cost at V1(V1 ke index par v2 and cost daale diya)
			map.get(v2).put(v1, cost);
		}

	/********************* BFT and DFT m sirf loop lga denge bas kyuki every Node ko trabvere karna hai
	 * BFT(Breadth First Traversal Algorithm) Traversal: BFS ko loop mein Daalna
	 ***********************************/

	public void BFT() {
		Queue<Integer> q = new LinkedList<>(); 				// q to add all vertices
		HashSet<Integer> visited = new HashSet<>(); 		// To store visited vertices

		for (int src : map.keySet()) {					 // Loop to help
			if (visited.contains(src)) {
				continue;
			}

			q.add(src);
			while (!q.isEmpty()) {
				// 1. Remove												Step-1
				int v = q.remove();

				// 2. Ignore if already visited								Step-2
				if (visited.contains(v)) {
					continue;
				}

				// 3. Marked Visited										Step-3
				visited.add(v);

				// 4. Self Work												Step-4
				System.out.print(v + " ");

				// 5. Add unvisited nbrs									Step-5
				for (int nbrs : map.get(v).keySet()) {
					if (!visited.contains(nbrs)) {				// Unvisited checking if true
						q.add(nbrs);							// then Adding
					}
				}
			}
		}
		System.out.println();
	}

	/********************	BFT,BFS and DFT,DFS difference is data structure only 
	 * DFT(Depth First Traversal Algorithm)
	 ***********************************/

	public void DFT() {
		Stack<Integer> stk = new Stack<>(); // Stack to add all vertices
		HashSet<Integer> visited = new HashSet<>(); // to store visited vertices

		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			stk.push(src);
			while (!stk.isEmpty()) {
				// 1. Remove
				int v = stk.pop();

				// 2. Ignore if already visited
				if (visited.contains(v)) {
					continue;
				}

				// 3. Marked Visited
				visited.add(v);

				// 4. Self Work
				System.out.print(v+" ");

				// 5. Add unvisited nbrs
				for (int nbrs : map.get(v).keySet()) {
					if (!visited.contains(nbrs)) {
						stk.push(nbrs);
					}
				}
			}
		}
		System.out.println();
	}
	
	// Checking if graph is connected or not
	public boolean isConnected() {
		Queue<Integer> q = new LinkedList<>(); 				// q to add all vertices
		HashSet<Integer> visited = new HashSet<>(); 		// To store visited vertices
		
		int count = 0;
		for (int src : map.keySet()) {					 // Loop to help
			if (visited.contains(src)) {
				continue;
			}
			count++;
			
			q.add(src);
			while (!q.isEmpty()) {
				// 1. Remove												Step-1
				int v = q.remove();

				// 2. Ignore if already visited								Step-2
				if (visited.contains(v)) {
					continue;
				}

				// 3. Marked Visited										Step-3
				visited.add(v);

				// 4. Self Work												Step-4
//				System.out.print(v + " ");

				// 5. Add unvisited nbrs									Step-5
				for (int nbrs : map.get(v).keySet()) {
					if (!visited.contains(nbrs)) {				// Unvisited checking if true
						q.add(nbrs);							// then Adding
					}
				}
			}
		}
		return count==1;			// yahi p return count krenge to no. of component mil jayega 
	}
	
	// Checking if graph is cycle or not
		public boolean isCycle() {
			Queue<Integer> q = new LinkedList<>(); 				// q to add all vertices
			HashSet<Integer> visited = new HashSet<>(); 		// To store visited vertices
			
			
			for (int src : map.keySet()) {					 // Loop to help
				if (visited.contains(src)) {
					continue;
				}

				q.add(src);
				while (!q.isEmpty()) {
					// 1. Remove												Step-1
					int v = q.remove();

					// 2. Ignore if already visited								Step-2
					if (visited.contains(v)) {
						return true;						// cycle hoga to true de ga
					}

					// 3. Marked Visited										Step-3
					visited.add(v);

					// 4. Self Work												Step-4
//					System.out.print(v + " ");

					// 5. Add unvisited nbrs									Step-5
					for (int nbrs : map.get(v).keySet()) {
						if (!visited.contains(nbrs)) {				// Unvisited checking if true
							q.add(nbrs);							// then Adding
						}
					}
				}
			}
			return false;			// if not cycle  
		}
}
