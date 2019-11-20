package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static List<Integer> sort(List<Integer> lst) {
		if (lst.size() < 2) {
			return lst;
		}
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		int mid = lst.size() / 2;

		for (int n = 0; n < mid; n++) {
			left.add(lst.get(n));
		}

		for (int n = mid; n < lst.size(); n++) {
			right.add(lst.get(n));
		}
		left = sort(left);
		right = sort(right);

		return merge(left, right);
	}

	private static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> tmp = new ArrayList<Integer>();

		while (left.size() > 0 && right.size() > 0) {
			if (left.get(0) <= right.get(0)) {
				tmp.add(left.get(0));
				left.remove(0);
			} else {
				tmp.add(right.get(0));
				right.remove(0);
			}
		}

		if (right.size() > 0) {
			for (int i = 0; i < right.size(); i++) {
				tmp.add(right.get(i));
			}
		}

		if (left.size() > 0) {
			for (int i = 0; i < left.size(); i++) {
				tmp.add(left.get(i));
			}
		}
		return tmp;
	}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(8);
		nums.add(7);
		nums.add(1);
		
		nums = sort(nums);
		
		System.out.println(nums);
		
		
	}
}
