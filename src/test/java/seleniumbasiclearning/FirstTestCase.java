package seleniumbasiclearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.programiz.com/java-programming/online-compiler/");
		String actual_title = driver.getTitle();
		if(actual_title.equals("Online Java Compiler - Programiz")) {
			
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test fail");
		}
		
		driver.close();

		
	}

}
