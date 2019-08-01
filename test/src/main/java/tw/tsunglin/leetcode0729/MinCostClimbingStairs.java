package tw.tsunglin.leetcode0729;

public class MinCostClimbingStairs {

	public static int minCostClimbingStairs(int[] cost) {
		int f1 = cost[0];
		int f2 = cost[1];
	    for (int i = 2; i < cost.length; i++) {
	      int f_current = cost[i] + Math.min(f1, f2);
	      f1 = f2;
	      f2 = f_current;
	    }
	    return Math.min(f1, f2);
	}

	public static void main(String[] args) {
		int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int ans = MinCostClimbingStairs.minCostClimbingStairs(cost);
		System.out.println(ans);
	}

}
