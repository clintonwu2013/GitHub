package tw.tsunglin.leetcode0726;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int ans=nums.length;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>= target) {
				ans=i;
				return ans;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		int ans = SearchInsertPosition.searchInsert(nums, target);
		System.out.println(ans);
	}

}
