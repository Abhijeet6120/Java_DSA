package Lecture48_Graph_2;
import java.util.*;

public class Dijkstra_Algo {
		// Dijkstra Algorithm(It will be failed in negative edge weight) It will only work for +ve edge
		
		HashMap<Integer, HashMap<Integer, Integer>> map;
		
		public Dijkstra_Algo(int v) {
			
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
		
		class DijkstraPair{
			int v;				// Added vertices v int type
			int cost;			// int type cost
			String acqPath;		// path that connects vertices
			
			public DijkstraPair(int v, int cost, String acqPath) {		// Constructor
				
				this.v = v;
				this.cost = cost;
				this.acqPath = acqPath;
			}
			
			public String toString() {
				return this.v+ " "+ this.cost+" @ "+ this.acqPath;
			}
		}
		
		public void Dijkstra(int src) {
			
			PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

				@Override
				public int compare(DijkstraPair o1, DijkstraPair o2) {
					// TODO Auto-generated method stub
					return o1.cost - o2.cost;
				}
			});
			
			HashSet<Integer> visited = new HashSet<>();
			pq.add(new DijkstraPair(src, 0,"" + src));		// ""+src: concatenating src and string
			
			while(!pq.isEmpty()) {
				// 1. Remove
				DijkstraPair rp = pq.poll();
				
				// 2. Ignore if Already visited
				if(visited.contains(rp.v)) {
					continue;
				}
				
				// 3. Marked visited
				visited.add(rp.v);
				
				// 4. Self Work
				System.out.println(rp);
				
				// 5. Add Unvisited nbrs
				for(int nbrs: map.get(rp.v).keySet()) {
					
					if(!visited.contains(nbrs)) {
						int cost = map.get(rp.v).get(nbrs);
						pq.add(new DijkstraPair(nbrs, rp.cost+ cost, rp.acqPath + nbrs));
					}
				}
			}
		}
		
		public static void main(String[] args) {
			Dijkstra_Algo g = new Dijkstra_Algo(7);
			g.AddEdge(1, 4, 6);
			g.AddEdge(1, 2, 10);
			g.AddEdge(2, 3, 7);
			g.AddEdge(3, 4, 5);
			g.AddEdge(4, 5, 1);
			g.AddEdge(5, 6, 4);
			g.AddEdge(7, 5, 2);
			g.AddEdge(6, 7, 3);
			g.Dijkstra(1);
		}
}
