package hotsummer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/hotsummer/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
        	String ret = "NO";
        	int target = sc.nextInt();
        	int used = 0;
        			
        	for(int i = 0; i < 9; i++){
        		used += sc.nextInt();
        	}
        	
        	if(used <= target){
        		ret = "YES";
        	}
        	
	    	System.out.println(ret);
        }	
	}
}

