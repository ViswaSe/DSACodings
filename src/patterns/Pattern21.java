package patterns;

public class Pattern21 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		
		for(int i=0;i<n;i++) { 
			
			if(i==0||i==n-1) { 
				for(int j=0;j<n;j++) { 
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(int j=0;j<1;j++) { 
					System.out.print("*");
				}
				for(int k=2;k<n;k++) { 
					System.out.print(" ");					
				}
				for(int j=0;j<1;j++) { 
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
