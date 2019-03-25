package com.mcy.rule.custom.mockito;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;

public class MockInitRuleTest {

	// Mesela bu sekilde sadece rule ile mocklarin ayaga kaldirilmasini
	// saglayabilinir.
	// Bu rule'u extend eden diger rule'larda behaviour'lar tanimlanabilir

	@Rule
	public MockInitRule rule = new MockInitRule(this);

	@Mock
	AnyService service;

	@Test
	public void test() {
		assertThat(service).isNotNull();
	}
}
