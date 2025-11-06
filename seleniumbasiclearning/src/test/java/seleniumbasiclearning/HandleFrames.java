package seleniumbasiclearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Frames and iframes in Selenium refer to elements within a web page that embed another HTML document. While "frames" 
//(using the <frame> tag) are largely deprecated in modern HTML, "iframes" (using the <iframe> tag) 
//are commonly used to embed external content, such as videos, advertisements, or content from other sources, within a web page. 

public class HandleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // passed frame as a WebElement
		// frame 1 text area
		driver.findElement(By.xpath("//input[@name = 'mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent(); // go back to page
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		// frame 2 text area 
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent(); // go back to page
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		// frame 2 text area 
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Core Java");
		
		// frame 3 inner frame which is iframe its a part of frame 3
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//span[normalize-space()='I am a human']")).click();
		driver.switchTo().defaultContent();
	}

}
