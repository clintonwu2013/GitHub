package tw.tsunglin.leetcode0108;

public class RobHouses {
	int ans = 0;
	public int rob(int[] nums) {
		if(nums.length == 0) {
			return ans;
		}
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<nums.length; i=i+2) {
			sum1 = sum1 + nums[i];
		}
		for(int i=1; i<nums.length; i=i+2) {
			sum2 = sum2 + nums[i];
		}
		int ans = Math.max(sum1, sum2);
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
