package swtest;


public class Swtest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		String bins = "0100001";
		String expect = "1000010";
		String result = null;
		int c = Integer.valueOf(bins, 2);
		
		result = Integer.toBinaryString(c);
		String cbin = Integer.toBinaryString(c);
		
		System.out.println(cbin);
		System.out.println(result);
		System.out.println(expect);
		
		String bin = Integer.toBinaryString(a);
		String oct = Integer.toOctalString(a);
		String hex = Integer.toHexString(a);
 
		System.out.println("int -> 문자열 이진수 : " + bin);
		System.out.println("int -> 문자열 8진수  : " + oct);
		System.out.println("int -> 문자열 16진수: " + hex);
		System.out.println();
 
		System.out.println("문자열 이진수 -> int : " + Integer.valueOf(bin, 2));
		System.out.println("문자열 8진수  -> int : " + Integer.valueOf(oct, 8));
		System.out.println("문자열 16진수-> int : " + Integer.valueOf(hex, 16));
	}

}
