package com.glukoo.testscript;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.util.enums.BrowserType;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.glukoo.testsuite.SampleTestSuiteBase;


public class SampleTestScript extends SampleTestSuiteBase {

	
	@Test
	public void testScenario1() {
		browser.openPage("http://55.55.55.132:8080", BrowserType.CHROME);
        browser.getClick().performClick(LocatorType.XPATH, "//*[@id='content']/nav/ul/li[2]/a");
        browser.getWait().waitFor(LocatorType.XPATH, "//*[@id='products']/li[1]/div[3]/div");
        boolean status = verify.verifyText(LocatorType.XPATH, "//*[@id='products']/li[1]/div[3]/div", "Sudden Sauce", "Text Not Matched");
        System.out.println("STATUS = "+status);
        browser.closeBrowser();
	}

	@Test
	public void testScenario2() {
		// SAMPLE TEST SCENARIO 2

	}
}
