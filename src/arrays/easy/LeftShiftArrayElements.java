package arrays.easy;

public class LeftShiftArrayElements { //author:vishveshwar
	
	public static void main(String args[]) {
		int nums[] = {1,11,5,1,4,93,93,4};
		int size = nums.length;
		
		int left = 4;
		
		for(int i=left;i<size;i++) { 
			System.out.print(nums[i]+" ");
		}

		while(left>0) {
			System.out.print(nums[left-1]+" ");
			left--;
		}
	}

}
