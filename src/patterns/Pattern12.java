package patterns;

public class Pattern12 { //author:vishveshwar

	public static void main(String args[]) { 
		int n = 7; 
		int count = 0;

		for(int i=0;i<n;i++) { 
			for(int j=0;j<=i;j++) {
				count=count+1;
				System.out.print(count);
			}
			for(int k=i;k<n-1;k++) { 
				System.out.print(" ");
			}
			for(int k=i;k<n-1;k++) { 
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) { 
				if(j==i)
					count=1;
				System.out.print(count);
				count=count-1;
			}
			count=0;
			System.out.println();
		}
	}
}
