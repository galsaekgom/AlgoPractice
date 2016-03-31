package convert;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/convert/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
//		Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int totalCases = cases;
        
        while(cases-- > 0) {
	        String ret = "";
	        double val = sc.nextDouble();
	        String mes = sc.next();
        	
        	switch (mes) {
				case "kg":
					val *= 2.2046;
					mes = "lb";
					break;
				case "lb":
					val = (Math.round((val*0.4536)*10000)/10000.0);
					mes = "kg";
					break;
				case "l":
					val *= 0.2642;
					mes = "g";
					break;
				case "g":
					val = (Math.round((val*3.7854)*10000)/10000.0);
					mes = "l";
					break;
	
				default:
					break;
			}
        	
        	DecimalFormat format = new DecimalFormat("0.0000");
        	String valStr = format.format(val);
        	
	    	System.out.println((totalCases - cases)+" "+valStr+" "+mes);
        }	
	}
}

