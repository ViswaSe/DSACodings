package recursion;

public class PrintNTo1 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 100; 
		printUsingRecursion(n); 
	}
	
	public static void printUsingRecursion(int i) { 
		if(i>0) { 
			System.out.println(i);
			i--;
			printUsingRecursion(i);
		}
	}
}
