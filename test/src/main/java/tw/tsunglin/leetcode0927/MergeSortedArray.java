package tw.tsunglin.leetcode0927;

public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		  int idx = m + n - 1;
		  int i = m - 1, j = n - 1;
		  while (idx >= 0) {
		    if (i >= 0 && j >= 0) {
		      if (nums1[i] > nums2[j]) { // pick i
		        nums1[idx--] = nums1[i--];
		      } else {
		        nums1[idx--] = nums2[j--];
		      }
		    } else if (i >= 0) {
		      nums1[idx--] = nums1[i--];
		    } else { // j >= 0
		      nums1[idx--] = nums2[j--];
		    }
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
