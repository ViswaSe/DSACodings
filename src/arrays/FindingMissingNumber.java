package arrays;

public class FindingMissingNumber { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[]= {3,6};
		int size = nums.length;

		int count = 1; 
		
		for(int i=0;i<size;i++) { 
			if(nums[i]!=count) { 
				System.out.print(count+" ");
				i=i-1;
			}
			count++;
		}
	}

}
