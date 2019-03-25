package com.mcy.rule.timoeut;

import org.junit.Test;

public class WithoutTimeoutRuleTest {

	@Test(timeout = 1000)
	public void test() throws InterruptedException {
		Thread.sleep(1100);
	}

	@Test(timeout = 1000)
	public void test2() throws InterruptedException {
		Thread.sleep(1100);
	}
}
