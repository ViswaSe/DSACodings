package arrays.easy;

public class CountConsecutiveOnes { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {1, 0, 1, 1, 0, 1};
		int size = nums.length;
				
		int count = 0;
		int max = 0; 
		
		for(int i=0;i<size;i++) {
			if(nums[i]==1) { 
				count=count+1;
			}
			else { 
				count = 0; 
				continue;
			}
			
			if(count>max)
				max = count; 
		}
		
		System.out.println(max);
	}

}
