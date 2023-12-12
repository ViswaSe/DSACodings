package patterns;

public class Pattern15 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		int end = n;
		String s = "ABCDE"; 
		for(int i=0;i<n;i++) { 
			for(int j=0;j<end;j++) { 
				System.out.print(s.charAt(j));
			}
			end = end-1;
			System.out.println();
		}
	}

}
