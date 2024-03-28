package TestCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.peekay.base.BaseClass;
import com.peekay.dataProvider.GetExcelData;
import com.peekay.pages.HomePage;
import com.peekay.pages.LoginPage;

public class Login extends BaseClass{	
	@Test(enabled = true)
	public void loginTest() {
		LoginPage loginPage = new LoginPage(driver);
		HomePage homepage = loginPage.login();
		Assert.assertTrue(homepage.welcomeIsDisplayed());
		
		
		
	}
	
	@Test(dataProvider = "excelDataProvider" ,enabled = true)
	public void loginTest(String data1,String data2,String data3,String data4) {
//		System.out.println(data1 + " -> " +data2 + " -> " +data3 );
		System.out.println(data1 + " -> " +data2 + " -> " +data3 + " -> " +data4);
		
		
	}
	
	@DataProvider
	public Object[][] excelDataProvider(){
		Object [][] data= GetExcelData.getData("\\src\\test\\resources\\ExcelFiles\\SampleData.xlsx",
				"Sheet1");
		return data;
	}
	
	@DataProvider(name="rawData")
	public Object[][] dataProvider() {
		Object[][] data= {
				{"R1 C1","R1 C2","R1 C3"},
				{"R2 C1","R2 C2","R2 C3"},
				{"R3 C1","R3 C2","R3 C3"},
				{"R4 C1","R4 C2","R4 C3"}
		};
		return data;
	}
	
		

}
