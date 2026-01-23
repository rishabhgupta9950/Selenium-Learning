package SeleniumInterviewPractice;

import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='Dynamic Loading']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).build().perform();
		
		
		String parentWindow = driver.getWindowHandle();
		Set<String> winIds = driver.getWindowHandles();
		
		for(String window : winIds ) {
			if (!window.equals(parentWindow)) {
		        driver.switchTo().window(window);
		        System.out.println(driver.getTitle());
		        break;
		    }
		}
		
		//Thread.sleep(5000);
		//driver.close();
		
		
	}

}
