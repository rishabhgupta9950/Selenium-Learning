package seleniumbasiclearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jdi.connect.spi.Connection;

/*
 * Broken links are the links which doesn't have any resource in the server.
 * 
 * Link href = "https://www.xyz.com"
 * https://xyz.com --> server --> status code
 * status code >= 400 --> Broken link
 * status code < 400 --> not a broken link
 */

public class HandlingBrokenLinkDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		// 1. capture all the links from website
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		int noofBrokenLinks = 0;
		
		for(WebElement linkEle : links) {
			String hrefAttValue = linkEle.getAttribute("href");
			
			if(hrefAttValue == null || hrefAttValue.isEmpty()) {
				System.out.println("href attribute value is empty or null so not possible to check");
				continue;
			}
			
			// hit url to the server
			try {
				URL urlLink = new URL(hrefAttValue); // converted href value from string to url format
				HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection(); // open connection to the server
				connection.connect(); // conect to the server and send request to the server
				
				if(connection.getResponseCode() >= 400) {
					System.out.println(hrefAttValue+" ====> Broken Link");
					noofBrokenLinks++;
				} else {
					System.out.println(hrefAttValue+" ====> Not a broken link");
				}
			}
			
			catch(Exception e) {
				
			}
		}
		
		System.out.println("No of Broken links are : " +noofBrokenLinks);
	}

}
