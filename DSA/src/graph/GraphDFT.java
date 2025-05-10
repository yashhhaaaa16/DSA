
package graph;

import java.util.Scanner;

import stack.IntStack;

public class GraphDFT {

	int n;
	int adj[][];
	int state[];

	public GraphDFT(int i) {
		n = i;
		adj = new int[n][n];
		state = new int[n];
		for (i = 0; i < n; i++)
			state[i] = 0;
	}

	public void createGraph() {
		int i, max_edges, origin, destination;

		Scanner s = new Scanner(System.in);
		max_edges = n * (n - 1);
		for (i = 0; i < max_edges; i++) {
			System.out.println("Enter edege (enter (-1,-1) to exit)");
			origin = s.nextInt();
			destination = s.nextInt();
			if (origin == -1 && destination == -1) {
				return;
			}
			if (origin < 0 || origin >= n || destination < 0 || destination >= n) {
				System.out.println("Invalid Edge");
				i--;
			}
			adj[origin][destination] = 1;
			System.out.println("Edge Created Successfully");
		}
	}

	public void insertEdge(int origin, int destination) {
		if (origin < 0 || origin >= n) {
			System.out.println("Origin Vertex Does Not Exist");
			return;
		}
		if (destination < 0 || destination >= n) {
			System.out.println("Destination Vertex Does Not Exist");
			return;
		}
		adj[origin][destination] = 1;
		System.out.println("Edge Inserted Successfully");
	}

	public void deleteEdge(int origin, int destination) {
		if (origin < 0 || origin >= n) {
			System.out.println("Origin Vertex Does Not Exist");
			return;
		}
		if (destination < 0 || destination >= n) {
			System.out.println("Destination Vertex Does Not Exist");
			return;
		}
		adj[origin][destination] = 0;
		System.out.println("Edge Deleted Successfully");
	}

	public void display() {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++)
				System.out.print(adj[i][j] + " ");
			System.out.println();
		}
	}

	public void DFT(int v) {
		int i;
		IntStack st = new IntStack(30);
		st.push(v);
		while (!st.isEmpty()) {
			v = st.pop();
			if (state[v] == 0) {
				System.out.print(" " + v);
				state[v] = 1;
			}
			for (i = n - 1; i >= 0; i--) {
				if (adj[v][i] == 1 && state[i] == 0)
					st.push(i);
			}
		}
	}
}
