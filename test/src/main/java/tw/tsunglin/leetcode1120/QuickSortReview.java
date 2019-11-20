package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.List;

public class QuickSortReview {
	public static List<Integer> sort(List<Integer> list) {
		if(list.size()<2) {
			return list;
		}
		int mid = list.size()/2;
		int pivot = list.get(mid);
		list.remove(mid);
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)<= pivot) {
				left.add(list.get(i));
			}
			else {
				right.add(list.get(i));
			}
		}
		result.addAll(sort(left));
		result.add(pivot);
		result.addAll(sort(right));
		
		
		return result;
		
	}
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(9);
		nums.add(4);
		nums.add(7);
		nums.add(2);
		
		nums = sort(nums);
		System.out.println(nums);

	}

}
