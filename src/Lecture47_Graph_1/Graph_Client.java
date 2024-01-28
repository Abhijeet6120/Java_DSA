package Lecture47_Graph_1;
import java.util.*;

public class Graph_Client {

	public static void main(String[] args) {
		// calling all graph function
		Graph g = new Graph(7);			
		g.AddEdge(1, 4, 6);				// Adding v1,v2,cost
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		
		g.display();
		System.out.println(g.hasPath(1,6, new HashSet<>()));
		
		
		
		g.PrintAllPath(1, 6, new HashSet<>(), "");
		
		System.out.println(g.BFS(1, 6));
		System.out.println(g.DFS(1, 6));
		
	}

}
