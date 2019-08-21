package tw.tsunglin.leetcode0819;

import java.util.Arrays;

public class MovingStonesUntilConsecutive {
	public static int[] numMovesStones(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		Arrays.sort(array);
		
		int[] ans = new int[2];
		
		if(array[2]-array[1]==2 || array[1]-array[0]==2) {
			ans[0]=1;
			ans[1] = array[2]-array[0]-2;
		}else if(array[2]-array[1]==1 && array[1]-array[0]==1) {
			ans[0]=0;
			ans[1]=0;
		}else if(array[2]-array[1]==1 || array[1]-array[0]==1) {
			ans[0]=1;
			ans[1]=array[2]-array[0]-2;
		}else {
			ans[0]=2;
			ans[1]=array[2]-array[0]-2;
		}
		return ans;
        
    }
	public static void main(String[] args) {
		int[] ans = MovingStonesUntilConsecutive.numMovesStones(1,2,5);
		System.out.println(ans[0]);
		System.out.println(ans[1]);

	}

}
