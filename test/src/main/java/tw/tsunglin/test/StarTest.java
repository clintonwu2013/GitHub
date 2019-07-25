package tw.tsunglin.test;

public class StarTest {
	public static void main(String[] args) {
		for(int i=4; i>=0; i=i-1) {
			for(int j=0; j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
