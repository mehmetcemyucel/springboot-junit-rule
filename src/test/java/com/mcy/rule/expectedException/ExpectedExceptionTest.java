package com.mcy.rule.expectedException;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionTest {

	@Rule
	public ExpectedException exp = ExpectedException.none();

	@Test
	public void test() {
		exp.expect(NullPointerException.class);
		String value = null;
		value.split("");
		fail();
	}

	@Test
	public void test2() {
		exp.expect(ArithmeticException.class);
		exp.expectMessage("/ by zero");
		int val1 = 3, val2 = 0;
		val1 = val1 / val2;
		fail();
	}
}
