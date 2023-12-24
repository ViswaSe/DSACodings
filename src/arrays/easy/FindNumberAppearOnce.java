package arrays.easy;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindNumberAppearOnce { //author:vishveshwar
	
	public static void main(String args[]) { 
		int[] nums= {6,6,4,3,4,2};
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>(); 
		
		int count = 1; 
		
		for(int i=0;i<nums.length;i++) { 
			if(map.containsKey(nums[i])) { 
					count = map.get(nums[i]);
					map.put(nums[i], count+1);
			}
			else
				map.put(nums[i], count);
			
			count = 1;
		}
		
		for(Entry<Integer,Integer> eachSet: map.entrySet())  { 
			if(eachSet.getValue()==1)
				System.out.print(eachSet.getKey()+" ");
		}
	} 

}
