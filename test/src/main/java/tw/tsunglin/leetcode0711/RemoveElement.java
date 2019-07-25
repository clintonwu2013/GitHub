package tw.tsunglin.leetcode0711;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
    	int ans=0;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i] != val) {
    			ans++;
    		}
    	}
		return ans;
        
    }
	public static void main(String[] args) {
		RemoveElement test = new RemoveElement();
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int ans = test.removeElement(nums, 2);
		
		System.out.println(ans);
	}
}
