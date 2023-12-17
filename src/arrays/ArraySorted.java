package arrays;

public class ArraySorted { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {20,23,24,22,25};
		int size = nums.length;
		
		boolean flag = false;
		int min = nums[0];
		
		for(int i=1;i<size;i++) {
			min = nums[i-1];
			if(min<nums[i])
				flag = true;
			else { 
				flag = false;break;
			}
		}
		
		if(flag)
			System.out.println("The array is sorted");
		else
			System.out.println("The array is not sorted");
	}

}
