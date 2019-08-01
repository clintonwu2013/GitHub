package tw.tsunglin.leetcode0801;

public class OneBitTwoBitCharacters {
	public static boolean isOneBitCharacter(int[] bits) {
		int length = bits.length;
		if(bits[length-2]==0) {
			return true;
		}
		
		int i=0;
		while(i<length) {
			if(bits[i]==0) {
				i++;
			}else {
				i=i+2;
			}
			
			
		}
		if(i==length) {
			return false;
		}else {
			return true;
		}
		
	}
	public static void main(String[] arg) {
		int[] bits = {1, 1,  0};
		boolean ans = OneBitTwoBitCharacters.isOneBitCharacter(bits);
		System.out.println(ans);
	}

}
