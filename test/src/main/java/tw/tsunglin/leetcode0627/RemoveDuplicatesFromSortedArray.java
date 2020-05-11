package tw.tsunglin.leetcode0627;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
	    int i = 0;
	    for(int j=1; j<nums.length; j++) {
	    	if(nums[i] != nums[j]) {
	    		i++;
	    		nums[i]=nums[j];
	    		
	    	}
	    }
	    return i+1;
		

	}

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = 
				new  RemoveDuplicatesFromSortedArray();
		int[] test = {1,1,2,3,3};
		
		System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(test));
	}

}
