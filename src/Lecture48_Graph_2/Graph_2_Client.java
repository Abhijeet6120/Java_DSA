package Lecture48_Graph_2;

public class Graph_2_Client {

	public static void main(String[] args) {
		Graph_2 g = new Graph_2(7);			
		g.AddEdge(1, 4, 6);				// Adding v1,v2,cost
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		
		g.BFT();
		g.DFT();
		
		System.out.println(g.isCycle());				// Cycle or not in graph
		System.out.println(g.isConnected());			// conected or not in graph
		
	}

}
