package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectPassword {
	@Test
	@Parameters({"Uname","Pword"})
public void loginwithCorrectPassword(String uName, String pWord) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userName =driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys(uName);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pWord);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
}
