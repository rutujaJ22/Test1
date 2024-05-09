package pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {

	private WebDriver driver;
	
	@FindBy (xpath=("//h4[@class='mtop0 ng-binding text-dark-gray']"))
	private WebElement message;
	
	@FindBy (xpath=("//input[@id='email']"))
	private WebElement email;
	
	@FindBy (xpath=("//input[@type='password']"))
	private WebElement password;
	
	@FindBy (xpath=("//button[@type='submit']"))   // after cliking on login button new hidden division popup will open=> location
	private WebElement loginButton;                                          // location class is already created
	
	
	                                
	
	public LogIn_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getmassage () {
		return message.getText();
	}
	public void sendEmail (String emailId) {
		email.sendKeys(emailId);
	}
	public void sendpassword (String passwordId) {
		password.sendKeys(passwordId);
	}
	public void clickOnLogin () {
		loginButton.click();    
	}
	
	
	
	
	
	
	      
}
