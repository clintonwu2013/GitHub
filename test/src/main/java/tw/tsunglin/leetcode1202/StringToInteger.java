package tw.tsunglin.leetcode1202;

import java.util.HashMap;
import java.util.Map;

public class StringToInteger {
	public int myAtoi(String str) {
		if(str == null || "".equals(str.trim())) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('0', 0);
		map.put('1', 1);
		map.put('2', 2);
		map.put('3', 3);
		map.put('4', 4);
		map.put('5', 5);
		map.put('6', 6);
		map.put('7', 7);
		map.put('8', 8);
		map.put('9', 9);

		long sum = 0;
		char[] charArray = str.trim().toCharArray();
		char firstChar = charArray[0];

		if (firstChar != '-' || firstChar == '+') {
			int start = 0;
            if(firstChar == '+'){
                start = 1;
            }
			for (int i = start; i < charArray.length; i++) {
				char c = charArray[i];

				if (c <= '9' && c >= '0') {
					int tmp = map.get(c);
					
					sum = sum * 10 + tmp;
					if (sum > 2147483647) {
						return Integer.MAX_VALUE;
					}

				} else {
					return (int)sum;
				}
			}
		} else if (firstChar == '-') {
			for (int i = 1; i < charArray.length; i++) {
				char c = charArray[i];

				if (c <= '9' && c >= '0') {
					int tmp = map.get(c);
					sum = sum * 10 - tmp;
					if (sum < -2147483648) {
						return Integer.MIN_VALUE;
					}

				} else {
					return (int)sum;
				}
			}
		}

		return (int)sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
