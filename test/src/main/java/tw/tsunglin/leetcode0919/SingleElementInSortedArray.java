package tw.tsunglin.leetcode0919;

public class SingleElementInSortedArray {
	public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
		while (low != high) {  //different.
            int mid = low + (high - low) / 2;
            if (mid % 2 == 1) {
            	--mid;
            }
            if (nums[mid] == nums[mid+1]) {
            	low = mid + 2;
            }else {
            	high = mid;
            }
        }
        return nums[high];
    }
	public static void main(String[] args) {
		SingleElementInSortedArray test = new SingleElementInSortedArray();
		int ans = test.singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8});
		System.out.println(ans);

	}

}
