package tw.tsunglin.leetcode0821;

public class MaximumSubarrayReview {
	public static int maxSubArray(int[] nums) {
        int runningTotal = 0;
        int largestSum = Integer.MIN_VALUE;
        for(int num: nums) {
        	runningTotal = runningTotal+num;
        	if(runningTotal>largestSum) {
        		largestSum = runningTotal; 
        	}
        	if(runningTotal<0) {
        		runningTotal=0;
        	}
        }
        
        return largestSum;
    }
    public static void main(String[] args) {
    	int[] nums = {-3,-2,-4,9,-1,8};
    	int ans = MaximumSubarrayReview.maxSubArray(nums);
    	System.out.println(ans);
	}
}
