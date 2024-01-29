package demo1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("Reports/MyReport.html");
		extent.attachReporter(spark);
		
		extent.createTest("MyFirstTest").log(Status.PASS, "Logging event for MyFirstTest, and it passed!");
		extent.createTest("MySecondTest").log(Status.FAIL, "Another logging event for MySecondTest, and it failed!");
		extent.createTest("MyThirdTest").log(Status.SKIP, "Final logging event for MyThirdTest, and it skipped!");
		
		extent.flush(); // this is mandatory, otherwise test won't be reported
		System.out.println("Report created");
	}

}
