package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUs_Page {

	WebDriver driver;
	
	// when this page appears first location popup will come after handling location popup perform action on aboutpage
		// when you select any location you should get below infromation of that location
	
	@FindBy (xpath=("//span[contains(@class,'text-x-lg bg-seconda')]"))
	private WebElement contactUs;
	
	@FindBy (xpath=("(//li[@class='pad10'])[1]"))
	private WebElement citylocation;
	
	@FindBy (xpath=("(//li[@class='pad10'])[2]"))
	private WebElement phoneNumber;
	
	@FindBy (xpath=("(//li[@class='pad10'])[3]"))
	private WebElement emailId;
	
	@FindBy (xpath=("//li[@class='pad10 ng-scope']//p"))
	private WebElement storeOpenHours;
	
	@FindBy (xpath=("//a[contains(@href,'https://maps.google.com/maps?q=3000 ')]"))
	private WebElement getDirection;
	
	public ContactUs_Page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageRelated () {
		return contactUs.getText();
	}
	public String getLocationOfCity () {
		return citylocation.getText();
	}
	public String getNumber () {
		return phoneNumber.getText();
	}
	public String getEmailId () {
		return emailId.getText();
	}
	public String getStoreOpeninghrs () {
		return storeOpenHours.getText();
	}
	public void clickOnDiretion() {
		getDirection.click();
	}
	
	public void clickOnDiretionss() {   // delete later
		
		getDirection.click();
	}
	
}
