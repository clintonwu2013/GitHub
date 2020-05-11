package tw.tsunglin.leetcode0906;

public class FlipAnImge {
	public int[][] flipAndInvertImage(int[][] A) {
		
		for(int i=0; i <A.length; i++) {
			for(int j=0; j<(int)(A[i].length/2); j++) {
				
				//基數!
				if(A[i][j] == 0) {
					A[i][j] =1;
				}else {
					A[i][j] =0;
				}
				if(A[i][A[i].length-j-1] ==0) {
					A[i][A[i].length-j-1] =1;
				}else {
					A[i][A[i].length-j-1] =0;
				}
				
				int tmp = A[i][j];
				A[i][j] = A[i][A[i].length-j-1];
				A[i][A[i].length-j-1] = tmp;
				
			}
			
		}
		
//		for(int i=0; i <A.length; i++) {
//			for(int j=0; j<A[i].length; j++) {
//				if(A[i][j] == 0) {
//					A[i][j] =1;
//				}else {
//					A[i][j] =0;
//				}
//				
//			}
//			
//		}
		
		return A;
    }
	public static void main(String[] args) {
		FlipAnImge test = new FlipAnImge();
		int[][] ans = test.flipAndInvertImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}});
		for(int i =0; i<ans.length; i++) {
			for(int j=0; j<ans[i].length; j++) {
				System.out.print(ans[i][j]);
			}
			
		}
	}
}
