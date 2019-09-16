package tw.tsunglin.leetcode0916;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequenceReview {
	public int findLHS(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = Integer.MIN_VALUE;
		for(int num: nums) {
			map.put(num,map.getOrDefault(num, 0)+1);
		}
		for(int key: map.keySet()) {
			if(map.containsKey(key+1)) {
				res = Math.max(res, map.get(key)+map.get(key+1));
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
