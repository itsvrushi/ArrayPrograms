package Arrays;

public class StockBuyAndSellOneTransaction {
	
	public static void main(String[] args) {
		int ar[]= {1,3,6,9,11};
		
		System.out.println(MaxProfit(ar));
		
	}

	public static int MaxProfit(int[]ar)
	{
		int minTillnow=ar[0];
		
		int profit=0,buy=0,sell=0;
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]<minTillnow) {
				minTillnow=ar[i];
				buy=ar[i];
			}
			int diff=ar[i]-minTillnow;
			if (diff>profit) {
				sell=ar[i];
				profit=diff;
			}
		}
		System.out.println("the stock was bought "+buy+" amount and sell at "+sell+" amouunt");
		return profit;
	}
}
