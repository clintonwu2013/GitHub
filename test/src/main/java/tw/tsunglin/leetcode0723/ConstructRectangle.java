package tw.tsunglin.leetcode0723;

public class ConstructRectangle {
	public int[] constructRectangle(int area) {
		int r=0;
		for(int i=1; i*i<=area; i++) {
			if(area%i==0) {
				r=i;
			}
		}
		int[] ans = {area/r, r};
		return ans;

	}

	public static void main(String[] args) {
		ConstructRectangle constructRectangle = new ConstructRectangle();
		int[] ans = constructRectangle.constructRectangle(83);
		
		
		System.out.println(ans[0]);
	}

}
