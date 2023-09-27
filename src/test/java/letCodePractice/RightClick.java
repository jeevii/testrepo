package letCodePractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://play.letcode.in/contextmenu");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.className("mat-list-item-content"));
		driver.findElement(By.className("mat-list-item-content"));
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform(); // Right click
		driver.findElement(By.xpath("//button[.='Click me']")).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.quit();
	}

}
