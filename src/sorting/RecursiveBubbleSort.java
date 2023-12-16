package sorting;

public class RecursiveBubbleSort { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {13,46,24,52,20,9};
		int size = nums.length;
		
		bubbleSort(nums,size); 
		
		for(int each:nums) 
			System.out.print(each+" ");
	}
	
	private static void bubbleSort(int[] nums,int n) { 
		if(n>=0) { 
			for(int j=0;j<n-1;j++) { 
				if(nums[j]>nums[j+1]) { 
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
			
			n--;
			bubbleSort(nums,n);
		}
	}
}
