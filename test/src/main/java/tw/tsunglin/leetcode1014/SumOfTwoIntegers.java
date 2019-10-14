package tw.tsunglin.leetcode1014;

public class SumOfTwoIntegers {
	public int getSum(int a, int b) {
		if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        
        return getSum(a^b,(a&b)<<1);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
