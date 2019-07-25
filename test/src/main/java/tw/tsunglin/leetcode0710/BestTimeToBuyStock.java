package tw.tsunglin.leetcode0710;

public class BestTimeToBuyStock {

	public int maxProfit(int[] prices) {
		int rs=0;
		for(int i=0; i<prices.length; i++) {
			int buy = -prices[i];
			for(int j=i+1; j<prices.length; j++) {
				int sell = prices[j];
				int test = buy + sell;
				if(test>rs) {
					rs=test;
				}
			}
		}
		return rs;
	}
	public int maxProfit2(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        
        while(i<prices.length-1) {
        	while(i < prices.length - 1 && prices[i]>=prices[i+1]) {
        		i++;
        	}
        	valley = prices[i];
        	
        	while(i < prices.length - 1 && prices[i]<=prices[i+1]) {
        		i++;
        	}
        	peak = prices[i];
        	maxprofit = maxprofit+ peak-valley;
        }
        return maxprofit;
    }
	public static void main(String[] args) {
		BestTimeToBuyStock test = new BestTimeToBuyStock();
		int[] array = {7,1,5,3,6,4};
		int ans = test.maxProfit2(array);
		
		System.out.println(ans);
	}
}
