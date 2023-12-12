package patterns;

public class Pattern10 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 10;
		
		//above pattern
		for(int i=0;i<n/2;i++) { 
			for(int k=n;k>0;k--) { 
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) { 
				System.out.print("*");	
			}
			System.out.println();
		}
		
		//below pattern
		for(int i=0;i<(n/2)+1;i++) { 
			for(int k=n;k>0;k--) { 
				System.out.print(" ");
			}
			for(int j=n/2;j>=i;j--) { 
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
