package tw.tsunglin.leetcode1119;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	public static List<Integer> sort(List<Integer> lst) {
		if (lst.size() <= 1) {
			return lst;
		}
		int mid = lst.size() / 2;
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();

		for (int i = 0; i < mid; i++) {
			left.add(lst.get(i));
		}

		for (int i = mid; i < lst.size(); i++) {
			right.add(lst.get(i));
		}
		left = sort(left);
		right = sort(right);
		return merge(left, right);
	}

	private static List<Integer> merge(List<Integer> left, List<Integer> right) {
		List<Integer> temp = new ArrayList<Integer>();
		
		while(left.size()>0 && right.size()>0) {
			if(left.get(0)<= right.get(0)) {
				temp.add(left.get(0));
				left.remove(0);
			}else {
				temp.add(right.get(0));
				right.remove(0);
			}
		}
		
		if(left.size() > 0) {
			for(int i=0; i<left.size(); i++) {
				temp.add(left.get(i));
			}
		}
		
		if(right.size() > 0) {
			for(int i=0; i<right.size(); i++) {
				temp.add(right.get(i));
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		

	}

}
