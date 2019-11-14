package tw.tsunglin.leetcode1114;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> lists = new ArrayList<List<Integer>>();
		    lists.add(new ArrayList());
		    for (int k : nums){
		        int n = lists.size();
		        int i = 0;
		        //遍历已存在的集合, 不取k则表现为不改变原有的集合, 取k则表现为新建一个List将其加入到结果集当中
		        while (i < n){
		            List<Integer> list = lists.get(i++);
		            List<Integer> temp = new ArrayList(list);
		            temp.add(k);
		            lists.add(temp);
		        }
		    }
		    return lists;
    }
	private void DFS(List<List<Integer>> res, List<Integer> out, int[] nums, int start) {
		if(start == nums.length) {
			res.add(new ArrayList(out));
			return;
		}
		
		for(int i=start; i< nums.length; i++) {
			out.add(nums[i]);
			DFS(res, out, nums, i+1);
			
			out.remove(out.size()-1);
			DFS(res, out, nums, i+1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
