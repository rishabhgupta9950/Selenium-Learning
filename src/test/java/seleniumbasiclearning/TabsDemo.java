package seleniumbasiclearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform(); // ctrl + reg link
		
		// switching to registration page
		
		Set<String> winIds = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<>(winIds);
		
		for(String winId : winIds) {
			al.get(1);
			driver.switchTo().window(winId);
		}
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rishabh Gupta");
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-shirts"); // navigate back to main window
	}

}
