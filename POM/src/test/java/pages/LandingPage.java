package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

public class LandingPage {
	
	WebDriver driver = null;
	
	@FindBy(id = "user-name")		// This is also known as Page Factory approach
	WebElement userName;
	
	/*	alternate expression of doing the same work
	@FindBy(how = How.ID, using = "user-name") 
	WebElement userName;
	*/
	
	// Using By Class
	// By userName = By.xpath("//*[@id='user-name']");
	
	// Using directly
	// driver.findElement(By.id("user-name"));
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement submitButton;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		submitButton.click();
	}
	
}
