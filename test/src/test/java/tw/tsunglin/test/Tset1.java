package tw.tsunglin.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tw.tsunglin.leetcode0819.MovingStonesUntilConsecutive;

public class Tset1 {

	@Before
	public void setUp() throws Exception {
		System.out.println("start");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void test() {
		int[] test = MovingStonesUntilConsecutive.numMovesStones(1,2,5);
		assertArrayEquals(new int[] {1,2}, test);
	}
	@Test
	public void test2() {
		int[] test = MovingStonesUntilConsecutive.numMovesStones(1,2,5);
		assertArrayEquals(new int[] {1,2}, test);
	}

}
