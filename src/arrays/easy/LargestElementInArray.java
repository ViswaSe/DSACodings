package arrays.easy;

public class LargestElementInArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {113,2,8,55,1,4,23};
		int size = nums.length;
		
		int  max = nums[0]; 
		
		for(int i=1;i<size;i++) {  
			if(max<nums[i])
				max = nums[i];
		}
		
		System.out.println(max);
	}

}
