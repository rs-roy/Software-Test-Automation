package ui;

import org.testng.annotations.DataProvider;

public class EmployeeDataProvider {
	
	@DataProvider(name="devEmployee")
	public Object[][] employee()
	{
		return new Object[][]
		{
			{"rahim", "dhaka", 1000},
			{"karim", "sylhet", 2000},
			{"torim", "barishal", 3000}
		};
	}
}
