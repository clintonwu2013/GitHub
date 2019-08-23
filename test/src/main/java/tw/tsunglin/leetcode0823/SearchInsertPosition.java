package tw.tsunglin.leetcode0823;

public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==target) {
				return i;
			}
			if(nums[i]>target) {
				return i;
			}
		}
		return target;

	}

	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int ans = SearchInsertPosition.searchInsert(nums, 5);
		System.out.println(ans);

	}

}
