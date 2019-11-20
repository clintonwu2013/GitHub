package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutatuionsIIReview {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		int[] visited = new int[nums.length];
		Arrays.sort(nums);

		DFS(nums, res, out, 0, visited);
		return res;
	}

	private void DFS(int[] nums, List<List<Integer>> res, List<Integer> out, int start, int[] visited) {
		if (out.size() == nums.length) {
			res.add(new ArrayList<Integer>(out));
			return;
		}
		int removed = -9999999;
		for (int i = 0; i < nums.length; i++) {
			if (removed == nums[i]) {
				continue;
			}
			if (visited[i] == 1) {
				continue;
			}
			visited[i] = 1;
			out.add(nums[i]);
			DFS(nums, res, out, i + 1, visited);
			visited[i] = 0;
			removed = out.remove(out.size() - 1);
		}
	}
}
