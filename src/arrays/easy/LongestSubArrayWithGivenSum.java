package arrays.easy;

public class LongestSubArrayWithGivenSum { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {-1, 1, 1};
		int k = 1;
		int size = nums.length;
		int count = 1; int max = 0;
		
		int i=0;
		while(i<size) {
			int total = nums[i]; 
			count = 1;
			
			B: for(int j=i+1;j<size;j++) { 
				total = total+nums[j]; 
				count = count+1;
				if(total==k && max<count) { 
					max = count;
					total = nums[i]; 
					continue B;
				}
			}
			
			i++;
		}
		
		System.out.println("Longest sub array length: "+max);
	}

}
