package ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo2Test {

	@Test
	public void example3() {
		System.out.println("### Output3 ###");
		Assert.assertTrue(true);
	}
	
	@Test(groups = {"regression"}) 
	public void example4() {
		System.out.println("### Output4 ###");
	}
}
