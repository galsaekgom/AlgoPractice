package fence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/fence/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
        	int rows = sc.nextInt();
        	int[] x = new int[rows];
        	
        	for(int i = 0; i < rows; i++){
        		x[i] = sc.nextInt();
        	}
        	
        	System.out.println(cal(x));
        }	
	}
	
	public static int cal(int[] x){
		int max = 0;
		
		for(int i=0; i<x.length; i++){
			int temp = 0;
			int count = 1;
			int count2 = 0;
			
			if(x[i]*x.length-1 < max) continue;
			
			int j = i+1;
			while(j<=x.length-1 && x[i] <= x[j]){
				count++;
				j++;
			}

			j = i-1;
			while(j>=0 && x[i] <= x[j]){
				count2++;
				j--;
			}
			
			temp = (count + count2) * x[i];
			max = Math.max(max, temp);
		}
		
		return max;
	}
}