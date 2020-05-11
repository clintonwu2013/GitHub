package tw.tsunglin.leetcode1001;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		int[] tmp = new int[nums.length];
		for(int i=nums.length-k; i<nums.length;i++) {
			tmp[i - (nums.length-k)] = nums[i];
		}
		for(int i=0; i< nums.length-k; i++) {
			tmp[k+i] = nums[i];
		}
		
		for(int i =0; i<tmp.length ;i++) {
			nums[i] = tmp[i];
		}
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		RotateArray.rotate(nums, k);
		
		for(int i = 0 ;i< nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
