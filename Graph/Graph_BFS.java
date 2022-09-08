// package UndirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_BFS {
//	This code is implemented using Adjacency List and valid for Undirected Graph
	public static void displayList(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0;i<list.size();i++) {
			if(i!=0) {
				System.out.println(i+"->"+list.get(i));
			}
		}
	}
			/*
		 1 2
		 1 6
		 2 3
		 2 4
		 6 7
		 6 9
		 4 5
		 7 8
		 5 8
		 
		 */
		
		//BFS Implementation
		
		/*
		 So for implementing Breadth-First Search we will visit first node let's suppose 1
		 then first of all we marked as visited in visited array and similarly add to the Queue
		 
		 So with the help of adjacency list we find the neighbors of node 1
		 and store those nodes into the queue and marked them visited in visited array.
		 
		 so in this last if node present in Queue the first of all we will check whether it was visited or not
		 
		 
		 */
	public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int startNode){
		ArrayList<Integer> bfs = new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		//number of nodes
		
		int n = adj.size();
		boolean[] visited = new boolean[n+1];
		for(int i = 0;i<visited.length;i++) {
			visited[i] = false;
		}
		visited[startNode] = true;
		q.add(startNode);
		while(!q.isEmpty()) {
			int node = q.poll();
			bfs.add(node);
			for(int i : adj.get(node)) {
				if(visited[i] == false) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
		
		return bfs;
	}
  
	public static void main(String[] args) {
		int N = 9,M = 9;
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0;i<N+1;i++) {
			list.add(new ArrayList<Integer>());
		}
		System.out.println(list);
		System.out.println("======");
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
		int count = 1;
		Scanner sc =new Scanner(System.in);
		while(count<=M) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			ArrayList<Integer> al = new ArrayList<>();
			al.add(v1);
			al.add(v2);
			edges.add(al);
			count++;
		}
		System.out.println("Edges List");
		System.out.println(edges);
		System.out.println("======");
		
		for(int i = 0;i<edges.size();i++) {
			int v1 = edges.get(i).get(0);
			int v2 = edges.get(i).get(1);
			
			list.get(v1).add(v2);
//			so please remove this one if you are implementing for directed graph
			list.get(v2).add(v1);
		}
		
		displayList(list);
		
		System.out.println(bfs(list,1));
		
	}
	
}
