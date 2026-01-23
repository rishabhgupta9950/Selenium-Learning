package SeleniumInterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCaptureFromXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("Samsung Galaxy");
		searchBox.sendKeys(Keys.ENTER);;
		
		List<WebElement> productList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		System.out.println("Samsung Galaxy S25 Phones List");
		
		int count = 0;
		for(WebElement title : productList) {
			String productname = title.getText();
			
			if(productname.contains("Galaxy S25 5G")) {
				System.out.println(++count +"." +productname);
			}
		}

	}

}
