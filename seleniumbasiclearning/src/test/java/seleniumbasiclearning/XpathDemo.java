package seleniumbasiclearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		// Xpath with single attribute
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphoen16");
		
		// Xpath with multiple attributes
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox'][@class='nav-input nav-progressive-attribute']")).sendKeys("Iphoen16");
		
		// Xpath with inner text
		//driver.findElement(By.xpath("//*[text()='Fresh']")).click();
		
		// Xpath with contains method
		//driver.findElement(By.xpath("//input[contains(@className,'a-color-base headline truncate-2line')]")).isDisplayed();
	}

}
