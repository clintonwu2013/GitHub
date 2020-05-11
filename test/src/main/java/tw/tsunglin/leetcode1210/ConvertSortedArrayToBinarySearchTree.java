package tw.tsunglin.leetcode1210;

public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length/2;
        if(nums.length==0) {
        	return null;
        }
        TreeNode root = new TreeNode(nums[nums.length/2]);
        root.left = sol(nums, 0, mid-1);
        root.right = sol(nums,mid+1, nums.length-1);
        return root;
    }
    
    public TreeNode sol(int[] nums, int low, int high){
        int mid = (low+high)/2;
        if(low==high){
            return new TreeNode(nums[low]);
        } else if(low>high) {
        	return null;
        }
            
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sol(nums, low, mid-1);
        root.right = sol(nums, mid+1, high);
        return root;
        
    }
}
