
package graph;

import java.util.Scanner;

import queue.IntQueue;

public class GraphBFS {

	int adj[][];
	int n;

	public GraphBFS(int i) {
		n = i;
		adj = new int[n][n];
	}

	public void createGraph() {
		int i, max_edges, origin, destination;
		Scanner s = new Scanner(System.in);

		max_edges = n * (n - 1);

		for (i = 0; i < max_edges; i++) {
			System.out.println("Enter edge (-1,-1) to exit : ");
			origin = s.nextInt();
			destination = s.nextInt();
			if (origin == -1 && destination == -1) {
				break;
			}
			if (origin >= n || destination >= n || origin < 0 || destination < 0) {
				System.out.println("Invalid Edge ");
				i--;
			} else {
				adj[origin][destination] = 1;
				System.out.println("Edge created successfully");
			}
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

	public void displayGraph() {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void BFT(int v) 
	{
		int i;
		int[] state = new int[n];
		for (i = 0; i < n; i++)
			state[i] = 0;

		IntQueue q = new IntQueue(20);
		q.insert(v);
		state[v] = 1;

		while (!q.isEmpty()) 
		{
			v = q.remove();
			System.out.print(" "+v);
			state[v] = 2;

			for (i = 0; i < n; i++) 
			{
				if (adj[v][i] == 1 && state[i] == 0) 
				{
					q.insert(i);
					state[i] = 1;
				}
			}
		}
	}

	
}
