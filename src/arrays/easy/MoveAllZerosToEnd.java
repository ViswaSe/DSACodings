package arrays.easy;

public class MoveAllZerosToEnd { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {0, 1 ,3 ,2 ,3 ,5, 0 ,4 ,0 ,1};
		int size = nums.length;
		
		int count=0;
		
		while(count<size) { 
			int temp = nums[count];
			if(nums[count]==0) { 
				int j;
				for(j=count;j<size-1;j++) { 
					nums[j] = nums[j+1];
				}
				nums[j] = temp;
			}
			count++;
		}
		
		for(int each:nums)
			System.out.print(each+" ");
	}
}
