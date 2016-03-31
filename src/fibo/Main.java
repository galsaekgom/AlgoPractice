package fibo;

public class Main {
	public static void main(String[] args){
		System.out.println(fibo(7));
		System.out.println(fibo2(7));
	}
	
	static int fibo(int n){
		if(n<=2){
			return 1;
		}else{
			return fibo(n-2) + fibo(n-1);
		}
	}
	
	static int fibo2(int n){
		int[] cache = new int[10000000];
		cache[1] = 1;
		cache[2] = 1;

		for(int i=3; i<=n; i++){
			cache[i] = cache[i-1] + cache[i-2];
		}
		
		return cache[n];
	}

}