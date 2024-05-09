package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_DmartExpress_page {

	WebDriver driver;
	
	@FindBy (xpath=("//h1[@class='mtopbot5 text-secondary']"))
	private WebElement visibleMassage;
	
	@FindBy (xpath=("//h4[@class='mtopbot5 text-dark-gray text-capitalize']"))
	private WebElement cartEmptyOrNotText ;
	
	@FindBy (xpath=("(//a[@href='/products'])[2]"))
	private WebElement letsFillItUp;
	
	public Cart_DmartExpress_page (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getMassage() {
		return visibleMassage.getText();
	}
	public String getMassage1() {
		return cartEmptyOrNotText.getText();
	}
	public String getMassage2() {
		return letsFillItUp.getText();
	}
	
	
	
}
