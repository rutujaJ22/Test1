package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage_AfterClickingLogo_WithOutLogin {


	WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	// when you click on logo location popup will open for that pom.module class created after selecting logo home page will open
	
	@FindBy (xpath=("//a[contains(@class,'dropdown-toggle header')]"))
	private WebElement selectByCatagory ;
	
	@FindBy (xpath=("//a[@aria-label='Select category Health & Beauty']"))
	private WebElement healthAndBeauty ;
	
	@FindBy (xpath=("(//div[@ng-if='!product.renderEmptyTile'])[23]"))
	private WebElement selectProduct ;
	
	@FindBy (xpath=("//a[@class='header-cart-container cursor-pointer mleft24']")) 
	private WebElement seeProductIntoCart;
	
	public HomePage_AfterClickingLogo_WithOutLogin (WebDriver driver) {
		this.driver=driver;
		act = new Actions (driver);
		wait  = new WebDriverWait(driver,Duration.ofSeconds(10000));
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSelectByCatagory () {
		
	wait.until(ExpectedConditions.visibilityOf(selectByCatagory));
	selectByCatagory.click();
	}
	
	public void clickOnHealthAndBeauty() {
		healthAndBeauty.click();
	}
	
	public void selectAnyProduct () throws InterruptedException {
		act.moveToElement(selectProduct).perform();
		wait.until(ExpectedConditions.visibilityOf(selectProduct));
	     Thread.sleep(2000);
		act.doubleClick(selectProduct).perform();    // after clicking on product one popup will open on same page => in pom.module class created
		                                       // productDetails => in this handle product related details and add to cart
		
	}
	
	public void ClickOnCartButton() {
		seeProductIntoCart.click();      // after handling productdetails => select quantity and adding into cart => click on cart to see         
		                                 // product is added into the cart or not
    }

	
	
	// 3 test cases =  after cliking  on the logo futher steps
	  // 1 - verify that when user click on logo home page should open
	  // verify that when user click on logo and from home page user can select the product 
	  // after selecting the product user is able to add the or select the quantity of the producct
	  // after selecting the product user is able to add the product into cart
	  // after adding the product into the cart user is able to see the product is added into the cart or not
	
	
}