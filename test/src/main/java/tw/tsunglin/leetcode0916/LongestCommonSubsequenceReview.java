package tw.tsunglin.leetcode0916;

public class LongestCommonSubsequenceReview {
	public static int longestCommonSubsequence(String text1, String text2) {
		int m = text1.length();
		int n = text2.length();
		
		char arr1[] = text1.toCharArray();
		char arr2[] = text2.toCharArray();
		
		int[][] dp = new int[m+1][n+1];
		
		for(int i = 1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(arr1[i-1] == arr2[j-1]) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[m][n];
	}
	public static void main(String[] args) {
		int ans = LongestCommonSubsequenceReview.longestCommonSubsequence("abcde", "ace");
		System.out.println(ans);
	}

}
