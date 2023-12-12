package recursion;

public class FactorialOfNNumbers { //author:vishveshwar
	
	public static void main(String args[]) { 
		factorialOfNNumbers(4);
		factorialOfNNumbers(5);
	}
	public static void factorialOfNNumbers(int n) { 
		int result = 1;
		
		for(int i=1;i<=n;i++) { 
			result = result*i;
		}
		System.out.println("Factorial of the number "+n+" is: "+result);
	}
}
