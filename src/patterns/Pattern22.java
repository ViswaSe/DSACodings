package patterns;

public class Pattern22 { //author:vishveshwar
	
	public static void main(String args[]) { 
		
		int n = 5;
		int size = (2*n)-1;
		
		int[][] mat = new int[size][size];
		
		
		int top = 0;
		int left = 0;
		int bottom = size-1; 
		int right = size-1;
		
		while(n>0) { 
			
			for(int i=left;i<=right;i++) { 
				mat[top][i] = n;
			}
			for(int i=top;i<=bottom;i++) {
				mat[i][right] = n;
			}
			for(int i=right;i>=left;i--) { 
				mat[bottom][i] = n;
			}
			for(int i=bottom;i>=top;i--) { 
				mat[i][left] = n;
			}
			
			left++;
			right--;
			bottom--;
			top++; 
			n--;
		}
		
		for(int i=0;i<size;i++) { 
			for(int j=0;j<size;j++) { 
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
 		} 
	}

}
