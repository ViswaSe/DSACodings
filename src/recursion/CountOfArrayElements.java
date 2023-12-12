package recursion;

import java.util.Arrays;

public class CountOfArrayElements { //author:vishveshwar

	public static void main(String args[]) { 
		int arr[] = {2,5,10,2,2,10,2,5,10,1};
		int size = arr.length;
		int temp = 0; int count = 1;
		Arrays.sort(arr);
		boolean flag = false;

		for(int i=0;i<size;i++) { 
			for(int j=i+1;j<size;j++) { 
				if(arr[i]==arr[j] && arr[j]!=temp) { 
					count = count+1;
					flag = true;
				}
				
			}
			
			temp = arr[i];
			if(flag) 
				System.out.println(temp+":"+count);
			
			count = 1;
			flag = false;
			temp = arr[i];
		}

	}
}