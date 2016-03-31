package quadtree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/quadtree/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        
        while(cases-- > 0) {
        	String original = sc.next();
        	String ret = "";
        	
        	ret = reverse(original);
        	System.out.println(ret);
        }	
	}
	
	
	public static String reverse(String o){
		//첫번째가 x가 아닐경우 그대로 반환 
		if(o.charAt(0) != 'x'){
			return o.charAt(0) + "";
		}
		
		//첫번째가 x일 경우 
		String[] reversed = new String[4];
		int i = 1;
		reversed[0] = reverse(o.substring(i)); //b
		i += reversed[0].length();
		reversed[1] = reverse(o.substring(i)); //w
		i += reversed[1].length();
		reversed[2] = reverse(o.substring(i)); //w
		i += reversed[2].length();
		reversed[3] = reverse(o.substring(i)); //b
		
		return 'x' + reversed[2]+reversed[3]+reversed[0]+reversed[1];
	}
}

