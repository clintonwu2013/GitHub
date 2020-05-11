package tw.tsunglin.leetcode0916;

public class BubbleSort {
	public static int[] bubbleSort(int[] array) {
		
		for(int i =0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;	
	}
	public static void main(String[] args) {
		int[] array = {8,7,6,10,2,3,1,5,5};
		int[] ans = BubbleSort.bubbleSort(array);
		for(int a : ans) {
			System.out.println(a);
		}

	}

}
