package maxsum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	static int SIZE;
	static int ANSWER;
	static int SUM;
	static int MAX;
	static int MIN = Integer.MIN_VALUE;
	static int i,j;
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/LuisKim/Documents/workspace/JavaPractice/src/maxsum/input.txt"));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
        	SIZE = sc.nextInt();
        	ANSWER = 0;
        	SUM = 0;
        	MAX = 0;
        	int[] arr = new int[SIZE];
        	
        	for(i = 0; i < SIZE; i++){
        		arr[i] = sc.nextInt();
        	}

//        	MAX = fastestMaxSum(arr);
        	MAX = divideAndSolve(arr, 0, SIZE-1);
        	
        	System.out.println(MAX);
        }	
	}
	
	public static int divideAndSolve(int[] arr, int lo, int hi){
		if(lo == hi) return arr[lo];
		int mid = (hi + lo)/2;
		int leftMax = MIN, rightMax = MIN, sum = 0;
		
		for(i = mid; i>= lo; i--){
			sum += arr[i];
			leftMax = Math.max(leftMax, sum);
		}
		sum = 0;
		for(i = mid+1; i<= hi; i++){
			sum += arr[i];
			rightMax = Math.max(rightMax, sum);
		}
		
		int single = Math.max(divideAndSolve(arr, lo, mid), divideAndSolve(arr, mid+1, hi));
		
		return Math.max(leftMax + rightMax, single);
	}
	
	public static int fastestMaxSum(int[] arr){
		int ret = -999999999;
		int psum = 0;
		
		for(i=0; i<SIZE; i++){
			psum = Math.max(psum, 0)+arr[i]; //지금까지 합쳐온게 음수면 새로 시작. 아니면 더하기.
			ret = Math.max(psum, ret);
		}
		
		return ret;
	}
}