package arrays;

public class RemoveDuplicatesFromSortedArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {1,11,5,1,4,93,93,4};
		int size = nums.length;
		
		//first sort the array
		for(int i=0;i<size;i++) { 
			for(int j=0;j<size-i-1;j++) { 
				if(nums[j]>nums[j+1]) { 
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		boolean flag = false;
	
		for(int i=0;i<size;i++) { 
			flag = false;
			for(int j=i+1;j<size;j++) { 
				if(nums[i]!=nums[j]) { 
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag || i==size-1)
				System.out.print(nums[i]+" ");
		}
	}

}
