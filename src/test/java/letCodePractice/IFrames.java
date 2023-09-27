package letCodePractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrames {
		
	public static void main(String[] arg) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Jeevitha");
		driver.findElement(By.name("lname")).sendKeys("K");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.name("email")).sendKeys("Jeevi@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("R");
		String message = driver.findElement(By.xpath("//p[@class='title has-text-info']")).getText();
		System.out.println(message);
		String actual = "You have entered Jeevitha KR";
		Assert.assertEquals(actual, message);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
		
		
	}
}
