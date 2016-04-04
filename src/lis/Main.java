package lis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/lis/input.txt"));
//		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		while(cases-- > 0){
			int len = sc.nextInt();
			int[] arr = new int[len];
			int[] part = new int[len];
			int maxLen = 0;
			
			for(int i =0; i< len; i++){
				arr[i] = sc.nextInt();
			}
			
			for(int i =0; i<len; i++){
				part[i] = 1;
				for(int j=i; j>=0; j--){
					if(arr[j] < arr[i] && part[i] < part[j] + 1){
						part[i] = part[j] + 1;
					}
				}
				maxLen = Math.max(maxLen, part[i]);
			}
			
			System.out.println(maxLen);
		}
	}
}