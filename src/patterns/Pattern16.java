package patterns;

public class Pattern16 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		String s = "ABCDE"; 
		for(int i=0;i<n;i++) { 
			String temp = Character.toString(s.charAt(i));
			for(int j=0;j<=i;j++) { 
				System.out.print(temp);
			}
			System.out.println();
		}
	}

}
