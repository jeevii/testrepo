package letCodePractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	
	public static void main(String[] args) {
//		WebDriverManager.chromiumdriver().setup();
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.findElement(By.name("q")).sendKeys("Cricket",Keys.ENTER);
//		List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(), 'Cricket')]"));
//		System.out.println(crickets.size());
		
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/edit");
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		 WebElement lastone = labels.get(labels.size()-1);
		 System.out.println(lastone.getText());
		 
	

	
		driver.quit();
	}
}
