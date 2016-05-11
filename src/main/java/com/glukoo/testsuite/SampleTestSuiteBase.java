/***
 * 
 */
package com.glukoo.testsuite;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.IFind;
import com.atmecs.falcon.automation.util.parser.PropertyParser;

/**
 * 
 *         USE THIS CLASS TO WRITE FUNCTIONS THAT ARE REQUIRED TO EXECUTE BEFORE
 *         SUITE AND AFTER SUITE AND ALSO FUNCTIONS IF ANY TO SET AS BASE FOR
 *         THE SUITE
 * 
 */
public class SampleTestSuiteBase {

	
	protected String fileSaparator = File.separator;
	protected Properties properties;
	protected Browser browser;
	protected Verify verify=new Verify();
	protected IFind find;
	
	
	@BeforeSuite
	public void preSetup() {
		try {
			String heatClinicPagePath = System.getProperty("user.dir")+fileSaparator+"src"+fileSaparator+"main"+fileSaparator+"resources"+fileSaparator+"SampleTest.properties";
			browser = new Browser();
			find=browser.getFindFromBrowser();
			verify.setFind(find);
			properties = new PropertyParser().loadProperty(heatClinicPagePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void teardown() {
		// USE THIS METHOD TO WRITE OPERATIONS IF ANY TO DO AFTER SUITE
		//browser.closeBrowser();
	}

}