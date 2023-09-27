package letCodePractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotcode {

	public static void main(String[] args) throws IOException    {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in");
		File scrnshtsrc = driver.getScreenshotAs(OutputType.FILE);
		File scrndest = new File("./snaps/img.png");
		FileHandler.copy(scrnshtsrc, scrndest);
		
		//Taking screenshot of a particular element
		WebElement ele = driver.findElement(By.xpath("(//div[@class='content'])[2]"));		
		WebElement ele1 = driver.findElement(By.linkText("New Course!"));
		File scr = ele1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img2.png");
		FileHandler.copy(scr, dest);
		 scr = ele.getScreenshotAs(OutputType.FILE);
		 dest = new File("./snaps/img3.png");
		FileHandler.copy(scr, dest);
		
		//Taking screenshot of a particular section
		WebElement section = driver.findElement(By.xpath("(//div[@class=\"columns is-vcentered has-padding-top-50 has-padding-bottom-50\"])[1]"));
		File scrn1 = section.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/img4.png");
		FileHandler.copy(scrn1, dest1);
		
	}

}
