package com.peekay.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.peekay.dataProvider.Config;

public class BrowserFactory {
	
	public static WebDriver initDriver(String browser,String url) {
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else
			System.out.println("This Browser is not supported !!!"+browser);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(
				Long.parseLong(Config.getConfigProperties("pageLoadTimeout"))));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(
				Long.parseLong(Config.getConfigProperties("scriptTimeout"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(
				Long.parseLong(Config.getConfigProperties("implicitlyWait"))));
		driver.get(url);
		
		return driver;
		
	}
}
