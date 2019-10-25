package tw.tsunglin.leetcode1025;

public class RemoveDuplicatesFromSortedArrayIIReview {
	public int removeDuplicates(int[] nums) {
		int target = 0;
		int currNum = -1;
		int count = 0;
		
		for(int num : nums) {
			if(num == currNum) {
				count++;
			}else {
				currNum = num;
				count = 1;
			}
			if(count < 3) {
				nums[target] = num;
				target++;
			}
		}
		return target;
	}
	public static void main(String[] args) {
		int[] nums = new int[] {0,0,0,1,1,1,2,2};
		RemoveDuplicatesFromSortedArrayII test = new RemoveDuplicatesFromSortedArrayII();
		int ans = test.removeDuplicates(nums);
		System.out.println(ans);

	}

}
