package tw.tsunglin.leetcode0801;

public class OneBitTwoBitCharacters {
	public static boolean isOneBitCharacter(int[] bits) {
        int i = bits.length - 2;
        while (i >= 0 && bits[i] > 0) i--;
        return (bits.length - i) % 2 == 0;
    }
	public static void main(String[] arg) {
		int[] bits = {1, 1,  0};
		boolean ans = OneBitTwoBitCharacters.isOneBitCharacter(bits);
		System.out.println(ans);
	}

}
