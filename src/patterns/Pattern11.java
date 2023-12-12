package patterns;

public class Pattern11 { //author:vishveshwar
	
	public static void main(String args[])	{ 
		int n = 7;
		int count = 0;
		
		for(int i=0;i<n;i++) { 
			if(i%2!=0) 
				count = 0;
			else
				count = 1-count;
			
			for(int j=0;j<=i;j++) { 
				System.out.print(count+" ");
				if(count==0) 
					count = count+1;
				else
					count = 1-count;
			}
			System.out.println();
		}
		
	}

}
