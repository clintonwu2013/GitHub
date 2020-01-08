package tw.tsunglin.leetcode1210;



public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		int num1Length= num1.length();
        int num2Length= num2.length();
        int[] result= new int[num1Length+num2Length];
		
		
		for(int i= num1.length()-1; i>=0; i--) {
			for(int j=num2.length()-1; j>=0; j--) {
				int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int carryPosition = i+j;
                int valuePosition = i+j+1; 
                int valueSum= product + result[valuePosition];
                result[valuePosition] = valueSum%10;
                result[carryPosition] = result[carryPosition] + valueSum / 10;	
			}
		}
		StringBuilder strb = new StringBuilder();
        int x = 0;
        for (; x < result.length; x++) {
            if (result[x] > 0)
                break;
        }
        for (; x < result.length; x++) {
            strb.append(result[x]);
        }
        if(strb.toString().equals("")){
            return "0";
        }
        return strb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
