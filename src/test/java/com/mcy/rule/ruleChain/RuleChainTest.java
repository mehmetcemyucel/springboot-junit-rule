package com.mcy.rule.ruleChain;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import com.mcy.rule.custom.LoggingRule;

public class RuleChainTest {
	@Rule
	public final TestRule chain = RuleChain	.outerRule(new LoggingRule("cevreleyen rule"))
											.around(new LoggingRule("ikinci rule"))
											.around(new LoggingRule("ucuncu rule"));

	@Test
	public void example() {
		assertTrue(true);
	}

	@Test
	public void example2() {
		assertTrue(true);
	}
}