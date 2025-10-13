package seleniumbasiclearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
//		WebElement search = driver.findElement(By.className("desktop-searchBar"));
//		search.sendKeys("jeans");
//		WebElement srchbtn = driver.findElement(By.className("desktop-submit"));
//		srchbtn.click();
//		Thread.sleep(6000);
		
		//By CSS Selector
		
		driver.findElement(By.cssSelector("input.desktop-searchBar[placeholder='Search for products, brands and more']")).sendKeys("T-Shirts for men");
		driver.findElement(By.className("desktop-submit")).click();
//		srchbtn.click();
		//driver.close();

	}

}

