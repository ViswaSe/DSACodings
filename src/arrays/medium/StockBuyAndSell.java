package arrays.medium;

public class StockBuyAndSell { //author:vishveshwar
	
	public static void main(String args[]) { 
		int prices[] = {7,2,5,3,6,4,11};
		int size = prices.length;
		
		int sell = 0,profit = 0; 
		
		for(int i=0;i<size-1;i++) { 
			int purchaseRate = prices[i]; //7 1 
			
			for(int j=i+1;j<size;j++) { 
				sell = prices[j] - purchaseRate; 
				if(sell>profit)  
					profit = sell;
			}
		}
		
		System.out.println("Profit rupees: "+profit);
		
	}

}
