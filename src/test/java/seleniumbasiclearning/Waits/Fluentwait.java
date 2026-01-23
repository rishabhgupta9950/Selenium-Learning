package seleniumbasiclearning.Waits;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(5)).
				ignoring(NoSuchElementException.class);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchbar = mywait.until(new Function<WebDriver , WebElement>() {

			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
			}
			
		});
		
		searchbar.sendKeys("Samsung s23");

	}

}
