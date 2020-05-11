package tw.tsunglin.leetcode1119;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		String out = "";
		DFS(res,out, n, n);
		return res;
	}

	private void DFS(List<String> res, String out, int left, int right) {
		if( left ==0 && right ==0) {
			res.add(out);
			return;
		}
		
		if(left >0) {
			DFS(res, out+"(", left-1, right);
		}
		
		if(right >0 && left<right) {
			DFS(res, out+")", left, right-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
