package assignmentPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdowns {
	@Test
	public void autoSuggestions() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		List <WebElement> suggestions= driver.findElements(By.xpath("(//li[@class='ui-menu-item'])"));
		
		for(WebElement pick :suggestions) {
			if(pick.getText().equalsIgnoreCase("India")) {
				pick.click();
				
			}
	}
		driver.quit();
	}
}


