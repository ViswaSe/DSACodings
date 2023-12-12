package patterns;

public class Pattern6 { //author:vishveshwar
	public static void main(String args[]) { 
		int n = 5;
		int count = 0;
		
		for(int i=0;i<n;i++) { 
			count = 0;
			for(int j=n;j>i;j--) { 
				count = count+1;
				System.out.print(count);
			}
			System.out.println();
		}
	}
}
