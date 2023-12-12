package basicmath;

public class ReverseNumber { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 745632;
		int temp = 0;
		
		while(n>0) { 
			temp = temp*10+(n%10); 
			n=n/10;
		}
		
		System.out.println("Reversal of the given number: "+temp);
	}

}
