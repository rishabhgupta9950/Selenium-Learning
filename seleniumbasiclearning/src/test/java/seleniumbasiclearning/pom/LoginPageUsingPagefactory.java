package seleniumbasiclearning.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// 1. Constructors --> initiate the web driver

// 2. Locators

// 3. Action Methods

public class LoginPageUsingPagefactory {
	
	WebDriver driver; // class variable
	
	// constructor
	LoginPageUsingPagefactory(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	// locators
	@FindBy(xpath="//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement login_btn;
	
	// action methods
	
	public void setUserName(String username) {
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		login_btn.click();
	}

}
