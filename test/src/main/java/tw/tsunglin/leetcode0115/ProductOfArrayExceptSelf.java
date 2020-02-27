package tw.tsunglin.leetcode0115;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] ans = new int[nums.length];
		int total = 1;
		for(int i=0; i<nums.length; i++) {
			total = total * nums[i];
		}
		
		for(int i=0; i<nums.length; i++) {
			int tmp = total / nums[i];
			ans[i] = tmp;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
