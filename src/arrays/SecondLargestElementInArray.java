package arrays;

public class SecondLargestElementInArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {93,112,88,5,1,4,23};
		int size = nums.length;

		for(int i=0;i<size-1;i++) { 
			for(int j=i+1;j<size;j++) { 
				if(nums[i]<nums[j]) { 
					int temp = nums[j];
					nums[j] = nums[i]; 
					nums[i] = temp;
				}
			}
		}
		
		System.out.println("Second Largest Element: "+nums[1]);
	}

}
