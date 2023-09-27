package testNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeAfterSuite {

	WebDriver driver;
	long startTime;
	long endTime;


	  @BeforeSuite(groups = "Launch")
	  public void lauchBrowser()
	  { 
		  startTime =System.currentTimeMillis();
		  driver = new ChromeDriver();
	  
	  }
	  @Test(groups = "google")
	public void openGoogle() {
		
		driver.get("https://www.google.com/");
	}

	@Test(groups = "bing")
	public void openBinge() {
		
		driver.get("https://www.bing.com/");
	}

	@Test(groups = "yahoo")
	public void openYahoo() {
		driver.get("https://www.yahoo.com/");
	}

	@AfterSuite(groups = "quit")
	public void quitBrowser() {

		driver.quit();
		/*
		 * endTime = System.currentTimeMillis(); long total = endTime - startTime;
		 * System.out.println("Time taken:" + total);
		 */
	}

}

