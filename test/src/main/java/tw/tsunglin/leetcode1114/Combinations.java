package tw.tsunglin.leetcode1114;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> out = new ArrayList<Integer>();
		
		int curr = 1;
		DFS(res, out, n, k,curr);
		return res;
	}

	private void DFS(List<List<Integer>> res, List<Integer> out, int n, int k, int curr) {
		if(k<0 || n <0) {
			return;
		}
		if( k==0) {
			res.add(new ArrayList(out));
			return;
		}
		for(int i = curr; i<=n; i++) {
			out.add(i);
			DFS(res, out, n, k-1,i+1);
			out.remove(out.size()-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
