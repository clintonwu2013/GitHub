package tw.tsunglin.leetcode0806;

public class SumOfEvenNumbersAfterQueries {
	public static int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int[] ans = new int[A.length];
		for(int i=0; i<queries.length;i++) {
			A[queries[i][1]] = A[queries[i][1]]+queries[i][0];
			for(int j=0; j<A.length; j++) {
				if(A[j]%2 ==0) {
					ans[i] = ans[i]+A[j];
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		SumOfEvenNumbersAfterQueries sumOfEvenNumbersAfterQueries = new SumOfEvenNumbersAfterQueries();
		int[] ans = sumOfEvenNumbersAfterQueries.sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][] {{1,0},{-3,1},{-4,0},{2,3}});
		for(int i=0; i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		
	}

}
