package seleniumbasiclearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		// convert above set to array list
		
		/*List<String> windowIdsList = new ArrayList<>(windowIDs);
		String parent_id = windowIdsList.get(0);
		String child_id = windowIdsList.get(1);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		*/
		
		// Approach 2 --> using for loop
		
		for(String WinID : windowIDs) {
			driver.switchTo().window(WinID).getTitle();
			
			
		}

	}

}
