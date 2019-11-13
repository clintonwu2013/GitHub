package tw.tsunglin.leetcode1112;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int tmp = 0;
		int max = -2147483647;
		for(int num: nums) {
			tmp = tmp + num;
			if(tmp > max) {
				max = tmp;
			}
			if(tmp<0) {
				tmp = 0;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
