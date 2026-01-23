package seleniumbasiclearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidersDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// Min Slider
		WebElement min_slider = driver.findElement(By.xpath("//span[1]"));
		System.out.println("The location of min slider is " +min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("the location of min slider after moving is "+min_slider.getLocation());
		
		// Max Slider
		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		System.out.println("The location of max slider is " +max_slider.getLocation());
		
		act.dragAndDropBy(max_slider, -313, 250).perform();
		System.out.println("the location of max slider after moving is "+max_slider.getLocation());
		
	}

}
