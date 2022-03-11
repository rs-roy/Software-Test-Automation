package ui;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1Test {

	@Test
	public void example1() {
		System.out.println("### Output1 ###");
		Assert.assertTrue(true);
	}
	
	@Test
	public void example2() {
		System.out.println("### Output2 ###");
	}
}
