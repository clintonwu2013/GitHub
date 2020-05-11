package tw.tsunglin.leetcode0625;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String num = x+"";
		int index = num.length();
		boolean flag=false;
		for(int i=0; i<index; i++) {
			if(num.substring(i,i+1).equals(num.substring(index-1-i,index-i))) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if(flag) {
			return true;
		}else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {
		PalindromeNumber palNum = new PalindromeNumber();
		System.out.println(palNum.isPalindrome(1233321));

	}

}
