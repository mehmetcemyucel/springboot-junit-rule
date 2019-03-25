package com.mcy.rule.custom.mockito;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.mockito.MockitoAnnotations;

public class MockInitRule implements TestRule{
	
	private final Object target;

	public MockInitRule(Object target) {
		super();
		this.target = target;
	}

	public Statement apply(final Statement st, Description desc) {
		return new Statement() {

			@Override
			public void evaluate() throws Throwable {
				MockitoAnnotations.initMocks(target);
				st.evaluate();
			}
		};
	}
}
