package tw.tsunglin.leetcode0711;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int numOfDiff = 1;
		for(int i=0;i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1] ) {
//				nums[i]=nums[i+1];
				numOfDiff++;
			}
		}
		return numOfDiff;
		
	}

	public static void main(String[] args) {
		RemoveDuplicates test = new RemoveDuplicates();
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int ans = test.removeDuplicates(nums);
		
		System.out.println(ans);
	}

}
