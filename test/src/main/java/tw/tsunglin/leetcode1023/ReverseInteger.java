package tw.tsunglin.leetcode1023;

public class ReverseInteger {
	public int reverse(int x) {
		char[] numberArray = String.valueOf(x).toCharArray();
		int idx = 0;
		int lastIdx = numberArray.length-1;
		
		for(int i =0; i<(numberArray.length-1)/2; i++) {
			char tmp = numberArray[idx];
			numberArray[idx] = numberArray[lastIdx];
			numberArray[lastIdx] = tmp;
			idx++;
			lastIdx--;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<numberArray.length; i++) {
			sb = sb.append(numberArray[i]);
		}
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int ans = ri.reverse(100);
		System.out.println(ans);
	}

}
