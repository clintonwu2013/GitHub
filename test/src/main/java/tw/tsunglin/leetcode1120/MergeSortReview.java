package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.List;

public class MergeSortReview {
	public static List<Integer> sort(List<Integer> list){
		if(list.size() < 2) {
			return list;
		}
		int mid = list.size()/2;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		for(int i =0; i< mid; i++) {
			left.add(list.get(i));
		}
		
		for(int i =mid; i< list.size(); i++) {
			right.add(list.get(i));
		}
		
		left = sort(left);
		right = sort(right);
		return merge(left, right);
	}

	private static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> tmp = new ArrayList<Integer>();
		while(left.size()>0 && right.size()>0) {
			if(left.get(0)<=right.get(0)) {
				tmp.add(left.get(0));
				left.remove(0);
			}else {
				tmp.add(right.get(0));
				right.remove(0);
			}
		}
		if(right.size() >0) {
			for(int i=0; i<right.size(); i++) {
				tmp.add(right.get(i));
			}
		}
		
		if(left.size() >0) {
			for(int i=0; i<left.size(); i++) {
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
