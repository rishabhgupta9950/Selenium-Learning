package seleniumbasiclearning.JsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageUsingJsExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 1. scroll down page by pixel number
		
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); // return the pixel number
		
		// 2. scroll the page till the element is visible
		
		WebElement russia = driver.findElement(By.xpath("//td[normalize-space()='Russia']"));
		js.executeScript("arguments[0].scrollIntoView();", russia);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		// 3. scroll till end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		Thread.sleep(5000);
	
		// 4. scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		js.executeScript("document.body.style.zoom = '50%'"); // zoom in zoom out
		
		
		
	}

}
