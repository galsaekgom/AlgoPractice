package lecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/lecture/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
	        String ret = "";
	        String text = sc.next();
	        String[] textArray = new String[text.length()/2];
        	
        	int j = 0;
        	for(int i = 0; i < text.length(); i+=2){
        		textArray[j] = text.substring(i, i+2);
        		j++;
        	}
        	
        	Arrays.sort(textArray);
        	
        	for(String t : textArray){
        		ret += t;
        	}
        	
	    	System.out.println(ret);
        }	
	}

}
