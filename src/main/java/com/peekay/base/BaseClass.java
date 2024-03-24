package com.peekay.base;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.peekay.dataProvider.Config;
import com.peekay.factory.BrowserFactory;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		Reporter.log("Initiating Browser and navigating to URL!",true);
		driver = BrowserFactory.initDriver(
				Config.getConfigProperties("browser"), 
				Config.getConfigProperties("url"));
		Reporter.log("Browser initiated and navigated to URL.",true);
		
	}
	@AfterClass
	public void tearDown() {
		Reporter.log("Closing all  browser sessions!",true);
		driver.quit();
		Reporter.log("All browser sessions closed.",true);
		
	}
	
	// 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


}
