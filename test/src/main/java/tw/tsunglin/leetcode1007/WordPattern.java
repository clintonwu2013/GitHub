package tw.tsunglin.leetcode1007;

import java.util.HashSet;
import java.util.Set;

public class WordPattern {
	

	public boolean wordPattern(String pattern, String str) {
		String[] hash = new String[26];
		String[] s = str.split(" ");

		if (s.length != pattern.length()) 
		{
			return false;
		}

		for (int i = 0; i < pattern.length(); i++) 
		{
			if (hash[pattern.charAt(i) - 'a'] == null || "".equals(hash[pattern.charAt(i) - 'a'])) 
			{
				hash[pattern.charAt(i) - 'a'] = s[i];
			} 
			else 
			{
				String val = hash[pattern.charAt(i) - 'a'];
				if (val != s[i]) 
				{
					return false;
				}
			}
		}

		HashSet<String> set = new HashSet<String>();

		for (String ss : hash) 
		{
			if (ss != null || !"".equals(ss)) 
			{
				if (set.contains(ss)) 
				{
					return false;
				}
				set.add(ss);
			}
		}

		return true;
	}
	
	

	public static void main(String[] args) {

	}

}
