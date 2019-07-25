package tw.tsunglin.leetcode0723;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int ans = 0;
		for(int i=0; i<nums.length; i++) {
			ans = ans ^nums[i];
		}
		
		return ans;
        
    }
	public static void main(String[] args) {
		SingleNumber singleNumber = new SingleNumber();
		int[] nums = {78,78,784,1,2,1,2};
		int ans = singleNumber.singleNumber(nums);
		
		System.out.println(ans);

	}

}
