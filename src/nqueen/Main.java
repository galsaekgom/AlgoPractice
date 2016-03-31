package nqueen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	static int SIZE;
	static int ANSWER;
	static int COUNT;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/LuisKim/Documents/workspace/JavaPractice/src/nqueen/input.txt"));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
        	SIZE = sc.nextInt();
        	ANSWER = 0;
        	int[] q = new int[SIZE];
        	backtrack(q, 0);
        	System.out.println(ANSWER);
        }	
	}
	
	public static void backtrack(int[] q, int n){ //퀸이 한줄에 한개씩 놓이게 된다.
		if(n == SIZE){//퀸을 다 놓았으면 종료 
			ANSWER++;
		}else{
			for(int i = 0; i < SIZE; i++){ //column 순회하면서 시도한다. n = x좌표, i = y좌표.
				q[n] = i; //n번째의 row의 퀸은 i에 놓는다면.
				if(isSafe(q, n)){//괜찮은가?
					backtrack(q, n+1);
				}
			}	
		}
	}
	
	public static boolean isSafe(int[] q, int n){
		for(int j=0;j<n;j++){ //앞의 row까지 놓인 q[j] 퀸들로 빈 자리검사.
			if(q[j] == q[n]) return false; //같은 column인 경우 놓을 수 없다.
			if(Math.abs(q[n] - q[j]) == Math.abs(n - j)) return false; //대각선에 위치할 경우 놓을 수 없다.	
		}
		return true;
	}
}