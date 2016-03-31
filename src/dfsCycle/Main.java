package dfsCycle;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
	static int V = 5;
	static int[] visited = new int[V];
	static int[] onstack = new int[V];
	static int[] parent = new int[V];
	static int visitedCnt = 0;
	static boolean found = false;
	static ArrayList<Integer>[] adjList = new ArrayList[V];

	public static void main(String[] args) throws FileNotFoundException {
		adjList[0] = new ArrayList<Integer>();
		adjList[0].add(2);

		adjList[1] = new ArrayList<Integer>();
		adjList[1].add(0);
		
		adjList[2] = new ArrayList<Integer>();
//		adjList[2].add(0);
		adjList[2].add(1);
		adjList[2].add(4);
		
		adjList[3] = new ArrayList<Integer>();
		adjList[3].add(2);
		
		adjList[4] = new ArrayList<Integer>();
		adjList[4].add(3);
		
		for(int i = 0; i < V; i++){
			visited[i] = -1;
			onstack[i] = 0;
		}
		visitedCnt = 0;
		
		for(int i=0; i < V; i++){
			if(visited[i] == -1){ //한번도 안가본 곳에서만 시작;
				dfs(i);
				if(found){ //사이클을 찾았으면 끝.
					break;
				}
			}
		}
	}
	
	public static void dfs(int node){
		onstack[node] = 1; //출발점 표시;
		visited[node] = visitedCnt++; // 방문한 순서 표시;
		
		if(adjList[node] != null){
			for(int adj : adjList[node]){ //node에서 adj로 가는 간선들 시도;
				if(visited[adj] == -1){ //한번도 안가본 곳일 경우 이동;
					parent[adj] = node; //어디에서 왔는지 저장.
					
					dfs(adj);
					
					if(found){
						return;
					}
					
				}else if(onstack[adj] == 1 && visited[adj] < visited[node]){ //가려는 곳이 출발점과 같고, 가려는 곳이 먼저 가본 곳이면.
					found = true;
					printPath(adj, node);
					return;
				}
			}
		}
		onstack[node] = 0;
	}
	
	public static void printPath(int start, int end){
		if(start != end && end != 0){
			printPath(start, parent[end]);
		}
		System.out.println(end + 1);
	}
}

