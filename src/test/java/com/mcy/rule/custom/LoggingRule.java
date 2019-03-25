package com.mcy.rule.custom;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {

	String value;

	public LoggingRule(String value) {
		super();
		this.value = value;
	}

	public Statement apply(final Statement st, Description desc) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println(value);
				st.evaluate();
			}
		};
	}
}
