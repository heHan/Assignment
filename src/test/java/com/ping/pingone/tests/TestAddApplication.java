package com.ping.pingone.tests;

import org.testng.annotations.Test;

import com.ping.pingone.webdriver.test.AbstractWebDriverBase;

public class TestAddApplication extends AbstractWebDriverBase{
	static final String PINGONE_URL_PROPERTIES_KEY = "test.environment.baseUrl";
	static final String CANNOT_LOAD_PROPERTIES = "Cannot find the properties to load for this test.";
	@Test (description = "login pingon; click add new application; create connection; " +
			"complete the form; verify the new application is added;")
	public void testAddNewApplication() {
		String pingOneUrl = testProperties.getProperties().getProperty(PINGONE_URL_PROPERTIES_KEY);
		if (pingOneUrl == null) {
			throw new AssertionError(CANNOT_LOAD_PROPERTIES + " Properties: " + PINGONE_URL_PROPERTIES_KEY);
		}
		webDriver.get(pingOneUrl);
		
	}
}
