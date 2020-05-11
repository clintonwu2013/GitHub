package tw.tsunglin.leetcode1114;

public class MergeSortedArray {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		for (int i = (m + n) - 1; i >= 0; i--) {
			if (m == 0 || n == 0) {
				break;
			}
			if (nums1[m - 1] > nums2[n - 1]) {
				nums1[i] = nums1[m - 1];
				m--;
			} else {
				nums1[i] = nums2[n - 1];
				n--;
			}

		}

		if (n > 0) {
			for (int j = 0; j < n; j++) {
				nums1[j] = nums2[j];
			}
		}
	}

	public static void main(String[] args) {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = new int[] { 2, 5, 6 };
		MergeSortedArray.merge(nums1, 3, nums2, 3);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

}
