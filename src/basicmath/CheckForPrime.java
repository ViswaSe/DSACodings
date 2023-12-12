package basicmath;

public class CheckForPrime { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 79; 
		boolean flag = true; 
		
		for(int i=2;i<n/2;i++) { 
			if(n%i==0) 
				flag = false; 
		}
		
		if(flag)
			System.out.println("Given number is a prime number: "+n);
		else
			System.out.println("Given number is not a prime: "+n);
	}

}
