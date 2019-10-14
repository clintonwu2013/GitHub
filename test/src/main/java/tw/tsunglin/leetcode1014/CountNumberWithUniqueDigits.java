package tw.tsunglin.leetcode1014;

public class CountNumberWithUniqueDigits {
	public static int countNumbersWithUniqueDigits(int n) {
		int[] N = new int[n + 1];
		N[0] = 1;

		if (n == 0) {
			return N[0];
		}
			
		N[1] = 9;
		int count = 9;
		if (n > 10) {
			n = 10;
		}
		int sum = N[1];
		for (int i = 2; i < n + 1; i++) {
			N[i] = N[i - 1] * count;
			sum = sum + N[i];
			count--;
		}
		return sum + 1;
	}
	
	public int countNumbersWithUniqueDigits2(int n) {
		int[] N = new int[n + 1];
		
		N[0] = 1;
		if(n>10) {
			n = 10;
		}
		N[1] = 9;
		int count = 9;
		int sum = N[1];
		for(int i = 2; i<n+1; i++) {
			N[i] = N[i-1]*count;
			sum = sum +N[i];
			count --;
		}
		return sum + 1;
	}

	public static void main(String[] args) {
		int ans = CountNumberWithUniqueDigits.countNumbersWithUniqueDigits(3);
		System.out.println(ans);

	}

}
