package basicmath;

public class NumberPalindrome { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 7337;
		int temp = 0;
		int n1 = n;
		while(n1>0) {
			temp = (temp*10) + (n1%10);
			n1=n1/10;
		}
		
		if(temp==n)
			System.out.println("Given number is a palindrome: "+temp);
		else
			System.out.println("Given number is not a palindrome: "+temp);
	}

}
