package UndirectedGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph {
//   So we are using 1-based indexing graph.
	
	public static void displayList(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0;i<list.size();i++) {
			if(i!=0) {
				System.out.println(i+"->"+list.get(i));
			}
		}
	}
	

	}
//	DFS Implementation
	/*
	 
	 1 2
	 1 3
	 2 5
	 2 6
	 3 7 
	 3 4
	 7 8
	 4 8	 
	 */
	
	public static void dfs(ArrayList<ArrayList<Integer>> adj, int startNode, ArrayList<Integer> dfs,boolean[] visited) {
		visited[startNode] = true;
		dfs.add(startNode);
		
		for(int i : adj.get(startNode)) {
			if(visited[i] == false) {
				dfs(adj,i,dfs,visited);
			}
		}
		
		
	}
	
	public static ArrayList<Integer> dfsGraph(ArrayList<ArrayList<Integer>> adj, int startNode){
		int n = adj.size()+1;
		boolean[] visited = new boolean[n];
		ArrayList<Integer> dfs = new ArrayList<>();
		dfs(adj,startNode,dfs,visited);
		return dfs;
	}
	
	public static void main(String[] args) {
		int N = 8,M = 8;
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
		System.out.println("==========");
		System.out.println(dfsGraph(list,1));
		
	}
	
}
