package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation { //author:vishveshwar
	
	public static void main(String args[]) { 
		int nums[] = {1,2,3,4};
		List<List<Integer>> resultList = permutate(nums);
		
		//print the complete result list which holds the permutation lists
		System.out.println("Permutation size: "+resultList.size());
		for(List<Integer> each:resultList)
			System.out.println(each);
	}
	
	public static List<List<Integer>> permutate(int[] nums) { 
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		backTracking(resultList,new ArrayList<Integer>(),nums); 
		return resultList;
	}
	
	//approach handled using back tracking algorithm
	private static void backTracking(List<List<Integer>> resultList,ArrayList<Integer> tempList,int[] nums) { 
		//add the list in the result List if the temp list reaches the limit 
		if(tempList.size()==nums.length) { 
			resultList.add(new ArrayList<Integer>(tempList));
			//return;
		}
		
		for(int each:nums) { 
			int number = each; 
			//check the number should not be added again on the list 
			if(tempList.contains(number)) 
				continue; 
			
			//add the number on the list if it is not already present
			tempList.add(number); 
			
			//use the backtracking algo to perform the same operation again and again 
			backTracking(resultList,tempList,nums); 
			
			//clear the tempList value or remove the last element to perform the recursion again
			tempList.remove(tempList.size()-1);
		}
	}
}
