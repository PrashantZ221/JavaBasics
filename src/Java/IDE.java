/*package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class TestCase1 {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://www.seleniumhq.org/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testCase1() throws Exception {
		selenium.open("/projects/");
		verifyTrue(selenium.isElementPresent("link=Download"));
		selenium.click("link=Download");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=Documentation");
		selenium.waitForPageToLoad("30000");
		selenium.click("//li[@id='menu_support']/a");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=q", "ddwqdwqdwqdw");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
*/