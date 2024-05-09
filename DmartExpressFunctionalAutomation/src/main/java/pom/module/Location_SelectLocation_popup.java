package pom.module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Location_SelectLocation_popup {

     private WebDriver driver ;
	 private WebDriverWait wait ;
	 
	@FindBy (xpath=("(//a[contains(@class,'btn location-selected-button')])[3]"))
	private WebElement location;
	
	public Location_SelectLocation_popup (WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
		PageFactory.initElements(driver, this);
	}
	
	public void selectLocation() {
		wait.until(ExpectedConditions.visibilityOf(location));
		location.click();
	}
}
