package sorting;

public class SelectionSortUsingMinIndex { //author:vishveshwar

	public static void main(String args[]) { 
		int nums[]  = {13,46,24,52,20,9};
		int size = nums.length;

		for(int i=0;i<size-1;i++) { 
			int min = i; 
			for(int j=i+1;j<size;j++) { 
				if(nums[j]<nums[min])
					min=j;
			}
			int temp = nums[i];
			nums[i] = nums[min];
			nums[min] = temp; 
		}
		
		for(int each:nums) 
			System.out.print(each+" ");
	}
}
