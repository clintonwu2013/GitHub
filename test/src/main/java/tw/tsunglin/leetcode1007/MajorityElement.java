package tw.tsunglin.leetcode1007;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int majorityNum = nums.length/2;
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int num: nums) {
			if(map.get(num) >= majorityNum) {
				return num;
			}
		}
		
		return 1;
	}

	public static void main(String[] args) {
		int ans = MajorityElement.majorityElement(new int[] {1,1,1,2});
		System.out.println(ans);
	}

}
