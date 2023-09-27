package letCodePractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
			
			//WebDriverWait wait = new WebDriverWait(driver, 20);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			
			wait.until(ExpectedConditions.alertIsPresent());
	}

}
