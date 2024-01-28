package Lecture49_Graph_3_Prims;

import java.util.*;

public class Prims_Algo {

	// Prim's Algorithm
	
			HashMap<Integer, HashMap<Integer, Integer>> map;
			
			public Prims_Algo(int v) {
				
				map = new HashMap<>();
				for(int i=1; i<=v; i++) {
					map.put(i, new HashMap<>());
				}
			}
			// Connecting two vertices
			public void AddEdge(int v1, int v2, int cost) {
				map.get(v1).put(v2, cost);
				map.get(v2).put(v1, cost);
			}
			
			
			class primsPair{
				int vtx ;
				int acqvtx;
				int cost;
				
				public primsPair(int vtx, int acqvtx, int cost) {
					this.vtx = vtx;
					this.acqvtx = acqvtx;
					this.cost = cost;
				}
				@Override
				public String toString() {
					return vtx+" "+acqvtx + "@"+ cost;
				}
			}
			
			public int prims() {
				
				PriorityQueue<primsPair> pq = new PriorityQueue<>(new Comparator<primsPair>() {
					@Override
					public int compare(primsPair p1, primsPair p2) {
		              return  p1.cost-p2.cost;
					}
				});
				HashSet<Integer> visited = new HashSet<>();
				
				pq.add(new primsPair(1,1,0));
				
				int ans =0;
				while(!pq.isEmpty()) {
					// 1. Remove
					primsPair rp = pq.poll();
					
					// 2. Ignore if Already visited
					if(visited.contains(rp.vtx)) {
						continue;
					}
					
					// 3. Marked visited
					visited.add(rp.vtx);
					
					// 4. Self Work
					System.out.println(rp);
					ans += rp.cost;						// Adding minimum cost and storing in ans
					
					// 5. Add Unvisited nbrs
					for(int nbrs: map.get(rp.vtx).keySet()) {
						
						if(!visited.contains(nbrs)) {
							int cost = map.get(rp.vtx).get(nbrs);
							pq.add(new primsPair(nbrs, rp.vtx, cost));
						}
					}
				}
				return ans;
					
			}
			
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				Prims_Algo pr = new Prims_Algo(n);
				int m = sc.nextInt();
				
				for(int i=1; i<=m; i++) {
					int v1 = sc.nextInt();
					int v2 = sc.nextInt();
					int cost = sc.nextInt();
					
					pr.AddEdge(v1, v2, cost);
				}
				
			System.out.println(pr.prims());
				
			}
}
