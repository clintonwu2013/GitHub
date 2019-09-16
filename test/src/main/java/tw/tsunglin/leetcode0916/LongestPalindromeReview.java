package tw.tsunglin.leetcode0916;

public class LongestPalindromeReview {
	public static int longestPalindrome(String s) {
		int[] count = new int[128];
		for(char c: s.toCharArray()) {
			count[c]++;
		}
		int ans = 0;
		
		for(int num: count) {
			ans = ans + (int)(num/2)*2;
		}
		
		if(ans < s.length()) {
			ans = ans + 1;
		}
		return ans;
		
	}
	public static void main(String[] args) {
		int ans = LongestPalindromeReview.longestPalindrome("abccccdd");
		System.out.println(ans);
	}

}
