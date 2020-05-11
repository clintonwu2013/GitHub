package tw.tsunglin.leetcode0108;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		int ans = 0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i; j<prices.length;j++) {
				int tmp = prices[j]-prices[i];
				if(tmp > ans) {
					ans = tmp;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
