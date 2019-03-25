package com.mcy.rule.externalresource;

import org.junit.rules.ExternalResource;

public class ExternalResourceRule extends ExternalResource {

	public void before() throws Exception {
		System.out.println("sunucu basladi");
	}

	public void after() {
		System.out.println("sunucu kapandi");
	}
}
