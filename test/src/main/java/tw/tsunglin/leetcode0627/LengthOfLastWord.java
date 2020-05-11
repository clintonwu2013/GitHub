package tw.tsunglin.leetcode0627;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		if(s.trim().length()==0) {
			return 0;
		}
		String[] array = s.trim().split(" ");
		return array[array.length-1].trim().length();
	}

	public static void main(String[] args) {
		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		System.out.println(lengthOfLastWord.lengthOfLastWord("hello world   hhj "));
	}

}
