package tw.tsunglin.leetcode0625;

public class StrStr {
	public static int strStr(String haystack, String needle) {
		for(int i=0; i<haystack.length();i++) {
//			System.out.println("i="+i);
			for(int j=i+1; j<=haystack.length(); j++) {
//				System.out.println("j="+j);
				if(haystack.substring(i,j).equals(needle)) {
					return i;
				}
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		System.out.println(StrStr.strStr("hekkllo", "kll"));
	}
}
