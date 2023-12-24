package arrays.easy;

import java.util.ArrayList;
import java.util.Collections;

public class FindUnion { //author:vishveshwar
	
	public static void main(String args[]) { 
		int n1[] = {1,2,3,4,9};
		int n2[] = {8,3,6,4,5};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n1.length;i++) { 
			if(!(list.contains(n1[i])))
				list.add(n1[i]);
		}
		
		for(int i=0;i<n2.length;i++) { 
			if(!(list.contains(n2[i])))
				list.add(n2[i]);
		}
		
		Collections.sort(list);
		
		for(int each:list)
			System.out.print(each+" ");
		
	} 

}
