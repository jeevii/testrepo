package letCodePractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select slfruits = new Select(fruits);
		slfruits.selectByVisibleText("Apple");
				
		WebElement heros =driver.findElement(By.id("superheros"));
		Select sheros = new Select(heros);
		sheros.selectByIndex(0);
		sheros.selectByValue("bt");
		System.out.println(sheros.isMultiple());
		List<WebElement> allHeros = sheros.getAllSelectedOptions();
		for (WebElement webElement : allHeros) {
			System.out.println(webElement.getText());
		}
		WebElement countries = driver.findElement(By.id("country"));
		Select country = new Select(countries);
		country.selectByValue("India");
		WebElement selectedcountry = country.getFirstSelectedOption();
		System.out.println(selectedcountry.getText());
		
		WebElement language = driver.findElement(By.id("lang"));
		Select lang = new Select(language);
		lang.selectByIndex(4);
		List<WebElement> allang =lang.getOptions();
		for (WebElement webElement : allang) {
			System.out.println(webElement.getText());
		}
	}
}
