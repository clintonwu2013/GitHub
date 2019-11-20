package tw.tsunglin.leetcode1118;

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		int prev = 0;
		int counter =1;
		for(int curr=1; curr<nums.length; curr++) {
			if(nums[prev]==nums[curr]) {
				if(++counter > 2) {
					continue;
				}else {
					nums[++prev] = nums[curr];
				}
			}else {
				counter = 1;
				nums[++prev] = nums[curr];
			}
		}
		
		return prev+1;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,2,2,3};
		RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
