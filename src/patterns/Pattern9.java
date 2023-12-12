package patterns;

public class Pattern9 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 12;
		
		//above pattern
		for(int i=0;i<n/2;i++) { 
			for(int k=i;k<n/2;k++) { 
				System.out.print(" ");
			}
			
			for(int j=0;j<=(i*2);j++) { 
				System.out.print("*");
			}
			
			for(int k=i;k<n/2;k++) { 
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//below pattern 
		
		for(int i=0;i<n/2;i++) { 
			for(int k=0;k<=i;k++) { 
				System.out.print(" ");
			}
			
			for(int j=n-1;j>(i*2);j--) { 
				System.out.print("*");
			}
			
			for(int k=0;k<=i;k++) { 
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
