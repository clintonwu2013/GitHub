package tw.tsunglin.leetcode1119;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C',100);
		map.put('D', 500);
		map.put('M', 1000);
		int sum = 0;
		char[] c = s.toCharArray();
		for(int i=0; i<c.length; i++) {
			
			if(i<(c.length-1) && c[i] == 'I' && c[i+1]=='V' ) {
				sum = sum + 4;
				i = i+1;
                continue;
			}else if(i<(c.length-1) && c[i] == 'I' && c[i+1]=='X') {
				sum = sum + 9;
				i = i+1;
                continue;
			}else if(i<(c.length-1) && c[i] == 'X' && c[i+1]=='L') {
				sum = sum + 40;
				i = i+1;
                continue;
			}
			else if(i<(c.length-1) && c[i] == 'X' && c[i+1]=='C') {
				sum = sum + 90;
				i = i+1;
                continue;
			}
			else if(i<(c.length-1) && c[i] == 'C' && c[i+1]=='D') {
				sum = sum + 400;
				i = i+1;
                continue;
			}
			else if(i<(c.length-1) && c[i] == 'C' && c[i+1]=='M') {
				sum = sum + 900;
				i = i+1;
                continue;
			}
			
			if(i < c.length) {
				sum = sum + map.get(c[i]);
			}
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int ans = RomanToInteger.romanToInt("MCMXCIV");
	}
}
