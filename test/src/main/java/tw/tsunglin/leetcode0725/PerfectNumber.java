package tw.tsunglin.leetcode0725;

public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
    	int sum = 0;
    	for(int i=1; i<num; i++) {
    		if(num%i==0) {
    			sum=sum+i;
    		}
    	}
    	if(num==sum) {
    		return true;
    	}
		return false;
        
    }
	public static void main(String[] args) {
		boolean ans = PerfectNumber.checkPerfectNumber(28);
		System.out.println(ans);

	}

}
