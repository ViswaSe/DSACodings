package recursion;

public class FibonacciNumber { //author:vishveshwar
	
	public static void main(String args[]) { 
		
		int a = 0;
		int b = 1;
		
		int n = 15;
		
		while(n>0) { 
			b = a+b; //2 3 5
			a = b-a; //1 1 2 
			System.out.println(a);
			n--;
		}
	}

}
