package tw.tsunglin.leetcode1014;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSum {
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        if(nums1.length == 0 || nums2.length == 0 || k == 0){
            return answer;
        }
        
		PriorityQueue<List<Integer>> pq = new PriorityQueue<List<Integer>>(
				new Comparator<List<Integer>>() {
			public int compare(List<Integer> a, List<Integer> b) {
				return (a.get(0) + a.get(1) - b.get(0) - b.get(1));
			}
		});
		
		for(int num1: nums1) {
			for(int num2: nums2) {
				List<Integer> tmp = new ArrayList<Integer>();
				tmp.add(num1);
				tmp.add(num2);
				pq.add(tmp);
			}
		}
		
		while(!pq.isEmpty() && k>0) {
			answer.add(pq.poll());
			k--;
		}
		return answer;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
