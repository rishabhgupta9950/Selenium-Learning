package seleniumbasiclearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new"); // the execution is done in backend 
		// we can do parallel tasks while doing headless testing 
		
		//options.setAcceptInsecureCerts(true); // it will accept the insecure certificates
		
		//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // disable automated message on screen
		
		options.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.get("https://expired.badssl.com/");
		String title = driver.getTitle();
		
		/*if(title.equals("Automation Testing Practice")) {
			System.out.println("test case passed");
		} else {
			System.out.println("Test case failed");
		}
		*/
		//driver.quit();
	}

}
