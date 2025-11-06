package seleniumbasiclearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));
		
		// selecting all check boxes with for each loop
//		for(WebElement checkbox : checkboxes) {
//			checkbox.click();
//		}
		
		for(int i = 1; i < checkboxes.size(); i++) {
			checkboxes.get(i).click();
		}
		
//		for(int i = 0; i < 3; i++) {
//			checkboxes.get(i).click();
//		}
//		
//		Thread.sleep(5000);
//		
//		for(int i = 0; i < checkboxes.size(); i++) {
//			if(checkboxes.get(i).isSelected()) {
//				checkboxes.get(i).click();
//			}
//		}
		
		//driver.close();
	}
	
	
}
