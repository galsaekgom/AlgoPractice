package mispell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/encrypt/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
	        String ret = "";
	        String ret2 = "";
	        String text = sc.next();
        	
        	int length = text.length();
        	
        	if(length == 1){
        		System.out.println(text);
        		continue;
        	}
        	
        	for(int i = 0; i < length; i++){
        		if(i % 2 == 0){
        			ret += text.charAt(i);
        		}else{
        			ret2 += text.charAt(i);
        		}
        	}
        	
        	ret += ret2;
        	
	    	System.out.println(ret);
        }	
	}
}

