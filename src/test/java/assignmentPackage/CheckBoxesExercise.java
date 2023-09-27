package assignmentPackage;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CheckBoxesExercise {
	@Test
	public void checkBoxes() {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C://Users/chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement chck1 = driver.findElement(By.id("checkBoxOption1"));
		chck1.click();
		System.out.println(chck1.isSelected());
		chck1.click();
		System.out.println(chck1.isSelected());
		//Assert.assertFalse((chck1).isSelected());
		System.out.println("test");
		
		System.out.println(driver.findElements(By.cssSelector("input[type=\"checkbox\"]")).size());
		driver.quit();
		
		}
		
		
		
	}
	

