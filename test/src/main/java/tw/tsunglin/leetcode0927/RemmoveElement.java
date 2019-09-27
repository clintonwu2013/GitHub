package tw.tsunglin.leetcode0927;

public class RemmoveElement {
	public static int removeElement(int[] nums, int val) {
		int numsLength = nums.length;
		int[] ans = new int[numsLength];
		int idx = 0;
		for(int num: nums) {
			if(num != val) {
				ans[idx] = num;
				idx++;
			}
		}
		int idx2=0;
		for(int a:ans) {
			nums[idx2] = a;
			idx2 ++;
		}
		
		return idx;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		int ans = RemmoveElement.removeElement(nums, val);
		
		System.out.println("ans = " + ans);
		for(int num: nums) {
			System.out.println(num);
		}

	}

}
