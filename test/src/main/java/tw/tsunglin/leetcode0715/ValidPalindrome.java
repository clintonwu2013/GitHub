package tw.tsunglin.leetcode0715;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		s=s.replaceAll("\\pP", "");
		s=s.replaceAll(" +", "");
		System.out.println(s);
		boolean ans=true;
		for(int i=0; i<s.length();i++) {
//			System.out.println(i);
//			System.out.println(s.substring(i,i+1).toUpperCase());
//			System.out.println(s.substring(s.length()-i-1,s.length()-i).toUpperCase());
			if(!s.substring(i,i+1).toUpperCase().equals(s.substring(s.length()-i-1,s.length()-i).toUpperCase())) {
				ans=false;
				break;
			}
		}
		
//		System.out.println(s);
		return ans;

	}

	public static void main(String[] args) {
		ValidPalindrome test = new ValidPalindrome();
		boolean ans = test.isPalindrome("race a car");
		
		System.out.println(ans);
	}
}
