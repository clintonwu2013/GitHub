package tw.tsunglin.leetcode0802;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SelfDividingNumbers {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> selfDividingNums = new ArrayList<Integer>();
		for(int i=left; i<=right; i++) {
			
			String sNum = i+"";
			boolean flag=true;
			
			for(int j=0; j<sNum.length(); j++) {
				int divisor = Integer.valueOf(sNum.substring(j, j+1));
				
				if(divisor == 0 || i % divisor != 0 ) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				selfDividingNums.add(i);
			}
			
		}
		return selfDividingNums;

	}

	public static void main(String[] args) {
		List<Integer> ans = SelfDividingNumbers.selfDividingNumbers(1, 22);
		System.out.println(ans);

	}

}
