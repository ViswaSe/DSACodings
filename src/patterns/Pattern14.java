package patterns;

public class Pattern14 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		String s = "ABCDE"; 
		for(int i=0;i<n;i++) { 
			for(int j=0;j<=i;j++) { 
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

}
