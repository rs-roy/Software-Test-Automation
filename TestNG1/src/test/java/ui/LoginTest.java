package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeClass
	public void startTest() {
		System.out.println("Tests execution started"); //once before all tests
	}
	
	@AfterClass
	public void endTest() {
		System.out.println("Tests execution finished"); //once after all tests
	}
	
	@BeforeMethod
	public void dbOnTest() {
		System.out.println("DB Connected");	//every time before a test
	}
	
	@AfterMethod
	public void dbOffTest() {
		System.out.println("DB DisConnected"); //every time after a test
	}
	
	@Test(priority = 3)
	public void logoutTest() {
		System.out.println("Logout ok");
	}
	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("Login ok");
	}
	
	@Test(priority = 2, description = "To add a comment")
	public void commentTest() {
		System.out.println("Comment");
	}
	
	public void faqTest() {
		System.out.println("FAQ");
	}

}
