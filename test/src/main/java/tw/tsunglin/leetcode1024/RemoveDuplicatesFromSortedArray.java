package tw.tsunglin.leetcode1024;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int ans = 1;
		for(int i=0; i<nums.length-1; i++) {
			if( nums[i] != nums[i+1] ) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
		int ans = test.removeDuplicates(nums);
		
		System.out.println(ans);

	}

}
