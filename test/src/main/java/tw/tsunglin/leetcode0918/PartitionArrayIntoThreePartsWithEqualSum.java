package tw.tsunglin.leetcode0918;

public class PartitionArrayIntoThreePartsWithEqualSum {
	public static boolean canThreePartsEqualSum(int[] A) {
		int sum = 0;
		int goal = 0;
		for(int i=0; i<A.length ; i++) {
			sum = sum + A[i];
		}
		if(sum%3 !=0) {
			return false;
		}else {
			goal = sum/3;
			sum=0;
		}
		
		int index = 0;
		for(int i=0; i<A.length; i++) {
			sum = sum+A[i];
			if(sum == goal) {
				sum = 0;
				index++;
			}
			
		}
		
		
		return (index == 3)?true:false;
	}

	public static void main(String[] args) {
		boolean ans = PartitionArrayIntoThreePartsWithEqualSum.canThreePartsEqualSum(new int[] {0,2,1,-6,6,7,9,-1,2,0,1});
		System.out.println(ans);
	}

}
