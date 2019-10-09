package tw.tsunglin.leetcode1009;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
	public static int[]  intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		int[] ans = new int[nums1.length];
		
		for(int num1 : nums1) {
			set1.add(num1);
		}
		for(int num2 : nums2) {
			set2.add(num2);
		}
		
		int idx = 0;
		for(int i : set1) {
			if(set2.contains(i)) {
				ans[idx] = i;
				idx++;
			}
			
		}
		return Arrays.copyOf(ans, idx);
	}

	public static void main(String[] args) {
		int[] ans = IntersectionOf2Arrays.intersection(new int[] {1,2,3,6}, new int[] {1,2,2,6});
		
		for(int a: ans) {
			System.out.println(a);
		}
	}

}
