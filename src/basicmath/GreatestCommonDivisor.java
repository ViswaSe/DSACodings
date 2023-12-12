package basicmath;

public class GreatestCommonDivisor { //author:vishveshwar

	public static void main(String args[]) { 
		int n = 200;
		int n1 = 150;
		
		int divisor = 0;
		int gcd = 1;
		
		if(n1>n)
			divisor = n;
		else 
			divisor = n1;
		
		for(int i=2;i<=divisor;i++) { 
			if(n%i==0 && n1%i==0 && gcd<i)
				gcd = i;
		}
		
		System.out.println("Greatest common divisor: "+gcd);
	}
}
