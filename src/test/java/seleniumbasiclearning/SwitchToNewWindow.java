package seleniumbasiclearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToNewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);      // it will open in new tab
		//driver.switchTo().newWindow(WindowType.WINDOW); // it will open in new window
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
