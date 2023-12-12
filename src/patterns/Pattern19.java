package patterns;

public class Pattern19 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 10;
		
		//above pattern
		for(int i=0;i<n/2;i++) { 
			for(int j=i;j<n/2;j++) { 
				System.out.print("*"); 
			}
			for(int k=0;k<(i*2);k++) { 
				System.out.print(" ");
			}
			for(int j=i;j<n/2;j++) { 
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		//below pattern
		for(int i=n/2;i>0;i--) { 
			for(int j=n/2;j>=i;j--) { 
				System.out.print("*");
			}
			for(int k=0;k<(i*2)-2;k++) 
			{
				 System.out.print(" ");
			}
			for(int j=n/2;j>=i;j--) { 
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
