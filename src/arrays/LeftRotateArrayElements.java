package arrays;

public class LeftRotateArrayElements { //author:vishveshwar
	
	public static void main(String args[]) {
		int nums[]	= {1,2,3,4,5,6,7};
		int size = nums.length;
		
		int n=5; //rotate the elements by N numbers
		
		for(int i=0;i<n;i++) { 
			int temp = nums[0];
			int j;
			for(j=0;j<size-1;j++) { 
				nums[j] = nums[j+1]; 
			}
			nums[j] = temp;
		}
		
		for(int each:nums) 
			System.out.print(each+" ");
	}
}
