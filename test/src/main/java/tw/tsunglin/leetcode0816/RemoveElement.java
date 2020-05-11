package tw.tsunglin.leetcode0816;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int ans = 0;
		for(int num: nums) {
			if(num!=val) {
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		RemoveElement removeElement = new RemoveElement();
		int ans = removeElement.removeElement(new int[]{0,1,2,2,3,0,4,2},2);
		
		System.out.println(ans);
	}
}
