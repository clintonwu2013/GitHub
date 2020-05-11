package tw.tsunglin.leetcode1031;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}

		String maxPalindrome = "";
		for (int i = 0; i < s.length(); i++) {
			String palindromeNumber = getPalindromeNumber(s, i, i);
			if(palindromeNumber.length() >= maxPalindrome.length()) {
				maxPalindrome = palindromeNumber;
			}
			palindromeNumber = getPalindromeNumber(s, i, i+1);
			if(palindromeNumber.length() >= maxPalindrome.length()) {
				maxPalindrome = palindromeNumber;
			}
		}

		return maxPalindrome;

	}

	private String getPalindromeNumber(String s, int head, int tail) {
		while (head >= 0 && (tail <= s.length()-1) && s.charAt(head) == s.charAt(tail)) {
			head--;
			tail++;
		}

		return s.substring(head, tail + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
