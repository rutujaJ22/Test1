package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frozen_Page {

	private WebDriver driver;
	private JavascriptExecutor js;
	
	@FindBy (xpath=("(//li[contains(@class,'col-sm-3 col-xs-6 flex-')])[20]"))
	private WebElement selectFrozenProducts;
	
	@FindBy (xpath=("//a[@class='header-cart-container cursor-pointer mleft24']"))
	private WebElement productAddedInCart;
	
	
	public Frozen_Page (WebDriver driver) {
	   this.driver=driver;
	   js = (JavascriptExecutor)driver;
	   PageFactory.initElements(driver, this);
	
     }
	
	public void clickOnFrozenProduct () {
		js.executeAsyncScript("arguments[0].scrollIntoView(true)",selectFrozenProducts);
		selectFrozenProducts.click();  // after selecting the product one popup will open for details of product
		                               // for that class is created in pom.module => productDetails_afterLogin 
	}

	
	public void seeProductIsAddedOrNot () {
		productAddedInCart.click();
	}


}