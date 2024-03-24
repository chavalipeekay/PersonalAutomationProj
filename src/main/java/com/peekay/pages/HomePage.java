package com.peekay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	protected WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
//	private WebElement menuBtn = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn' and text()='Open Menu']"));
//	private WebElement logoutLnk = driver.findElement(By.xpath("//a[@id='logout_sidebar_link' and contains(text(),'Logout')]"));
//	private WebElement welcome = driver.findElement(By.xpath("//div[@class='app_logo' and text()='Swag Labs']"));

	private By menuBtn = By.xpath("//button[@id='react-burger-menu-btn' and text()='Open Menu']");
	private By logoutLnk = By.xpath("//a[@id='logout_sidebar_link' and contains(text(),'Logout')]");
	private By welcome = By.xpath("//div[@class='app_logo' and text()='Swag Labs']");
	
	
	public boolean welcomeIsDisplayed() {
		return driver.findElement(welcome).isDisplayed();
	}

	public LoginPage logout() {
		driver.findElement(menuBtn).click();
		driver.findElement(logoutLnk).click();
		LoginPage lp=new LoginPage(driver);
		return lp;
	}
	public void printDriver() {
		System.out.println("HomePage"+driver);
	}

}
