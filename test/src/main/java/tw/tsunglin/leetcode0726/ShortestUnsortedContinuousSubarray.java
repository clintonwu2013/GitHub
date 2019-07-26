package tw.tsunglin.leetcode0726;

public class ShortestUnsortedContinuousSubarray {
	public static int findUnsortedSubarray(int[] nums) {
		int head=0;
		int foot=nums.length-1;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]>nums[i+1]) {
				head=i;
				break;
			}
		}
		for(int i=nums.length-1;i>=1;i--) {
			if(nums[i]<nums[i-1]) {
				foot=i;
				break;
			}
		}
		
		return foot-head+1;

	}
	public static void main(String[] args) {
		int[] nums = {2, 6, 4, 8, 10, 9, 15};
		int ans = ShortestUnsortedContinuousSubarray.findUnsortedSubarray(nums);
		System.out.println(ans);
	}

}
