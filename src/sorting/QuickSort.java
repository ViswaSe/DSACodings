package sorting;

public class QuickSort { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {4,6,2,5,7,9,1,3};
		int size = nums.length;
		
		quickSort(nums,0,size-1); 
		
		//print the array after the quick sort is done
		for(int each:nums)
			System.out.print(each+ " ");
	}
	
	private static void quickSort(int[] nums,int low,int high) { 
		if(low<high) { 
			
			int pi = partition(nums,low,high); 
			
			quickSort(nums,low,pi-1);
			quickSort(nums,pi+1,high);
		}
	}
	
	private static int partition(int[] nums,int low,int high) { 
		
		int pivot = nums[high]; 
		int i = low-1;
		
		for(int j=low;j<high;j++ ) { 
			if(nums[j]<pivot) { 
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		
		int temp = nums[i+1]; 
		nums[i+1] = nums[high]; 
		nums[high] = temp;
		
		//returning the pivot position
		return i+1;
	}

}
