package tw.tsunglin.test;

public class ReplaceAllTest {

	public static void main(String[] args) {
		String a = "錯單& #40;與主號宣告傳輸人86378307不符& #41;".replaceAll("\\& #40;", "(");
		a = "錯單(與主號宣告傳輸人86378307不符& #41;".replaceAll("\\& #41;", ")");
		System.out.println(a);
	}

}
