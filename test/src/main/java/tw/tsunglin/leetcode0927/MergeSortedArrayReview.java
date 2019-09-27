package tw.tsunglin.leetcode0927;

public class MergeSortedArrayReview {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
//		int[] num = new int[m+n];
		int idx = m+n-1;
		int i = m-1;
		int j = n-1;
		
		while(idx >=0) {
			if(i>=0 && j>=0) {
				if(nums1[i] > nums2[j]) {
					nums1[idx--] = nums1[i--];
				}else {
					nums1[idx--] = nums2[j--];
				}
			}else if(i>=0) {
				nums1[idx--] = nums1[i--];
			}else if(j>=0) {
				nums1[idx--] = nums2[j--];
			}
		}
	}
	public static void main(String[] args) {
		int[] nums1 = new int[]{1,2,3,0,0,0};
		int[] nums2 = new int[]{2,5,6};
		
		MergeSortedArrayReview.merge(nums1, 3, nums2, 3);
		
		for(int num: nums1) {
			System.out.println(num);
		}

	}

}
