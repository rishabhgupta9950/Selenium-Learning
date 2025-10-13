package seleniumbasiclearning;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		  WebDriver driver = new ChromeDriver();
		  
		  //driver.get("https://www.amazon.in/");
		  
		  URL myurl = new URL("https://www.amazon.in/");
		  
		  driver.navigate().to(myurl);
		  
		  //driver.navigate().to("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  
		  driver.navigate().to("https://chatgpt.com/");
		  driver.manage().window().maximize();
		  
		  driver.navigate().back();
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.navigate().forward();
		  
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.navigate().refresh();
		  
		  

	}

}
