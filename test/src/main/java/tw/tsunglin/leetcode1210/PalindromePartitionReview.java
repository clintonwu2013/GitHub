package tw.tsunglin.leetcode1210;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitionReview {
	public List<List<String>> partition(String s) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> list = new ArrayList<String>();
		DFS(res, list, s, 0);
		return res;
	}
	private void DFS(List<List<String>> res, List<String> list, String s, int index) {
		if(index == s.length()) {
			res.add(new ArrayList<String>(list));
            return;
		}
		for(int i =index; i<s.length();i++ ) {
			if(check(s, index,i)) {
				list.add(s.substring(index, i+1));
				DFS( res,  list,  s, i+1);
				list.remove(list.size()-1);
			}
		}
		
		
	}
	private boolean check(String s, int index, int i) {
		int head = index;
		int tail = i;
		while(head<tail) {
			if(s.charAt(head)!= s.charAt(tail)) {
				return false;
			}
			head++;
			tail--;
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
