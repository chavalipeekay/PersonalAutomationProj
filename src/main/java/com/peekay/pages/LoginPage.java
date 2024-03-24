package com.peekay.pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.peekay.base.BaseClass;

public class LoginPage {
	
	protected WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// I am getting null pointer exceptn when i am trying driver.finelement... but works fine with By class..not able figure out why?!?
	
	private By userName = By.xpath("//input[@placeholder='Username']");
	//private WebElement userNameOld = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	private By passWord = By.xpath("//input[@placeholder='Password']");
	//private WebElement passWord = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
	private By submit=By.xpath("//input[@type='submit' and @value='Login']");
	//private WebElement submit = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
	
	private By loginLogo=By.xpath("//div[@class='login_logo' and text()='Swag Labs']");
	//private WebElement loginLogo = driver.findElement(By.xpath("//div[@class='login_logo' and text()='Swag Labs']"));
	
	
	public HomePage login() {
		driver.findElement(userName).sendKeys("standard_user");
		driver.findElement(passWord).sendKeys("secret_sauce");
		driver.findElement(submit).click();
		
		HomePage homePage= new HomePage(driver);
		return homePage;	
	}
	
	public boolean loginLogoIsDisplayed() {
		return  driver.findElement(loginLogo).isDisplayed();
	}
	
	public void printDriver() {
		System.out.println("LoginPage"+driver);
	}

}
