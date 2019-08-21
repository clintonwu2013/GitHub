package tw.tsunglin.leetcode0821;

import java.util.Arrays;

public class HeightChecker {
	public int heightChecker(int[] heights) {
		int[] temp = new int[heights.length];
		for(int i =0; i< heights.length; i++) {
			 temp[i]= heights[i];
		}
		
		Arrays.sort(heights);
		int ans = 0;
		for(int i=0; i<heights.length; i++) {
			if(temp[i]!=heights[i]) {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		HeightChecker heightChecker = new HeightChecker();
		int[] heights = {1,1,4,2,1,3};
		int ans = heightChecker.heightChecker(heights);
		
		System.out.println(ans);

	}

}
