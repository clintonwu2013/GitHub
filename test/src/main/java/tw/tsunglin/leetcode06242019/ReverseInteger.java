package tw.tsunglin.leetcode06242019;

public class ReverseInteger {
	public static int reverse(int x) {
		int rev =0;
		while(x!=0) {
			int pop = x%10;
			rev = rev*10+pop;
			x=x/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverse(-786169));
	}

}
