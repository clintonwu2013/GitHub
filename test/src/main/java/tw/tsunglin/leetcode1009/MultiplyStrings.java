package tw.tsunglin.leetcode1009;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
        if(num1.charAt(0) - '0' == 0 || num2.charAt(0) - '0' == 0) {
        	return "0";
        }
        
        int n = num1.length();
        int m = num2.length();
        int[] bits = new int[n + m];
        char[] dd = num1.toCharArray();
        char[] ss = num2.toCharArray();
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                int mul = (ss[i] - '0') * (dd[j] - '0');
                mul += bits[i + j + 1];
                
                bits[i + j + 1] = mul % 10;
                bits[i + j] += mul / 10;
            }
        }
        StringBuffer sb = new StringBuffer();
        int start = 0;
        while(start < n + m && bits[start] == 0){
            start++;
        }
        for(int i = start; i < n + m; i++){
            sb.append(bits[i]);
        }
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
