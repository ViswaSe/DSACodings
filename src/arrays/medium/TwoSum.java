package arrays.medium;

public class TwoSum { //author:vishveshwar
	
	public static void main(String args[]) { 
		int arr[] = {2,6,5,8,11};
		int size = arr.length;
		int target = 8;
		
		boolean flag = false;
		
		for(int i=0;i<size;i++) { 
			for(int j=i+1;j<size;j++) { 
				if(arr[i]+arr[j]==target) 
				{
					flag = true; 
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
				else
					flag = false;
			}
			
			if(flag) 
				break;
		}
		
		if(flag) 
			System.out.println("Yes Variant exists");
		else
			System.out.println("No variant exists");
	}

}
