package tw.tsunglin.leetcode1106;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(5, "V");
		map.put(10, "X");
		map.put(50, "L");
		map.put(100, "C");
		map.put(500, "D");
		map.put(1000, "M");
		
		int digit = num / 1000;
		num = num % 1000;
		
		for(int i=0; i< digit; i++) {
				sb.append(map.get(1000));
		}
		
		for(int i=2; i>0; i--) {
			digit = (int)(num/ Math.pow(10,i));
			num = (int)(num % Math.pow(10,i));
			
			if(digit != 4 && digit != 9) {
				if(digit >=5) {
					sb.append(map.get((int)(5* Math.pow(10, i))));
					digit = digit - 5;
					for(int j=0; j< digit; j++) {
						sb.append(map.get((int)(Math.pow(10, i))));
					}
					
				}else {
					for(int j=0; j< digit; j++) {
						sb.append(map.get((int)(Math.pow(10, i))));
					}
				}
			}else if (digit == 4) {
				sb.append(map.get((int)(Math.pow(10, i))) + map.get((int)(5* Math.pow(10, i))));
			}else if (digit == 9) {
				sb.append(map.get((int)(Math.pow(10, i))) + map.get((int)(10* Math.pow(10, i))));
			}
			
		}
		
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
