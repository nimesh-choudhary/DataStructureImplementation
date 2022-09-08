package UndirectedGraph;

import java.util.ArrayList;
import java.util.Scanner;

public class Graph {
//	This code is implemented using Adjacency List and valid for Undirected Graph
	public static void displayList(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0;i<list.size();i++) {
			if(i!=0) {
				System.out.println(i+"->"+list.get(i));
			}
		}
	}
	/*
	 N = 5, M = 6
	 where N is the number of nodes and M are the number of edges
	 1 2
	 1 3
	 3 4
	 2 4
	 2 5
	 4 5
	 
	then adjacency list will be
	1 -> {2,3}
	2 -> {1,4,5}
	3 -> {1,4}
	4 -> {2,3,5}
	5 -> {2,4}
	
	
	then the space we are using O(2*M)
	So why 2*M because we adding one node twice it means
	if there is a edge between 1 and 2
	then i will add in 1-> {2} and 2 -> {1}
	 
	 */
	public static void main(String[] args) {
		int N = 5,M = 6;
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
		
	}
	
}
