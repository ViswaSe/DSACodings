package arrays.medium;

public class SortAnArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {2,0,2,1,1,0};  
		int size = nums.length;
		
		for(int i=1;i<size;i++) {  //i=0 
			int j=i-1; //j=0
			int key = nums[i]; //key=0
 			
			while(j>=0 && nums[j]>key) {  //2>0
				nums[j+1] = nums[j]; //2 2 2 1 1 0
				j--;
			}
			nums[j+1] = key; //0 2 2 1 1 0 
		}
		
		for(int each:nums)
			System.out.print(each+" ");
	}

}
