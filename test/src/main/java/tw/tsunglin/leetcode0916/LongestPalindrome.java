package tw.tsunglin.leetcode0916;

public class LongestPalindrome {
	 public int longestPalindrome(String s) {
	        int[] count = new int[128];
	        for (char c: s.toCharArray()) {
	        	count[c]++;
	        }

	        int ans = 0;
	        for (int v: count) {
	            ans += (int)(v / 2) * 2;
	        }
	        if (ans != s.length()) {
	        	ans++;
	        }
	           
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
