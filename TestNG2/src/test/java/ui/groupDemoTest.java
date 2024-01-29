package ui;

import org.testng.annotations.Test;

import setup.systemReady;

@Test(groups = "user-registration")
public class groupDemoTest extends systemReady{
	
	@Test(groups="regression")
	public void aTest()
	{
		System.out.println("First test");
}
	@Test(groups="smoke")
	public void bTest()
	{
		System.out.println("Second test");
}

	@Test(description = "payment", groups={"regression","smoke"})
	public void cTest()
	{
		System.out.println("Third test");
}

	@Test(groups={"progression", "smoke"})
	public void dTest()
	{
		System.out.println("Fourth test");
}

}