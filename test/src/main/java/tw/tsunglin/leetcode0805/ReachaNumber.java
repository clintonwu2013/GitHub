package tw.tsunglin.leetcode0805;

public class ReachaNumber {
	public int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while(target>0) {
        	target = target - ++k;
        }
        if(target==0) {
        	return k;
        }else {
        	return k+1+k%2;
        }
        
    }

	public static void main(String[] args) {
		ReachaNumber ReachaNumber =new ReachaNumber();
		int ans = ReachaNumber.reachNumber(2);
		System.out.println(ans);
	}

}
