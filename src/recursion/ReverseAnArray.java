package recursion;

public class ReverseAnArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int[] arr = {2,5,1,4,6,3}; 
		int size = arr.length;
		
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<size-i-1;j++) { 
				int temp = arr[j]; 
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		for(int each:arr)
		{
			System.out.print(each+" ");
		}
	}

}
