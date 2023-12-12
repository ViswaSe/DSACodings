package patterns;

public class Pattern1 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		int count = n;
		
		for(int i=0;i<n;i++) {
			count = n;
			while(count>0) {
				System.out.print("*");
				count--;
			}
			System.out.println();
		}
	}

}
