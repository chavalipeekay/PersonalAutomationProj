package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.peekay.base.BaseClass;
import com.peekay.pages.HomePage;
import com.peekay.pages.LoginPage;

public class Logout extends BaseClass{
	@Test
	public void logoutTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = loginPage.login();
		

		Thread.sleep(5000);

		loginPage = homePage.logout();
		Assert.assertTrue(loginPage.loginLogoIsDisplayed());
	}

}
