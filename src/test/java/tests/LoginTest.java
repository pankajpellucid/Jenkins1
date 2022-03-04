package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	LoginPage loginPage;
	
	@BeforeMethod
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Test
	public void loginTest() {
		  
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
   }
	
	@Test
	public void pageTitleTest() throws IOException {
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		
        String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Dashboard- iBilling", actualTitle);
		System.out.println("User landed on Dashboard Page!");
		takeScreenshot();
		
	}
	
	@AfterMethod	
	public void tearDown() {
		driver.close();
		driver.quit();
	
	}
}