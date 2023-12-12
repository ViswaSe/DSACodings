package patterns;

public class Pattern17 { //author:vishveshwar

	public static void main(String args[]) { 
		int n = 7;

		String s = "ABCDEFG";
		int count = 0;

		for(int i=0;i<n;i++) { 
			count = i; 

			for(int k=i;k<n-1;k++) { 
				System.out.print(" ");
			}
			for(int j=0;j<=(i*2);j++) {    
				if(j<count || j==0)
					System.out.print(s.charAt(j));
				else
					while(count>=0) { 
						System.out.print(s.charAt(count));
						count--;
					}
			}
			for(int k=i;k<n-1;k++) { 
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
