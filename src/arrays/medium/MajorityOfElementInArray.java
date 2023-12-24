package arrays.medium;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MajorityOfElementInArray { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {5,5,5,3,4,4,4,5,5,4,5,5};
		int size = nums.length;
		int limit = (int) Math.floor(size/2);
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>(); 
		
		int count = 1;
		
		for(int i=0;i<size;i++) { 
			if(map.containsKey(nums[i])) { 
				count = map.get(nums[i]);
				map.put(nums[i], count+1);
			}
			else
				map.put(nums[i], count);
			
			count=1;
		}

		for(Entry<Integer,Integer> eachSet:map.entrySet()) { 
			if(eachSet.getValue()>limit) {
				System.out.println(eachSet.getKey());
			}
		} 
	}

}
