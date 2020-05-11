package tw.tsunglin.leetcode1001;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		int len = digits.length;
		
		for(int i=1; i<=len-1; i++) {
			
			int lastNum = digits[len-i];			
			int newLastNum = lastNum + 1;
			
			
			if(newLastNum>=10) {
				newLastNum = newLastNum-10;
				digits[len-i] = newLastNum;
		
			}else {
				digits[len-i] = newLastNum;
				break;
			}
		}
		
		
		return digits;
	}

	public static void main(String[] args) {
		int[] ans = PlusOne.plusOne(new int[] {4,3,2,9});
		for(int a: ans) {
			System.out.println(a);
		}

	}

}
