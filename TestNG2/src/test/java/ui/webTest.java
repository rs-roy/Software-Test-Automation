package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

//Hard assert

public class webTest {

	@Test
	public void homePageTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		String expectPageTitle = "Swag Labs"; // usually this comes from external source say CSV, not hard coding
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectPageTitle, "Page Title Verification");

		String expectedSubmitButtonText = "Login";
		String actualSubmitButtonText = driver.findElement(By.name("login-button")).getAttribute("value");
		Assert.assertEquals(actualSubmitButtonText, expectedSubmitButtonText, "Submit Button Text Verification");

		driver.close();

	}
}
