package recursion;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountOfArrayElementsUsingMap { //author:vishveshwar
	
	public static void main(String args[]) { 
		int[] arr = {1,3,1,2,3,3,5,2,1};
		int size = arr.length;
		int count = 1;
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer> (); 
		
		for(int i=0;i<size;i++) { 
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]) + 1;
				map.put(arr[i], count);
			}
			else
				map.put(arr[i], count);
			
			count = 1;
		}
		
		for(Entry<Integer,Integer> each:map.entrySet()) {
			System.out.println(each.getKey()+"-"+each.getValue());
		}
	}

}
