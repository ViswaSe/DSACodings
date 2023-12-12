package recursion;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HighestAndLowestFrequency { //author:vishveshwar

	public static void main(String args[]) { 
		int arr[] = {2,3,1,3,5,2,3,5,5};
		int size = arr.length;
		int count = 1;

		Map<Integer,Integer> map = new TreeMap<Integer,Integer> () ;

		for(int i=0;i<size;i++ ) { 
			if(map.containsKey(arr[i])) { 
				count = map.get(arr[i]) + 1;
				map.put(arr[i], count); 
			}
			else
				map.put(arr[i], count);

			count = 1; //resetting the counter value.
		}

		int maxFrequency = 0; 
		int lowerFrequency = 10;

		for(Entry<Integer,Integer> each:map.entrySet()) { 
			if(each.getValue()>=maxFrequency) 
				maxFrequency = each.getValue();

			if(each.getValue()<=lowerFrequency)  
				lowerFrequency = each.getValue();
		} 

		//printing the higher and lower frequency elements
		System.out.println("Max Entries: ");
		for(Entry<Integer,Integer> each:map.entrySet()) { 
			if(each.getValue()==maxFrequency) { 
				System.out.println(each.getKey()+"-"+each.getValue());
			}
		} 

		System.out.println("Lower Entries: ");
		for(Entry<Integer,Integer> each:map.entrySet()) { 
			if(each.getValue()==lowerFrequency) { 
				System.out.println(each.getKey()+"-"+each.getValue());
			}
		}
	}

}
