package pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_AfterLogin {

	private WebDriver driver;      // this popup will open when user select one frozen product
	
	@FindBy (xpath=("//h3[contains(@class,'text-700 mtopbot5 text-dark')]"))
	private WebElement frozenproductDetails;
	
	@FindBy (xpath=("//h4[@class='mtop10 mbot0 text-700 ng-scope']"))
	private WebElement frozenProductPrice;
	
	@FindBy (xpath=("//button[@aria-label='Increment Button']"))
	private WebElement addQuantity;
	
	@FindBy (xpath=("//a[@id='update-btn']"))
	private WebElement frozenProductAddToCart;
	
	public ProductDetails_AfterLogin (WebDriver dirver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPDetails() {
		return frozenproductDetails.getText();
	}
	
	public String getPrice() {
		return frozenProductPrice.getText();
	}
	
	
	public void selectQuantity() {
		addQuantity.click();
	}
	
	public void clickOnAddButton () {
		frozenProductAddToCart.click();
	}
	
	
}
