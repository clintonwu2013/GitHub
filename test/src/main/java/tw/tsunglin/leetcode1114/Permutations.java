package tw.tsunglin.leetcode1114;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		int[] visited = new int[nums.length];
		permuteDFS(nums, res, out, visited);
		return res;
	}
	
	private void permuteDFS(int[] nums, List<List<Integer>> res, List<Integer> out,  int[] visited) {
		if( out.size() == nums.length) {
			res.add(new ArrayList(out));
			return;
		}
		for( int i = 0; i<nums.length; i++) {
			if(visited[i] == 1) {
				continue;
			}
			visited[i] = 1;
			out.add(nums[i]);
			permuteDFS(nums, res, out, visited);
			visited[i] = 0;
			out.remove(out.size()-1);
		}
		
	}

	public static void main(String[] args) {
		
	}

}
