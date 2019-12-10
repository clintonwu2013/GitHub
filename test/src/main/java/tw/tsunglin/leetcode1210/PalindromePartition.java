package tw.tsunglin.leetcode1210;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
	private List<List<String>> res;

	public List<List<String>> partition(String s) {
		res = new ArrayList<List<String>>();
		helper(new ArrayList<String>(), s, 0);
		return res;
	}

	private void helper(List<String> list, String s, int index) {
		if (index == s.length()) {
			res.add(new ArrayList<String>(list));
			return;
		}
		for (int i = index; i < s.length(); i++) {
			if (check(s, index, i)) {
				list.add(s.substring(index, i + 1));
				helper(list, s, i + 1);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean check(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--))
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
