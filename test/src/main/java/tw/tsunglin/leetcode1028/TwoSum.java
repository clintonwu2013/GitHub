package tw.tsunglin.leetcode1028;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i< nums.length; i++) {
			map.put(nums[i], i);
			
		}
		for(int i = 0; i<nums.length; i++) {
			int searchNum = target - nums[i];
			if(map.containsKey(searchNum) && i != map.get(searchNum)) {
				int j = map.get(searchNum);
				return new int[] {i, j};
			}
		}
		return null;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
