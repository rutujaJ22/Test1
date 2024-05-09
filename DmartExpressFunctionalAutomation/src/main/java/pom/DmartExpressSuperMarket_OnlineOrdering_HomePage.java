package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmartExpressSuperMarket_OnlineOrdering_HomePage {

	private WebDriver driver;       // after clicking orderonline , dmart logo  => location popup will open => after homepage without login 
	private JavascriptExecutor js;
	
	
	@FindBy  (xpath=("//img[@alt='Dmart Express']"))
	private WebElement dmartExpressLogo;   // after clicking on logo location popup will open => pom.module class created
	
	@FindBy (xpath=("//input[@aria-label='Search for an item']"))
	private WebElement search;
	
	@FindBy (xpath=("//span[text()='Signup / Login']"))
	private WebElement signUpOrLogin ;     // after clicking on login hiddendivision popup will open that is loginpage=> class is created already
	
	@FindBy (xpath=("//a[@href='/cart']"))
	private WebElement cartIcon;
	
	@FindBy (xpath=("(//a[@ng-href='/products'])[1]"))
	private WebElement orderOnline; // After clicking on order online button location popup will open=>pom.module class is already created => location
	
	@FindBy (xpath=("(//a[@ng-if='cta.isDelivery'])[1]"))
	private WebElement deliveryAreas;
	
	@FindBy (xpath=("//a[text()='About']"))
	private WebElement about;    // after clicking about location popup will open => pm.module class created for location => 
	                             // click about=>location popup from pom.module=>aboutuspage-
	@FindBy (xpath=("//a[text()='Contact']"))
	private WebElement contact;  // after clicking contact location popup will open => pm.module class created for location => 
	                             // click contact=>location popup from pom.module=>contactpage-
	
	public DmartExpressSuperMarket_OnlineOrdering_HomePage (WebDriver driver) {
		this.driver=driver;
		js = (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogo () {
	   dmartExpressLogo.click();
	}
	public void enterSearchData (String searchField) {
		
		search.sendKeys(searchField);
	}
	public void clickOnLogin () {
		signUpOrLogin.click();
	}
	public void clickOnCartButton () {
		cartIcon.click();
	}
	public void clickOnOrderOnlineButton () {
		orderOnline.click();
	}
	public void clickOnDeliveryAreas () {
		deliveryAreas.click();
	}
	public void clickOnAbout () {
	js.executeScript("arguments[0].scrollIntoView(true)",about);
		about.click();
	}
	public void clickOnContact () {
	js.executeScript("arguments[0].scrollIntoView(true)",contact);
		contact.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
