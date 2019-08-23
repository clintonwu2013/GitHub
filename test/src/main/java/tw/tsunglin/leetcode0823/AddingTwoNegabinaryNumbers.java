package tw.tsunglin.leetcode0823;

public class AddingTwoNegabinaryNumbers {
	public static int[] addNegabinary(int[] arr1, int[] arr2) {
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int k = 1;
		
		int carry=0;
		for (int i = arr1_length - 1; i >= 0; i--) {
			int num1 = arr1[i];
			int num2 = arr2[arr2_length - k];
			int sum = num1 + num2+carry;
			arr2[arr2_length - k] = sum % 2;
			if (sum !=0 && sum % 2 == 0) {
				carry=-1;
			}else {
				carry =0;
			}
			k++;
		}
		if(carry!=0) {
			arr2[arr2_length - k] = arr2[arr2_length - k]+carry;
		}

		return arr2;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,0,1};
		int[] arr2 = {1,1,1,1,1};
		int[] ans= AddingTwoNegabinaryNumbers.addNegabinary(arr1, arr2);
		for(int i=0; i<ans.length ; i++) {
			System.out.println(ans[i]);
		}

	}

}
