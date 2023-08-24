package genricUtilityorLibrary;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImplementation implements ITestListener{

	@Override
	public void onTestStart(ITestResult result)
	{
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName + "Execution Starts");
		

	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName + "Execution Fails");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName + "Execution Failure");
		TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\"+ MethodName +".png");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		Reporter.log(MethodName + "Execution Skipped");
	}

}
