package tw.tsunglin.leetcode1106;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	
	
	public static List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0) {
			return res;
		}
		Arrays.sort(nums);
		
		for(int k=0; k< nums.length; k++) {
			if(nums[k] > 0) {
				break;
			}
			if(k>0 && nums[k] == nums[k-1]) {
				continue;
			}
			int target = 0- nums[k];
			int i = k+1;
			int j = nums.length-1;
			
			while(i < j) {
				if(nums[i]+nums[j] == target) {
					List<Integer> tmp = new ArrayList<Integer>();
					tmp.add(nums[k]);
					tmp.add(nums[i]);
					tmp.add(nums[j]);
					res.add(tmp);
					
					while (i < j && nums[i] == nums[i + 1]) {
						++i;
					}
                    while (i < j && nums[j] == nums[j - 1]) {
                    	--j;
                    }
                    ++i; 
                    --j;
				}else if (nums[i] + nums[j] < target) {
					++i;
				}else {
					--j;
				}
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		List<List<Integer>> ans = ThreeSum.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		System.out.println(ans);

	}

}
