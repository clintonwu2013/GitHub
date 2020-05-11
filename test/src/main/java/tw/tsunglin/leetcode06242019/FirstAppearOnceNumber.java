package tw.tsunglin.leetcode06242019;

public class FirstAppearOnceNumber {
	public static char firstAppearOnce(String s) {
		
		for(int j=0; j<s.length(); j++) {
			int times = 0;
			char c = s.charAt(j);
			
			for(int i=0; i<s.length(); i++) {
				
				if(c == s.charAt(i)) {
					times = times+1;
				}
			}
			
			if(times==1) {
				return c;
			}
		}
		
		return '?';
		
	}
	public static void main(String[] args) {
		char i =FirstAppearOnceNumber.firstAppearOnce("jkhhkjopqopq");
		System.out.println(i);
	}

}
