package tw.tsunglin.leetcode0729;



public class LargestNumberAtLeastTwiceOfOthers {
	public static int dominantIndex(int[] nums) {
		
		int max = 0;
		int maxIndex = 0;
		boolean flag= true;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max = nums[i];
				maxIndex = i;
			}
			
		}
		System.out.println(max);
		System.out.println(maxIndex);
		for(int i=0;i<nums.length;i++) {
			if(2*nums[i]>max) {
				flag=false;
				break;
			}
		}
		if(flag) {
			return maxIndex;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {3, 6, 1, 0};
		int ans = LargestNumberAtLeastTwiceOfOthers.dominantIndex(nums);
		System.out.println(ans);
	}

}
