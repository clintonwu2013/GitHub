package tw.tsunglin.leetcode1001;

public class MaximumSubarray {
	public static int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int currentMaxSum = 0;

		for (int i = 0; i < nums.length; i++) {

			currentMaxSum = Math.max(nums[i], nums[i] + currentMaxSum);
			maxSum = Math.max(maxSum, currentMaxSum);

		}

		return maxSum;
	}

	public static void main(String[] args) {
		int ans = MaximumSubarray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
		System.out.println(ans);
	}

}
