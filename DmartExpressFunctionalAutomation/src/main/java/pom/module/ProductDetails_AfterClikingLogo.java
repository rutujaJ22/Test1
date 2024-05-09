package pom.module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_AfterClikingLogo {

	WebDriver driver;
	
	@FindBy (xpath=("//h3[contains(@class,'text-700 mtopbot5')]"))
	private WebElement brandName;
	
	@FindBy (xpath=("//h4[@class='mtop10 mbot0 text-700 ng-scope']"))
	private WebElement productPrice;
	
	@FindBy (xpath=("//button[@aria-label='Increment Button']"))
	private WebElement quantity;
	
	@FindBy (xpath=("//a[@id='update-btn']"))
	private WebElement add;
	
	public ProductDetails_AfterClikingLogo (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getProductName() {
		return brandName.getText();
	}
	public String getProductPrice() {
		return productPrice.getText();
	}
	public void addQuantity() {
		quantity.click();
	}
	public void addProductIntoCart() {
		add.click();
	}
	
	
	
	
}
