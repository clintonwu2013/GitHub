package tw.tsunglin.leetcode1210;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		int min =Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		for(int i=0; i<intervals.length; i++) {
			min = Math.min(min, intervals[i][0]);
			max = Math.max(max, intervals[i][0]);
		}
		int[][] ans = new int[][] {{min,max}};
		return ans;
	}
}
