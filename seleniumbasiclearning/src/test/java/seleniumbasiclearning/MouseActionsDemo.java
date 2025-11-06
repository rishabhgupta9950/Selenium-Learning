package seleniumbasiclearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// 4 types of operations on mouse
//1. Mouse hover
//2. Right click
//3. Double Click
//4. Drag and Drop

///Actions -- pre defined class provided in selenium

public class MouseActionsDemo {

	public static void main(String[] args) {
		
		
		/*WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//wait.until(ExpectedConditions.urlToBe("https://demo.opencart.com"));
		WebElement login = driver.findElement(By.xpath("//span[normalize-space()='Login']"));
		WebElement orders = driver.findElement(By.xpath("//li[normalize-space()='Orders']"));

		Actions action = new Actions(driver);
		
		//Mouse hover Action
		action.moveToElement(login).moveToElement(orders).click().perform(); // build -  create an action , perform - complete an action
		*/
		
		
		
		/*WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions(driver);
		action.contextClick(btn).perform(); // right click action
		
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		// close alert box
		
		driver.switchTo().alert().accept();
		*/
		
		
		
		/*
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); // as the field is present in frame
		driver.switchTo().frame(frame);
		
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		box1.clear();
		box1.sendKeys("Rishabh");
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		String text = box2.getText();
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(btn).perform(); // perform double click action
		
		if(text.equals("Rishabh")) {
			System.out.println("Text copied");
		} else {
			System.out.println("value not copied properly");
		}
		
		//getText() --> returns inner text of the web element
		//getAttribute(attribute) --> returns value of attribute
		
		*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/htmL/tryit.asp?filename=tryhtml5_draganddrop");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); // as the field is present in frame
		driver.switchTo().frame(frame);
		
		WebElement drop = driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement drag = driver.findElement(By.xpath("//img[@id='img1']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform(); // perform drag and drop
		
//		Actions vs Action
//		
//		Actions -- class which we usedto perform mouse operations
//		
//		Action -- interface which is used to store created actions
	}

}
