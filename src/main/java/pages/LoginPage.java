package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}

	
	@FindBy(id="username")
	WebElement userNameField;
	//@FindBy(how=How.ID, using="form_username_email") WebElement userNameField2;
	@FindBy(css="[id='password']")
	WebElement passwordField;
	@FindBy(xpath="//button[@name='login']")
	WebElement signInButton;
	
	public void insertUserName(String userName) {
		userNameField.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
}
