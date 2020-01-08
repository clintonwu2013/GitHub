package tw.tsunglin.leetcode0108;

import java.util.HashMap;

public class SingleNumber {

	public int singleNumber(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for (int num: nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(int key:map.keySet()) {
			int val = map.get(key);
			if(val >= 2) {
				return key;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
