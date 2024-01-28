package Lecture48_Graph_2;

import java.util.*;

public class Graph_Valid_Tree {
								
	public class Solution {
		// Valid Tree: Acyclic and connected hona chahiye
		// Acyclic : Means 100% Bipartite
		// Cyclic : if even length then Bipartite/ if odd not bipartite
		// Bipartite hoga to Adjacent coloring same nhi hoga else hoga
		public Boolean ValidTree(int n, int[][] edges) {

			HashMap<Integer, List<Integer>> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				map.put(i, new ArrayList<>());					// Adding address of all list in map	
			}

			for (int i = 0; i < edges.length; i++) {		// i= rows			
				int v1 = edges[i][0];			// 2D matrix 4x2:edges = [[0,1],[0,2],[1,2],[3,4]							
				int v2 = edges[i][1];
				map.get(v1).add(v2);
				map.get(v2).add(v1);
			}

			return BFT(map);
		}

		public boolean BFT(HashMap<Integer, List<Integer>> map) {
			Queue<Integer> q = new LinkedList<>(); 					// q to add all vertices
			HashSet<Integer> visited = new HashSet<>(); 			// To store visited vertices
			int component = 0;										// used to count the No. of graph
			for (int src : map.keySet()) { // Loop for all component(1 se jyada graph k liye)
				if (visited.contains(src)) {
					continue;
				}
				component++;
//				if(component>1) {				// this also tell if graph is tree hai ya nhi
//					return true;
//				}
				q.add(src);
				while (!q.isEmpty()) {
					// 1. Remove
					int v = q.remove();

					// 2. Ignore if already visited
					if (visited.contains(v)) {
						return false;
					}

					// 3. Marked Visited
					visited.add(v);

					// 4. Self Work
					// need nhi tha self work karne ka
					// 5. Add unvisited nbrs
					for (int nbrs : map.get(v)) {
						if (!visited.contains(nbrs)) {
							q.add(nbrs);
						}
					}
				}
			}
			return component == 1;						
		}

	}

}
