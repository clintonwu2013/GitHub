package tw.tsunglin.leetcode1007;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[0]^=nums[i];
        }
        
        return nums[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
