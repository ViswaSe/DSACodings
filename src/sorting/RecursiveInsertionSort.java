package sorting;

public class RecursiveInsertionSort { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {13,46,24,52,20,9};
		int size = nums.length;
		
		insertionSort(nums,1,size); 
		
		//print the output after the insertionSort is done 
		for(int each:nums)
			System.out.print(each+" ");
	}

	private static void insertionSort(int[] nums,int i,int n) { 
		if(i<n) { 
			int j=i-1;
			int key = nums[i]; 
			
			while(j>=0 && nums[j]>key) { 
				nums[j+1] = nums[j]; 
				j--; 
			}
			nums[j+1] = key;
			
			insertionSort(nums,i+1,n); 
		}
	}
}
