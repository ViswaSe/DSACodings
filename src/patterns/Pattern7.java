package patterns;

public class Pattern7 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		
		for(int i=0;i<n;i++) {
			
			for(int k=i;k<((n*2)/2);k++) { 
				System.out.print(" ");
			}
			
			for(int j=0;j<=(i*2);j++) { 
				System.out.print("*");
			}
			
			for(int k=i;k<((n*2)/2);k++) { 
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

}
