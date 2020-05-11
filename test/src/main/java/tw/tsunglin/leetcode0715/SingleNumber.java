package tw.tsunglin.leetcode0715;


public class SingleNumber {
	public int singleNumber1(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			boolean ans=true;
			for(int j=0; j<nums.length;j++) {
//				System.out.println(j);
				if(i==j) {
					continue;
				}
				if(nums[i]==nums[j]) {
					ans=false;
					break;
				}
			}
			
			if(ans) {
				return nums[i];
			}
		}
		return -78;

	}
	
	
	public int singleNumber(int[] nums) {
		int ans = nums[0]; 
		for(int i=1; i<nums.length; i++) {
			ans = ans ^ nums[i];
		}
		return ans;

	}

	public static void main(String[] args) {
		SingleNumber test = new SingleNumber();
		int[] nums = {77,4,4,7,6,11,11,7,6,77,88};
		int ans = test.singleNumber(nums);
		
		System.out.println(ans);
	}

}
