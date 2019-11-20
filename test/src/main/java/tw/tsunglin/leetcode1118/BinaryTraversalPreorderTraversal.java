package tw.tsunglin.leetcode1118;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



public class BinaryTraversalPreorderTraversal {
	public List<Integer> preorderTraversal2(TreeNode root) {
		List<Integer> traversal = new ArrayList<Integer>();
        if(root == null) {
            return traversal;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            traversal.add(cur.val);
            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
            }
        }
        
        return traversal;

	}
	
	
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> traversal = new ArrayList<Integer>();
        if(root == null) {
            return traversal;
        }
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
        	TreeNode curr = stack.pop();
        	traversal.add(curr.val);
        	
        	if(curr.right != null) {
        		stack.push(curr.right);
        	}
        	if(curr.left != null) {
        		stack.push(curr.left);
        	}
        }
        
        return traversal;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
