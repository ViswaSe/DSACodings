package sorting;

public class BubbleSort { //author:vishveshwar

	public static void main(String args[]) { 
		int nums[]  = {13,46,24,52,20,9};
		int size = nums.length;

		for(int i=0;i<size;i++ ) { 
			for(int j=0;j<size-i-1;j++) { 
				if(nums[j]>nums[j+1]) { 
					int temp = nums[j];
					nums[j] = nums[j+1]; 
					nums[j+1] = temp;
				}
			}
		}
		
		//print after bubble sorting
		for(int each:nums) { 
			System.out.print(each+" ");
		}
	}

}
