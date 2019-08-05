package tw.tsunglin.leetcode0805;

public class FindPivotIndex {
	public int pivotIndex(int[] nums) {
		int ans = -1;
		int sum = 0;
		int leftSum = 0;
		for(int i=0; i<nums.length; i++) {
			sum = sum + nums[i];
		}
		for(int j =0; j<nums.length-1; j++) {
			leftSum = leftSum+ nums[j];
			if(leftSum == (sum-leftSum-nums[j+1])) {
				ans = j+1;
				break;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		FindPivotIndex findPivotIndex = new FindPivotIndex();
		int[] nums = {1, 7, 3, 6, 5, 6};
		int ans = findPivotIndex.pivotIndex(nums);
		
		System.out.println(ans);

	}

}
