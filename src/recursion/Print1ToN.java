package recursion;

public class Print1ToN { //author:vishveshwar
	
	public static void main(String args[]) { 
		printUsingRecursion(1);
	}
	
	public static void printUsingRecursion(int i) { 
		while(i>0) { 
			System.out.println(i);
			i=i+1;
		}
	}

}
