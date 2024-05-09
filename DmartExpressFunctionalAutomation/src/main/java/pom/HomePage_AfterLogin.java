package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_AfterLogin {

	private WebDriver driver;
	private Actions act;
	
	@FindBy (xpath=("(//h3[contains(@class,'text-400 ptopbot20')])[11]"))
	private WebElement frozen;
	
	@FindBy (xpath=("(//a[contains(@class,'mtopbot10 btn btn')])[11]"))
	private WebElement viewAllItoms;
	
	
	
	public HomePage_AfterLogin (WebDriver driver) {
		this.driver=driver;
		act = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getProductText () {
		
	    act.moveToElement(frozen).perform();
		return frozen.getText();
	}
	public void clickOnViewAll () {
		viewAllItoms.click();       // after clicking viewall itoms new page will be open => froze page
		                            // on that page select frozen product
	}
	
}
