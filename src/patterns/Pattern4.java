package patterns;

public class Pattern4 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		int count = 0;
		
		for(int i=0;i<n;i++) {
			count = count + 1; 
			for(int j=0;j<=i;j++) { 
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
