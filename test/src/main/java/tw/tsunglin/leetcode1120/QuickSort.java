package tw.tsunglin.leetcode1120;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	public static void Sort(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int n : array) {
        	list.add(n);
        }
        list = Sort(list);
        for (int i = 0;i < array.length;++i) {
        	array[i] = list.get(i);
        }
    }
	
	public static List<Integer> Sort(List<Integer> list){
		if(list.size()<2) {
			return list;
		}
		
		int pivot = list.get(list.size()/2);
		list.remove(list.size()/2);
		List<Integer> less = new ArrayList<Integer>();
		List<Integer> greater = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		for(Integer n: list) {
			if(n>pivot) {
				greater.add(n);
			}else {
				less.add(n);
			}
		}
		result.addAll(Sort(less));
		result.add(pivot);
		result.addAll(Sort(greater));
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {3,2,4,6,9,7,8};
		Sort(nums);
		for(int num: nums) {
			System.out.println(num);
		}
	}
}
