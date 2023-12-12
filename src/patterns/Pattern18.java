package patterns;

public class Pattern18 { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n = 5;
		int count = 0;
		String s="ABCDE";String temp = ""; 
		
		for(int i=0;i<n;i++) {
			count = n-1;
			temp = "";
			for(int j=0;j<=i;j++) { 
				temp = s.charAt(count) + " "+temp;
				count--;
			}
			System.out.print(temp);
			System.out.println();
		}
	}
}
