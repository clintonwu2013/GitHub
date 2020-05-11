package tw.tsunglin.leetcode06242019;

import java.util.ArrayList;
import java.util.List;

public class AppearTwiceInList {
	static boolean sameNumber(Integer num1, Integer num2) {
		return num1 == num2;
	}

	public static void appearTwiceList(List<?> list) {
		for (Object obj : list) {
			int times = 0;
			for (Object obj2 : list) {
				if (obj.equals(obj2)) {
					times = times + 1;
				}
			}
			if (times > 1) {
				System.out.println(obj);
			}
		}
	}

	public static void main(String[] args) {
		//1-127內的integer會存在常數池
		System.out.println(AppearTwiceInList.sameNumber(10, 10));
		System.out.println(AppearTwiceInList.sameNumber(1000, 1000));

		List<String> list = new ArrayList<String>();
		list.add("hh");
		list.add("jj");
		list.add("kk");
		list.add("kk");
		list.add("ll");
		list.add("hh");

		AppearTwiceInList.appearTwiceList(list);

	}

}
