package tw.tsunglin.leetcode0729;

public class BinarySearch {

	public static int search(int[] nums, int target) {
		int pivot;
		int left = 0;
		int right = nums.length-1;

		while (left <= right) {
			pivot = (left + right) / 2;
			if (nums[pivot] == target) {
				return pivot;
			}
			else {
				if (target < nums[pivot])
					right = pivot-1 ;
				else
					left = pivot+1 ;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] nums = { -1, 0, 3, 5, 9, 12 };
		int ans = BinarySearch.search(nums, 100);
		System.out.println(ans);
	}

}
