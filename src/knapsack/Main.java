package knapsack;

public class Main {
	static int N = 5;
	static int W = 15;
	static int[] ci = {2,1,10,2,4};
	static int[] wi = {2,1,4,1,12};
	static int[][] M = new int[N+1][W+1];
	static int[][] S = new int[N+1][W+1];
	
	public static void main(String[] args){
		for(int i=0; i<N+1; i++){
			for(int j=0; j<W+1; j++){
				M[i][j] = -1;
			}
		}
		System.out.println(ks(N,W));
		printSolution(N,W);
	}
	
	public static int ks(int n, int w){
		if(n == 0){
			return 0;
		}
		
		if(M[n][w] != -1){
			return M[n][w];
		}
		
		M[n][w] = ks(n-1, w);
		
		if(w - wi[n-1] >= 0){
			M[n][w] = Math.max(M[n][w], ks(n-1, w-wi[n-1])+ci[n-1]);
			if(ks(n-1, w)<M[n][w]){
				S[n][w] = 1;
			}
		}
		return M[n][w];
	}
	
	public static void printSolution(int i, int w){
		if(i==0){
			return;
		}
		if(S[i][w] == 1){
			printSolution(i-1, w-wi[i-1]);
			System.out.print(i + " ");
		}else{
			printSolution(i-1,w);
		}
		
	}
}