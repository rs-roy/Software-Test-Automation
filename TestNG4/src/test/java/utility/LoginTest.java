package utility;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.By;


public class LoginTest extends BaseClass {

	@Parameters({ "url" }) // From Suite complete.xml
	@Test(priority = 1)
	public void checkTitle(String url) {
		driver.get(url);
		String actualPageTitle = driver.getTitle();
		String expectPageTitle = "Swag Labs";
		Assert.assertEquals(actualPageTitle, expectPageTitle);
	}
	
	@Test(priority = 2, description = "login with valid user", dataProvider = "dataset1", dataProviderClass = AccessDataProvider.class)
	public void checkLogin(String uname, String passwd) {
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("login-button")).click();
		
		Assert.assertTrue(false); // forcefully failing this method to test screenshot
	}
	
	@Test(description = "logout", dependsOnMethods = "checkLogin")
	public void checkLogout() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Assert.assertTrue(true);
	}	
}
