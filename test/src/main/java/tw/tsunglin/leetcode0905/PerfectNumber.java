package tw.tsunglin.leetcode0905;

public class PerfectNumber {
	public static boolean checkPerfectNumber(int num) {
		int sum = 0;
		for(int i=1; i<=num-1; i++) {
			if(num%i == 0) {
				sum = sum+ i;
			}
		}		
		return sum == num;
	}

	public static void main(String[] args) {
		boolean ans = PerfectNumber.checkPerfectNumber(27);
		System.out.println(ans);
	}

}
