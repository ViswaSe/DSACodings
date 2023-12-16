package sorting;

public class SelectionSortUsingMaxIndex { //author:vishveshwar
	
	public static void main(String args[]) { 
		int[] nums = {13,46,24,52,20,9};
		int size = nums.length;
		
		for(int i=0;i<size-1;i++) { 
			int max = i;
			for(int j=i+1;j<size;j++) { 
				if(nums[j]>nums[max]) { 
					max = j;
				}
			}
			int temp = nums[max]; 
			nums[max] = nums[i];
			nums[i] = temp;
		}
		
		for(int each:nums) 
			System.out.print(each+" ");
	}

}
