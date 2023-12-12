package recursion;

public class SumOfFirstNNumbers { //author: vishveshwar

	public static void main(String args[]) { 
		sumOfNNumbers(4);
		sumOfNNumbers(6);
	}
	
	public static void sumOfNNumbers(int n) { 
		int result = 0;
		
		for(int i=1;i<=n;i++) { 
			result = result+i;
		}
		System.out.println("Sum of "+n+" numbers are: "+result);
	}

}
