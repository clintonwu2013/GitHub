package tw.tsunglin.leetcode1030;

public class LongestPalindromicSubstring {
	public  String longestPalindrome(String s) {
        if (s.length() <= 1) {
        	return s;
        }

        String maxPalindrome = "";
        for (int i = 0; i < s.length()-1; i ++) {
            String palindrome = getLongestPalindrome(s, i, i);
            if (maxPalindrome.length() < palindrome.length()) {
            	maxPalindrome = palindrome;// 如果是奇数回文
            }
            palindrome = getLongestPalindrome(s, i, i+ 1); // 如果是偶数回文
            if (maxPalindrome.length() < palindrome.length()) {
            	maxPalindrome = palindrome;
            }
        }
        return maxPalindrome;
    }

    private  String getLongestPalindrome(String s, int low, int high) {
        while (low >= 0 && (high <= s.length() - 1) && s.charAt(low) == s.charAt(high)) {
                low --;
                high ++;
        }
        return s.substring(low+1, high);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
