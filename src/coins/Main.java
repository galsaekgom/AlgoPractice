package coins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int ANSWER, M, C, TEMP;
	static int[] coins;
	static long[] valArr;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/coins/input.txt"));
//		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases-- > 0){
			ANSWER = 0;
			M = sc.nextInt();
			C = sc.nextInt();
			coins = new int[C];
			valArr = new long[M+1];
			int i = 0;
			for(i = 0; i < C; i ++){
				coins[i] = sc.nextInt();
			}
			solve();
			if(valArr[M] > 1000000007){
				System.out.println(valArr[M]%1000000007);
			}else{
				System.out.println(valArr[M]);
			}
		}
	}
	
	public static void solve(){
		int val;
		for(int i=0; i<C; i++){
			val = coins[i];
			if(val > M) break;
			
			valArr[val]++;
			
			for(int j=1; val+j<=M; j++){
				if(valArr[j] >= 0){
					valArr[j+val] += valArr[j];
				}
			}
		}
	}
}