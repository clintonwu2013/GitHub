package tw.tsunglin.leetcode0716;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindPrimeFactors {
	
	public Set<Integer> findPrimeFactors(int num){
//		List<Integer> factors = new ArrayList<Integer>();
		Set<Integer> factors = new HashSet<Integer>();
		int copyOfNumber = num;
		
		for(int i=2; i<=copyOfNumber;i++) {
			if(num%i==0) {
				factors.add(i);
				copyOfNumber = copyOfNumber/i;
				num = num/i;
				i--;
			}
		}
		
		
		return factors;
		
	}
	public static void main(String[] args) {
		 FindPrimeFactors test = new FindPrimeFactors();
		 
		  Set<Integer> ans = test.findPrimeFactors(20);
		 
		 System.out.println(ans);

	}

}
