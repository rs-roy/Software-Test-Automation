package ui;

import org.testng.annotations.DataProvider;

public class LoginDataProvider {

	// recommended style
	@DataProvider
	public Object[][] dataset1() 
	{
		return new Object[][]
		{
			{"standard_user", "secret_sauce"},
			{"locked_out_user", "secret_sauce"},
			{"problem_user", "secret_sauce"}
		};
	}
	
	// alternate style
	@DataProvider
	public Object[][] dataset2() 
	{
		Object[][] logindata = new Object[3][2]; //like a table, 3 rows, 2 columns
		
		logindata[0][0]="standard_user";
		logindata[0][1]="secret_sauce";
		logindata[1][0]="locked_out_user";
		logindata[1][1]="secret_sauce";
		logindata[2][0]="problem_user";
		logindata[2][1]="secret_sauce";
		
		return logindata;
	}

}
