package tw.tsunglin.leetcode1120;

public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
		int needleLength = needle.length();
		
		
		for(int i=0; i<haystack.length()-needleLength+1; i++) {
			if(needle.equals(haystack.substring(i, i+needle.length()))) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
