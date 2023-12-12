package basicmath;

public class CountDigits { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 1235;
		
		int count = 0;
		
		while(n>0) {
			n=n/10;
			count=count+1;
		}
		
		System.out.println("count of digits: "+count);
	} 

}
