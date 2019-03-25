package com.mcy.rule.expectedException;

import org.junit.Test;

public class WithoutExpectedExceptionTest {

	@Test(expected = NullPointerException.class)
	public void test() {
		String value = null;
		value.split("");
	}

	@Test(expected = ArithmeticException.class)
	public void test2() {
		int val1 = 3, val2 = 0;
		val1 = val1 / val2;
	}
}
