package tw.tsunglin.leetcode1113;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		if( numRows == 1) {
			return s;
		}
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<numRows; i++) {
			for(int j=i;j<s.length();  ) {
				sb.append(c[j]);
				j = j+ numRows + numRows -2;
				
				if( i==0 || i==numRows-1) {
					continue;
				}
				
				j = j-i-i;
				
				if(j>=s.length()) {
					break;
				}
				sb.append(c[j]);
				
				j = j+i+i;
			}
			
			
			
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
