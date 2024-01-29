package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

//Soft assert

public class webTestSoftAssert {

	@Test
	public void homePageTest2() {
		SoftAssert softAssert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		String expectPageTitle = "Swag Labs TTT"; // usually this comes from external source say CSV, not hard coding
		String actualPageTitle = driver.getTitle();
		softAssert.assertEquals(actualPageTitle, expectPageTitle, "Page Title Verification");

		String expectedSubmitButtonText = "Login";
		String actualSubmitButtonText = driver.findElement(By.name("login-button")).getAttribute("value");
		softAssert.assertEquals(actualSubmitButtonText, expectedSubmitButtonText, "Submit Button Text Verification");

		driver.close();
		softAssert.assertAll(); // so that each pass/fail test is reported
	}

	@Test(groups = "regression")
	public void sampleTest() {
		System.out.println("sample");
	}
}
