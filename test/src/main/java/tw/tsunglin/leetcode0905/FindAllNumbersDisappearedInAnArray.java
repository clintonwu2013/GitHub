package tw.tsunglin.leetcode0905;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		int size = nums.length;
		int[] record = new int[size];
		List<Integer> ans = new ArrayList<Integer>();
		for(int num: nums) {
			record[num-1]++;
		}
		for(int i = 0; i<size; i++) {
			if(record[i] == 0) {
				ans.add(i+1);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		 List<Integer> ans = FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		 System.out.println(ans);
	}

}
