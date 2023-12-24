package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeElementsBySign { //author:vishveshwar

	public static void main(String args[]) { 
		int nums[] = {1,2,-3,-1,-2,3};
		int size = nums.length;
		
		List<Integer> negList = new ArrayList<Integer>();
		List<Integer> posList = new ArrayList<Integer>();
		
		for(int i=0;i<size;i++) { 
			if(nums[i]>0) 
				posList.add(nums[i]);
			else
				negList.add(nums[i]);
		}
		
		int k = 0; 
		int pos=0,neg=0;
		
		for(int i=0;i<size;i++) { 
			if(i%2==0 && pos!=posList.size())  { 
				nums[k] = posList.get(pos);
				k++;pos++;
			}
			else if(neg!=negList.size()) { 
				nums[k] = negList.get(neg);
				k++;neg++;
			}
		} 
		
		while(posList.size()>pos) { 
			nums[k]=posList.get(pos);
			pos++;
			k++;
		}
		
		while(negList.size()>neg) { 
			nums[k]=negList.get(neg);
			neg++;
			k++;
		}
		
		for(int each:nums)
			System.out.print(each+" ");
	}
}