package tw.tsunglin.leetcode1017;



public class CombinationSumIV {
	public int combinationSum4(int[] nums, int target) {
		int[] dp = new int[target + 1];
		dp[0] = 1;

		for (int k = 1; k <= target; k++) {
			for (int i = 0; i < nums.length; i++) {
				if (k - nums[i] >= 0) {
					dp[k] += dp[k - nums[i]];
				}
			}
		}

		return dp[target];

	}

	public static void main(String[] args) {
		CombinationSumIV test = new CombinationSumIV();
		int[] nums = new int[] {1, 2, 3};
		int target = 4;
		int ans = test.combinationSum4(nums, target);
		
		System.out.println(ans);

	}

}
