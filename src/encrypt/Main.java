package encrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/mispell/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int totalCases = cases;
        
        while(cases-- > 0) {
	        String ret = "";
	        int m = sc.nextInt();
	        String text = sc.next();
        	
        	ret = text.substring(0, m-1);
        	
			if(m < text.length()){
				ret += text.substring(m);
			}
	
	    	System.out.println((totalCases-cases)+" "+ret);
        }	
	}
}

