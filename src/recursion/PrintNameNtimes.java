package recursion;

public class PrintNameNtimes { //author:vishveshwar
	
	static int n = 1; 
	public static void main(String args[]) { 
		recursionMethod(5,"Vishveshwar");
	}
	
	public static void recursionMethod(int i,String name) { 
		if(i>n) { 
			System.out.println(name);
			recursionMethod(i+1,name);
		}
	}

}
