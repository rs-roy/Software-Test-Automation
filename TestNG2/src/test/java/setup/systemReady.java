package setup;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class systemReady {
	
	@BeforeSuite
	public void dataSetup()
	{
		System.out.println("Common data setup");
	}
	
	@AfterSuite
	public void dataTeardowns()
	{
		System.out.println("Common data cleanup");
	}

}
