package seleniumbasiclearning.JsExecutor;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {

		// why we use executeScript method --> bcoz sometimes action methods (click(),sendKeys()) may not work directly.
		// JavascriprExecutor - interface
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement first_name = driver.findElement(By.xpath("//input[@id='name']"));
		
		// passing the text into input box - alternate of sendKeys()
		JavascriptExecutor je = (JavascriptExecutor) driver; 
		je.executeScript("arguments[0].setAttribute('value','John')",first_name);
		
		// clicking on element - alternate of click() method
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id='male']"));
		je.executeScript("arguments[0].click()", radioBtn);
	}

}
