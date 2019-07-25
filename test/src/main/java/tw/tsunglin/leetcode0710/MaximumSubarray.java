package tw.tsunglin.leetcode0710;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int originalLength = nums.length; 
		int rs = nums[0];
		for(int i=0; i< originalLength; i++) {
			int test=nums[i];
			for(int j=i+1; j<nums.length; j++) {
				test = test+nums[j];
				if(test>rs) {
					rs=test;
				}			
			}
		}
		return rs;

	}

	public static void main(String[] args) {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		int[] array = {1,2,3,4,-1,-2,9};
		int ans = maximumSubarray.maxSubArray(array);
		System.out.println(ans);
	}

}
