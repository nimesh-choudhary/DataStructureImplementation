package UndirectedGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph_AdjacencyMatrix {
//	This code is implement using Adjacency Matrix and valid for only for undirected graph
	/*
	 N = 5, M = 6
	 where N is the number of nodes and M are the number of edges
	 1 2
	 1 3
	 3 4
	 2 4
	 2 5
	 4 5
	 
	 
	 So if we use adjacency matrix and we defined the pair of nodes containing above
	 then it mean the value of ith and jth column is 1 and similarly to jth and ith.
	 
	 so if we implement graph using adjacency matrix then complexity will be O(N*N).
	 So this complexity is node good when we have more number of nodes like 10000 nodes.
	 
	 
	 */
	public static void displayArray(int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int N = 5, M = 6;
		int[][] adj = new int[N+1][N+1];
//		So we are taking the pair of nodes having edges in the form of ArrayList
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
		int count = 1;
		Scanner sc = new Scanner(System.in);
		while(count<=M) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			list.add(v1);
			list.add(v2);
			
			adjList.add(list);
			count++;
		}
		System.out.println(adjList);
		
		System.out.println("========");
//		For assigning all the value 0 in the Adjacency matrix 
		for(int i = 0;i<adj.length;i++) {
			for(int j = 0;j<adj.length;j++) {
				adj[i][j] = 0;
			}
		}
		
		
		displayArray(adj);
		System.out.println("========");
		
		for(int i = 0;i<adjList.size();i++) {
			int v1 = adjList.get(i).get(0);
			int v2 = adjList.get(i).get(1);
			
			adj[v1][v2] = 1;
//			so please remove this one if you are implementing for directed graph
			adj[v2][v1] = 1;
		}
		System.out.println("===========");
		displayArray(adj);
	}
}
