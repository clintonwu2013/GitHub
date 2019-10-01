package tw.tsunglin.leetcode1001;

public class MaximumSubarrayReview {

	public static int maxSubArray(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int currMaxSum = 0;
		
		for(int num: nums) {
			currMaxSum = Math.max(num, num+currMaxSum);
			maxSum = Math.max(currMaxSum, maxSum);
		}
		return 0;
	}

	public static void main(String[] args) {
		int ans = MaximumSubarray.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
		System.out.println(ans);
	}
}
