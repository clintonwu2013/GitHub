package tw.tsunglin.test;

public class ArraySplitTest {

	public static void main(String[] args) {
		String tmp = "1,,3, ";
		String[] a = tmp.split(",");
		
		System.out.println("a size="+a.length);
		
		String tmp2 = "5,6,7,8, ";
		String[] a2 = tmp.split(",");
		
		System.out.println("a2 size="+a2.length);

	}

}
