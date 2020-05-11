package tw.tsunglin.leetcode1007;


import java.util.HashSet;
import java.util.Set;

public class WordPatternReview {
	public static boolean wordPattern(String pattern, String str) {

		String[] hash = new String[26];
		String[] s = str.split(" ");
		
		if(pattern.length() != s.length) {
			return false;
		}
		
		for (int i = 0; i < pattern.length(); i++) {
			if (hash[pattern.charAt(i) - 'a'] == null || "".equals(hash[pattern.charAt(i) - 'a'])) {
				hash[pattern.charAt(i) - 'a'] = s[i];
			} else {
				String val = hash[pattern.charAt(i) - 'a'];
				if (!val.equals(s[i])) {
					return false;
				}
			}
		}
		
		Set<String> set = new HashSet<String>();
		
		for(String ss: hash) {
			if(ss != null && !"".equals(ss)) {
				if(set.contains(ss)) {
					return false;
				}
				set.add(ss);
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat fish";
		
		boolean ans = WordPatternReview.wordPattern(pattern, str);
		
		System.out.println(ans);

	}

}
