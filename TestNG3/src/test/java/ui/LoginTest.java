package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test(dataProvider = "dataset1", dataProviderClass = LoginDataProvider.class)
	public void checkLogin(String username, String passwd) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(passwd);
	driver.findElement(By.id("login-button")).click();
	driver.close();
	}

}
