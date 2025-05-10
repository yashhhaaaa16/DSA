package graph;

public class MyGraph {

	public static void main(String[] args) {
		
		GraphBFS g = new GraphBFS(12);
		
		g.insertEdge(0, 1);
		g.insertEdge(0, 3);
		g.insertEdge(1, 2);
		g.insertEdge(1, 5);
		g.insertEdge(1, 4);
		g.insertEdge(2, 3);
		g.insertEdge(2, 5);
		g.insertEdge(3, 6);
		g.insertEdge(4, 7);
		g.insertEdge(5, 7);
		g.insertEdge(5, 6);
		g.insertEdge(5, 8);
		g.insertEdge(6, 9);
		g.insertEdge(8, 9);
		g.insertEdge(7, 8);
		System.out.println();
		g.BFT(0);
		System.out.println();
		g.displayGraph();
	}
	
}
