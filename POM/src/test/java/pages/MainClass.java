package pages;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		LandingPage lPage = new LandingPage(driver);
		lPage.clickLogin();
	}

}
