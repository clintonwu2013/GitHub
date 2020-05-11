package tw.tsunglin.leetcode0710;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PascalTriangle {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 1; i <= numRows; i++) {
			list.add(generateRow(i));
		}
		return list;
	}

	public List<Integer> generateRow(int i) {
		List<Integer> Row = null;
		if (i == 1) {
			Row = new ArrayList<Integer>();
			Row.add(1);
			return Row;
		} else if (i == 2) {
			Row = new ArrayList<Integer>();
			Row.add(1);
			Row.add(1);
			return Row;
		} else {
			List<Integer> BeforeRow = generateRow(i - 1);
			Row = new ArrayList<Integer>();
			Row.add(1);
			for (int j = 0; j < BeforeRow.size(); j++) {
				System.out.println(j);
				if (j == BeforeRow.size() - 1) {
					Row.add(1);
				} else {
					Row.add(BeforeRow.get(j) + BeforeRow.get(j + 1));
				}

			}
		}

		return Row;
	}

	public static void main(String[] args) {
		PascalTriangle test = new PascalTriangle();
		List<List<Integer>> ans = test.generate(30);
		System.out.println(test.generateRow(30));
		System.out.println(ans);

	}
}
