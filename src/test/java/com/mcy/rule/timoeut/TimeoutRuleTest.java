package com.mcy.rule.timoeut;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRuleTest {

	@Rule
	public Timeout timeout = new Timeout(	1000,
											TimeUnit.MILLISECONDS);

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(1100);
	}

	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1100);
	}
}
