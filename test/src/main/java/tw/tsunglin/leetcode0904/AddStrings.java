package tw.tsunglin.leetcode0904;

public class AddStrings {
	public String addStrings(String num1, String num2) {
		char[] c1 = num1.toCharArray();
		char[] c2 = num2.toCharArray();
		int len1 = c1.length;
		int tmp1 = 0;
		for(int i=0; i<c1.length; i++) {
			int idx = (int)(c1[i]-'0');
			tmp1 = (int) (tmp1 + idx*Math.pow(10, (len1-1)));
			len1--;
		}
		
		int len2 = c2.length;
		int tmp2 = 0;
		for(int i=0; i<c2.length; i++) {
			int idx = (int)(c2[i]-'0');
			tmp2 = (int) (tmp2 + idx*Math.pow(10, (len2-1)));
			len2--;
		}
		
		int ans = tmp1+tmp2;
		return ans+"";
	}

	public static void main(String[] args) {
		AddStrings test = new AddStrings();
		String ans = test.addStrings("89", "90");
		System.out.println(ans);
	}

}
