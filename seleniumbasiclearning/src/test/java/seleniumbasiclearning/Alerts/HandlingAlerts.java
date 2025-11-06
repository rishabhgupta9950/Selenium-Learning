package seleniumbasiclearning.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Simple Alert: This type of alert displays a message to the user and typically has a single "OK" button to dismiss it. It's used for displaying informational messages, warnings, or errors that require simple acknowledgment.

//Confirmation Alert: A confirmation alert presents a message and offers the user a choice between "OK" and "Cancel" buttons. It's used to solicit user confirmation for an action, allowing them to either proceed or abort the operation.

//Prompt Alert: This alert type includes a message, "OK" and "Cancel" buttons, and an input field where the user can enter text. It's used when the web application requires user input before proceeding with an action.

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert(); // simple alert
		
		System.out.println(myalert.getText());
		myalert.accept();
		*/
		
		/*driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
//		/driver.switchTo().alert().accept(); // for clicked OK , confirmation alert
		
		Alert myalert = driver.switchTo().alert(); 
		System.out.println(myalert.getText());
		myalert.dismiss(); // for clicked cancel 
		*/
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("Hi This is Rishabh"); //Prompt Alert
		
		System.out.println(myalert.getText());
		myalert.accept();
	}

}
