package arrays;

public class RightRotateArrayElements { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {1,2,3,4,5,6,7};
		int size = nums.length;
		
		int n=2; //rotate the array elements by N number
		
		for(int i=0;i<n;i++) { 
			int temp = nums[size-1];
			int j;
			for(j=size-1;j>0;j--) { 
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
		
		for(int each:nums) 
			System.out.print(each+" ");
	}

}
