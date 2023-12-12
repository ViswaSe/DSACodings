package basicmath;

public class ArmstrongNumber { //author:vishveshwar
	public static void main(String args[]) { 
		int n = 92727;
		int count = 0;
		
		//get the count of digits
		int n1 = n;
		while(n1>0) { 
			n1 = n1/10;
			count = count+1; 
		}
		
		//armstrong number validations
		n1 = n;
		int result = 0;
		while(n1>0) { 
			int temp = n1%10;
			result = (int) (result+Math.pow(temp,count));
			n1 = n1/10;
		}
		
		if(result==n)
			System.out.println("Given number is an armstrong number: " +result);
		else
			System.out.println("Given number is not an armstrong number: "+result);
	} 
}
