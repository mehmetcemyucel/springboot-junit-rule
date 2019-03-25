package com.mcy.rule.externalresource;

import org.junit.ClassRule;
import org.junit.Test;

public class ExternalResourceTest {

	@ClassRule
	public static ExternalResourceRule server = new ExternalResourceRule();
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
