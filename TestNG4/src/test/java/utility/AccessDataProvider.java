package utility;

import org.testng.annotations.DataProvider;

public class AccessDataProvider {

	// recommended style
	@DataProvider
	public Object[][] dataset1() 
	{
		return new Object[][]
		{
			{"standard_user", "secret_sauce"}
		};
	}
	
	// alternate style
	public Object[][] dataset2() 
	{
		return new Object[][]
		{
			{"Bangladesh", "Dhaka"},
			{"Germany", "Berlin"},
			{"Canada", "Toronto"}
			
		};
	}

}
