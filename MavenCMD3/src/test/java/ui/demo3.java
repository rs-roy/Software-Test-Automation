package ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo3 {

	@Test(groups = {"regression"})
	public void example5() {
		System.out.println("### Output5 ###");
		Assert.assertTrue(true);
	}
	
	@Test(groups = {"regression"}) 		// mentioning test group
	public void example6() {
		System.out.println("### Output6 ###");
	}
}
