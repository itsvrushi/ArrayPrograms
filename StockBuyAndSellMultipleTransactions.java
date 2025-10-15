package Arrays;

public class StockBuyAndSellMultipleTransactions {

	public static void main(String[] args) {
	
		int ar[]= {100,180,260,310,40,5,535,695};
		
		System.out.println(maxProfit(ar));
	}
	
	public static int maxProfit(int[]ar)
	{
		int profit=0;
		int buy=ar[0],sell=0;
		for (int i = 0; i < ar.length-1; i++) {
			
			if (ar[i+1]>ar[i]) {
				
				sell=ar[i+1];
			}
			else if (sell-buy>=0) {
				profit=sell-buy;
				buy=ar[i+1];
			}
		}
		if (sell-buy>=0) {
			profit+=(sell-buy);
		}
		return profit;
	}
	
}
