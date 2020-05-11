package tw.tsunglin.leetcode1107;

import java.util.ArrayList;
import java.util.List;

import tw.tsunglin.leetcode0627.CombinationSum;

public class CombinationSumReview {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		dfs3Sum(candidates, 0 ,target, list, result);
        return result;
	}

	private void dfs3Sum(int[] candidates, int start, int target, List<Integer> list, List<List<Integer>> result) {
		if(target < 0) {
			return;
		}
		if(target == 0) {
			System.out.println(list);
			ArrayList<Integer> tmp = new ArrayList<Integer>(list);
			System.out.println(tmp );
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for(int i =start; i< candidates.length; i++) {
			list.add(candidates[i]);
			dfs3Sum(candidates, i, target - candidates[i], list,result);
			list.remove(list.size()-1);
		}
	}

	

	public static void main(String[] args) {
		CombinationSumReview  combinationSum = new CombinationSumReview();
		int[] candidates = {2,3};
		List<List<Integer>> rs = combinationSum.combinationSum(candidates, 7);
		System.out.println("rs="+rs);
	}

}
