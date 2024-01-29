package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skipDemoTest {

	int current_balance = 0;

	@Test
	public void xTest() {
		System.out.println("running x");
	}

	@Test(enabled = false)
	public void yTest() {
		System.out.println("running y");
	}

	@Test
	public void zTest() {
		if (current_balance > 0)
		{
			System.out.println("running z");
		}
		else 
		{
			throw new SkipException("Not enough balance to test");
		}
	}

}
