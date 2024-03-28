package experimentsInterviews;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Experiments { //extends ExperimentsParent
	
	public Experiments() {
		this("Test");
		System.out.println(super.getClass()); 
		System.out.println(this.getClass()); 
		
		System.out.println("default constructor of current");
	}
public Experiments(String a) {
		
		System.out.println("default constructor of current ith "+a);
	}

public void meth1() {
		meth2();
		
		System.out.println("inside meth1");
	}
public void meth2() {
	
	System.out.println("inside meth2");
}

	
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
	
		String str= "asdf45wer";
		
		String rev = new StringBuilder(str).reverse().toString(); 
		
		System.out.println(str + " " + rev );
		
		for(int i=str.length()-1;i>=0;i--)
			System.out.print(str.charAt(i));
		System.out.println("==========================================================");
		Map<Integer,Character> strMap=new HashMap<Integer, Character>();
		Map<Integer,Character> revStrMap=new HashMap<Integer, Character>();
		ArrayList<Character> chArr =new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
			strMap.put(i, str.charAt(i));
		System.out.println(strMap);
	
		for(int i=str.length()-1;i>=0;i--)
//			if(!Character.isDigit(str.charAt(i))) 
				chArr.add(str.charAt(i));
		System.out.println(chArr);
		
		for(int i=str.length()-1;i>=0;i--) {
//			for(int j=0;j<str.length()-1;j++) {
				if(!Character.isDigit(str.charAt(i))) {
					System.out.println(i +" "+ -1*(i-(str.length()-1)));
				}
				else {
					System.out.println(i +" "+ -1*(i-(str.length()-1)));
				}
//			}
			
//			revStrMap.put(i-str.length()-1, str.charAt(i));
		}
		
		

/*		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
				//Utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");

		String parentWindowHandle = driver.getWindowHandle();

		System.out.println("Window Handle Of Parent Window " + parentWindowHandle);

		driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]")).click();

		Set<String> allWindows = driver.getWindowHandles();

		System.out.println("Total Tabs/Windows are " + allWindows.size());

		System.out.println("All Window Handles " + allWindows);

		List<String> allWindowsInList = new ArrayList<String>(allWindows);

		System.out.println("Before Switch Title Is " + driver.getTitle());

		driver.switchTo().window(allWindowsInList.get(1));
		
		Thread.sleep(5000);
		
		SimpleDateFormat dateFormatter=new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		
		Date currentDate=new Date();
		
		String dateTime=dateFormatter.format(currentDate);
		
		System.out.println(System.getProperty("user.dir")+"\\Screenshots\\"+dateTime+".png");
		
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), 
				new File(System.getProperty("user.dir")+"\\Screenshots\\"+dateTime+".png"));
		
		

		System.out.println("After Switch Title Is " + driver.getTitle());

		driver.close();
		
		Thread.sleep(5000);

		driver.switchTo().window(parentWindowHandle);

		// you can use index 0 as well while switching to parent window
		// driver.switchTo().window(allWindowsInList.get(0));

		driver.quit();
*/		
		
		
		
	}
	

}
