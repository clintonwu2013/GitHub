package tw.tsunglin.leetcode0807;

public class SortArrayByParity {
	
	public static int[] sortArrayByParity(int[] A) {
		int length =A.length;
		int[] ans = new int[length];
		
		int countFromFront = 0;
		int countFromEnd = length-1;
		for(int i=0;i<length;i++) {
			if(A[i]%2==0) {
				ans[countFromFront]=A[i];
				countFromFront++;
			}else {
				ans[countFromEnd]=A[i];
				countFromEnd--;
			}
			 
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] A = {3,1,2,4};
		int[] ans = SortArrayByParity.sortArrayByParity(A);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
