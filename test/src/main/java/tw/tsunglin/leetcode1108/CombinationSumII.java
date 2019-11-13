package tw.tsunglin.leetcode1108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result =  new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		Arrays.sort(candidates);
		DFS(candidates, result, out, 0, target);
		return result;
	}

	private void DFS(int[] candidates, List<List<Integer>> result, List<Integer> out, 
			int start, int target) {
		if(target< 0) {
			return;
		}
		if(target == 0) {
			result.add(new ArrayList<Integer>(out));
			return;
		}
		for(int i=start; i< candidates.length; i++ ) {
			if (i > start && candidates[i] == candidates[i - 1]) {
				continue;
			}
			out.add(candidates[i]);
			DFS(candidates, result, out, i+1, target-candidates[i]);
			out.remove(out.size()-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
