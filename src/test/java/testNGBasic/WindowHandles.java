package testNGBasic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	
	@Test
	
	public void winHandles() throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("home")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		List<String> listwins = new ArrayList<String>(windows); 
		driver.switchTo().window(listwins.get(1));
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listwins.get(1));
		driver.close();
		driver.switchTo().window(listwins.get(0));
		driver.findElement(By.id("multi")).click();
		Set<String> windows1 = driver.getWindowHandles();
		
		listwins.clear();
		listwins.addAll(windows1);
	
		
		driver.switchTo().window(listwins.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listwins.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(listwins.get(0));
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
