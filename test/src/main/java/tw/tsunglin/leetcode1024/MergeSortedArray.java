package tw.tsunglin.leetcode1024;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		while(n > 0) {
			if(nums1[m-1] >= nums2[n-1]) {
				nums1[m+n-1] = nums1[m-1];
				m--;
			}
			else {
				nums1[m+n-1] = nums2[n-1];
				n--;
			}
		}
		
	}

	public static void main(String[] args) {
		MergeSortedArray mergeSortedArray = new MergeSortedArray();
		int[] nums1 = new int[] {1,2,3,0,0,0};
		int[] nums2 = new int[] {2,5,6};
		int m = 3;
		int n = 3;
		mergeSortedArray.merge(nums1, m, nums2, n);
		
		for(int i =0 ; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

}
