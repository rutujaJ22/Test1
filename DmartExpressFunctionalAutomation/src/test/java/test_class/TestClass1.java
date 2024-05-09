package test_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.DmartExpressSuperMarket_OnlineOrdering_HomePage;
import pom.HomePage_AfterClickingLogo_WithOutLogin;
import pom.module.Location_SelectLocation_popup;



public class TestClass1 {

	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod 
	public void launchHomePageBeforeLogin() {
		driver.navigate().to("https://www.dmartexpress.com");
		DmartExpressSuperMarket_OnlineOrdering_HomePage homePagebefore = new DmartExpressSuperMarket_OnlineOrdering_HomePage(driver);
		homePagebefore.clickOnLogo();
		Location_SelectLocation_popup location = new Location_SelectLocation_popup (driver);
		location.selectLocation();
		
		
   }
	
   @Test (priority=1)
   public void verifyUserCanSelectProductWithOutLogin() throws InterruptedException {
	   HomePage_AfterClickingLogo_WithOutLogin afterclickinglogo = new HomePage_AfterClickingLogo_WithOutLogin (driver);
	   afterclickinglogo.clickOnSelectByCatagory();
		afterclickinglogo.clickOnHealthAndBeauty();
	   afterclickinglogo.selectAnyProduct();
   }
   
//   @Test  (priority=2)
//   public void verifySelectedProductIsSavedInCartOrNot() {
//	   HomePage_AfterClickingLogo_WithOutLogin afterclickinglogo = new HomePage_AfterClickingLogo_WithOutLogin (driver);
//	   afterclickinglogo.ClickOnCartButton();
//   }
   
   
   
}
