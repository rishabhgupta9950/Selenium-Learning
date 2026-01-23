package seleniumbasiclearning.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// 1. Constructors --> initiate the web driver

// 2. Locators

// 3. Action Methods

public class LoginPage {
	
	WebDriver driver; // class variable
	
	// constructor
	LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// locators
	By txt_username_loc = By.xpath("//input[@placeholder='Username']");
	By txt_password_loc = By.xpath("//input[@placeholder='Password']");
	By login_btn_loc = By.xpath("//button[normalize-space()='Login']");
	
	// action methods
	
	public void setUserName(String username) {
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String pass) {
		driver.findElement(txt_password_loc).sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		driver.findElement(login_btn_loc).click();
	}

}
