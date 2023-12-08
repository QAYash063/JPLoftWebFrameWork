package steps;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario) {
		/*
		WebDriver driver = SeleniumDriver.getDriver();
		System.out.println(scenario.isFailed());
		if(scenario.isFailed()) {
			
			byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotBytes,"image/png","Bartholomew and the Bytes of the Oobleck");
		}
		*/
		////////////////////////////////////
		
		TakesScreenshot scrShot = (TakesScreenshot) SeleniumDriver.getDriver();
		Date date = new Date();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		String FileName = date.toString().replace(":", "_").replace(" ", "_") + ".png";
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(System.getProperty("user.dir") + "\\target\\ScreenShot\\" + FileName);
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String st = DestFile.toString();
		System.out.println(st);
		//test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+"Failed with exception : "+arg0.getThrowable());
		//Reporter.log("<a href=\"" + st + "\">Name of Screenshot</a>");
		//reo.endTest(test);
		//reo.flush();
		
		
		
		///////////////////////////////////
		
		SeleniumDriver.tearDown();
		
	}

}
