package letCodePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class DragDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/draggable");
		WebElement drag = driver.findElement(By.id("sample-box"));
//		System.out.println(drag.getText());
		Actions builder = new Actions(driver);
		int x=drag.getLocation().getX();
		int y =drag.getLocation().getY();
		try {
		builder.dragAndDropBy(drag, x, y).perform();
		}
		catch(MoveTargetOutOfBoundsException mob) {
			System.err.println("Out of box location");
		}
	}

}
