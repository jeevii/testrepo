package letCodePractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://letcode.in/alert");
//		driver.findElement(By.id("accept")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		driver.findElement(By.id("confirm")).click();
//		 driver.switchTo().alert();
//		 System.out.println(alert.getText());
//		 alert.dismiss();
//		 driver.findElement(By.id("prompt")).click();
//		 //driver.switchTo().alert();
//		
//		 driver.switchTo().alert().sendKeys("JeevithaK");
//		 alert.accept();
//		System.out.println(driver.findElement(By.id("myName")).getText());
		
		driver.findElement(By.id("modern")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='title']")).getText());
		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
		
	}
}
