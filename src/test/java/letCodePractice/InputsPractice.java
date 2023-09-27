package letCodePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InputsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in");
//		driver.findElement(By.id("fullName")).sendKeys("Jeevitha K");
//		driver.findElement(By.id("join")).sendKeys(" Techie");
//		String getMe = driver.findElement(By.id("getMe")).getAttribute("value");
//		System.out.println(getMe);
//		driver.findElement(By.id("clearMe")).clear();
//		Boolean edit = driver.findElement(By.id("noEdit")).isEnabled();
//		System.out.println(edit);
//		String readonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
//		System.out.println(readonly);
		System.out.println(driver.getTitle());
	}

}
