package arrays.medium;

public class KadanesAlgorithm { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		int size = nums.length;
		
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<size;i++) { 
			sum = sum+nums[i]; //-2
			
			if(sum>max) { 
				max = sum;
			}
			
			if(sum<0) 
				sum = 0;
		}
		System.out.println(max);
	}

}
