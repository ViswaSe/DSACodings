package sorting;

public class InsertionSort { //author:vishveshwar
	
	public static void main(String args[]) { 
		
		int arr[] = {5,4,3,2,1};
		int size = arr.length;
		
		for(int i=1;i<size;i++) { 
			int j=i-1;
			int key = arr[i]; 
			
			while(j>=0 && arr[j]>key) { 
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int each:arr) 
			System.out.print(each+ " ");
		
	}

}
