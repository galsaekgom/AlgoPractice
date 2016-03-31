package dfs;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	static int V = 5;
	static int[] visited = new int[V];
	static ArrayList<Integer>[] adjList = new ArrayList[V];
	public static void main(String[] args) throws FileNotFoundException {
		adjList[0] = new ArrayList<Integer>();
		adjList[0].add(1);
		adjList[0].add(2);
		
		adjList[1] = new ArrayList<Integer>();
		adjList[1].add(0);
		adjList[1].add(2);
		
		adjList[2] = new ArrayList<Integer>();
		adjList[2].add(0);
		adjList[2].add(1);
		adjList[2].add(3);
		adjList[2].add(4);
		
		adjList[3] = new ArrayList<Integer>();
		adjList[3].add(2);
		
		adjList[4] = new ArrayList<Integer>();
		adjList[4].add(3);
		
		for(int i = 0; i < V; i++){
			visited[i] = 0;
		}
		dfs(0);
	}
	
	public static void dfs(int node){
		visited[node] = 1;
		System.out.println(node + 1);
		
		if(adjList[node] != null){
			for(int adj : adjList[node]){
				if(visited[adj] == 1){
					continue;
				}
				dfs(adj);
			}
		}
	}
}

