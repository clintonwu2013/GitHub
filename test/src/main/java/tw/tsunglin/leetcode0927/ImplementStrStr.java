package tw.tsunglin.leetcode0927;

public class ImplementStrStr {
	public static int strStr(String haystack, String needle) {
		int size = needle.length();
		for(int i=0; i< haystack.length()-size; i++) {
			if(needle.equals(haystack.substring(i, i+size))) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int ans = ImplementStrStr.strStr("hello", "ll");
		System.out.println(ans);

	}

}
