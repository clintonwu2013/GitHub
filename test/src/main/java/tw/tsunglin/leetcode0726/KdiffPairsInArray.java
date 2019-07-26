package tw.tsunglin.leetcode0726;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KdiffPairsInArray {
	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		
		int count=0;
		
		for(int i =0; i<nums.length;i++) {
			for(int j =i+1; j<nums.length;j++) {
				if(nums[j]-nums[i]==k) {
					count++;
					break;
				}
			}
			while(i<nums.length-1 && nums[i] == nums[i+1]) {
				 i++;
			}
	                
			
		}
		
		return count;

	}

	public static void main(String[] args) {
		KdiffPairsInArray kdiffPairsInArray =new KdiffPairsInArray();
		int[] nums = {1, 3, 1, 5, 4};
		int k = 0;
		int ans = kdiffPairsInArray.findPairs(nums,k);
		System.out.println(ans);
	}

}
