package seleniumbasiclearning.DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// Three kinds of dropdown

// 1. select dropdown
// 2. Bootstrap dropdown
// 3. Hidden dropdown

// There are three methods in select class
// 1. selectByVisibleText()
// 2. selectByValue()
// 3. selectByIndex()

public class DropDownsSelectClass {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Select dropdown
		WebElement drpdownElement = driver.findElement(By.xpath("//select[@id='country']"));
		Select drpdwonCountry = new Select(drpdownElement);
		
		
//		drpdwonCountry.selectByVisibleText("France");
//		drpdwonCountry.selectByValue("india");
//		drpdwonCountry.selectByIndex(7);
		
		// capture the options from the dropdown
		
		List<WebElement> countries = drpdwonCountry.getOptions();
		
		System.out.println(countries.size()); //  no of option in a dropdown
		
		for(WebElement option : countries) {
			System.out.println(option.getText());
		}
		
	}
	

}
