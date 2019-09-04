package tw.tsunglin.leetcode0904;

public class ThirdMax {
	public static int thirdMax(int[] nums) {
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		for(int num: nums) {
			if(num > max3 && num > max2 && num >max1) {
				tmp1 = max1;
				tmp2 = max2;
				
				max1 = num;
				max2 = tmp1;
				max3 = tmp2;
			}else if(num > max3 && num < max2){
				max3 = num;
			}else if(num > max3 && num > max2 && num < max1) {
				tmp2 = max2;
				max2 = num;
				max3 = tmp2;
			}
		}
		return max3;
	}
	public static void main(String[] args) {
		int ans = ThirdMax.thirdMax(new int[] {1,2,7,4,9});
		System.out.println(ans);
	}
}
