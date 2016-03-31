package drawrect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "/Users/LuisKim/Documents/workspace/JavaPractice/src/drawrect/input.txt";
		
		Scanner sc = new Scanner(new File(filePath));
        int cases = sc.nextInt();
        while(cases-- > 0) {
            int[] x = new int[3];
            int[] y = new int[3];
            HashSet xSet = new HashSet();
            HashSet ySet = new HashSet();
            int retX = 0;
            int retY = 0;
            int xx = 0;
            int yy = 0;
            
            int i = 0;
            while(i < 3){
            	int tempX = sc.nextInt();
            	int tempY = sc.nextInt();
            	x[i] = tempX;
            	y[i] = tempY;
            	if(xSet.add(tempX) == false){
            		retX = tempX;
            	};
            	if(ySet.add(tempY) == false){
            		retY = tempY;
            	}
            	i++;
            }
            
            for(int j = 0; j < 3; j++){
            	if(x[j] != retX){
            		xx += x[j];
            	}
            	if(y[j] != retY){
            		yy += y[j];
            	}
            }
            System.out.println(xx +" "+ yy);
            
        }	
	}

}
