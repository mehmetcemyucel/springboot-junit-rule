package com.mcy.rule.custom.mockito;

public class BehaviourMockRule extends MockInitRule {

	public BehaviourMockRule(MockInitRuleTest target) {
		super(target);
		// when(target.service.deneme(....)).then(...)
	}
}
