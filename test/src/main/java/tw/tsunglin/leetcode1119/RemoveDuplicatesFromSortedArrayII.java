package tw.tsunglin.leetcode1119;

public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		int prev = 0;
		int counter = 1;
		
		for (int curr=1; curr<nums.length; curr++) {
			if(nums[prev] == nums[curr]) {
				counter++;
				if(counter > 2) {
					continue;
				}
				else {
					prev++;
					nums[prev] = nums[curr];
				}
			}else {
				counter = 1;
				prev++;
				nums[prev] = nums[curr];
			}
		}
		return prev+1;
	}
}
