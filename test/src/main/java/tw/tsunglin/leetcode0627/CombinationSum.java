package tw.tsunglin.leetcode0627;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		CombinationSum combinationSum = new CombinationSum();
		int[] candidates = {2,3};
		List<List<Integer>> rs = combinationSum.combinationSum(candidates, 7);
		for(int i=0;i<rs.size();i++) {
			System.out.println(rs.get(i));
		}
	}

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    List<Integer> temp = new ArrayList<Integer>();
	    helper(candidates, 0, target, 0, temp, result);
	    return result;
	}
	 
	private void helper(int[] candidates, int start, int target, int sum,
	                    List<Integer> list, List<List<Integer>> result){
	    if(sum>target) {
	    	return;
	    }
	    if(sum==target) {
	    	result.add(new ArrayList<Integer>(list));
	    	return;
	    }
	    
	    for(int i=start; i<candidates.length ; i++) {
	    	list.add(candidates[i]);
	    	helper(candidates, i, target, sum+candidates[i], list, result);
	    	list.remove(list.size()-1);
	    }
	}
}
