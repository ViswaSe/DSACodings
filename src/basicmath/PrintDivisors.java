package basicmath;

public class PrintDivisors { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 300;
		
		System.out.println("Divisors are: ");
		for(int i=2;i<=n;i++) { 
			if(n%i==0) 
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
