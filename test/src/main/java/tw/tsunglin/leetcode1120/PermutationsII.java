package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums == null || nums.length == 0) {
			return new ArrayList<List<Integer>>();
		}
		Arrays.sort(nums);
		permuteRecursive(nums, result, new ArrayList<Integer>(), new ArrayList<Integer>());
		return result;

	}

	private void permuteRecursive(int[] nums, List<List<Integer>> result, List<Integer> usedIndex,
			List<Integer> usedNums) {
		if (usedIndex.size() == nums.length) {
			List<Integer> temp = new ArrayList<Integer>(usedNums);
			result.add(temp);
			return;
		}
		int removed = -999999;
		for (int index = 0; index < nums.length; index++) {
			if (removed == nums[index]) {
				continue;
			}
			if (!usedIndex.contains(index)) {
				usedIndex.add(index);
				usedNums.add(nums[index]);
				permuteRecursive(nums, result, usedIndex, usedNums);
				usedIndex.remove(usedIndex.size() - 1);
				removed = usedNums.remove(usedNums.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
