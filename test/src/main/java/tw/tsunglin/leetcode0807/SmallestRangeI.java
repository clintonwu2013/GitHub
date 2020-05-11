package tw.tsunglin.leetcode0807;

public class SmallestRangeI {
	public static int smallestRangeI(int[] A, int K) {
		int min = A[0];
		int max = A[0];
		for(int i=0; i<A.length; i++) {
			if(A[i]<min) {
				min = A[i];
			}
			if(A[i]>max) {
				max = A[i];
			}
		}
		
		return Math.max(0, max-min-2*K);
	}

	public static void main(String[] args) {
		int[] A = {0,10};
		int K= 2;
		int ans = SmallestRangeI.smallestRangeI(A, K);
		System.out.println(ans);
	}

}
