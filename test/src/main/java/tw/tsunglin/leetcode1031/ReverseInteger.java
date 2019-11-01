package tw.tsunglin.leetcode1031;

import java.util.Stack;

public class ReverseInteger {
	public static int reverse(int x) {
		
		int ans = 0;
		while(x != 0) {
			int tmp = x % 10;
			ans = ans*10 + tmp;
			
			x = x/10;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int ans = ReverseInteger.reverse(123);
		System.out.println(ans);
	}

}
