package ui;

import org.testng.annotations.Test;

public class SalaryTest {
	
	@Test(enabled = false, dataProvider =  "devEmployee", dataProviderClass = EmployeeDataProvider.class)
	public void showSalary(String name, int salary)
	{
		System.out.println("Name: " +name+ " Salary: " +salary);
	}
	
	@Test(dataProvider = "devEmployee", dataProviderClass = EmployeeDataProvider.class)
	public void showAll(String name, String city, int salary)
	{
		System.out.println("Name: " +name+" City: " +city+" Salary: " +salary);
	}
}
