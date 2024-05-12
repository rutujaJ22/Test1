package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs_Page {
	
	private WebDriver driver;
	
	// when this page appears first location popup will come after handling location popup perform action on aboutpage
	// when you select any location you should get below infromation of that location
	
	@FindBy (xpath=("(//li[@class='pad10'])[1]"))
	private WebElement location;
	
	@FindBy (xpath=("(//li[@class='pad10'])[2]"))
	private WebElement phoneNumber;
	
	@FindBy (xpath=("(//li[@class='pad10'])[3]"))
	private WebElement email;
	
	@FindBy (xpath=("//li[@class='pad10 ng-scope']//p"))
	private WebElement hours;
	
	
	public AboutUs_Page (WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	public String getLocation () {
		return location.getText();
	}
	public String getPhoneNumber () {
		return phoneNumber.getText();
	}
	public String getEmailAddress () {
		return email.getText();
	}
	public String getDaysAndHours() {
		
		return hours.getText();   // here i want to  use the code of html table => findelements , List collection 
    }

   public String getDaysAndHourss() {  // delete later
		
		return hours.getText();   // here i want to  use the code of html table => findelements , List collection 
    }

   public String getDaysAndHourss() {   // delete this method later
		
		return hours.getText();   // here i want to  use the code of html table => findelements , List collection 
    }
   
   public String getDaysAndHoursssss() {   // delete this method later
		
		return hours.getText();   // here i want to  use the code of html table => findelements , List collection 
   }

	

}
