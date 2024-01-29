package utility;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends TestUtils implements ITestListener{

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " Test Failed");  
		try {
			captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
