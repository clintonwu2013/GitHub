package tw.tsunglin.leetcode1202;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		
		if("".equals(s)) {
			return true;
		}
		
		char[] charArray = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c: charArray) {
			if((c<='z'&&c>='a') || (c<='Z'&&c>='A') || (c<='9'&&c>='0')) {
				sb.append(Character.toLowerCase(c));
			}
		}
		String realString = sb.toString();
		System.out.println(realString);
		int head = 0;
		int tail = realString.length()-1;
		
		while(head<=tail) {
			if(realString.charAt(head) != realString.charAt(tail)) {
				return false;
			}
			head++;
			tail--;
		}
		return true;
	}

	public static void main(String[] args) {
		ValidPalindrome tmp = new ValidPalindrome();
		tmp.isPalindrome("0P");

	}

}
