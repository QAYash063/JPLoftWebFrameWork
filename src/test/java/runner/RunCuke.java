package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		plugin = {"json:target/RunCuke/cucumber.json","pretty","html:target/RunCuke/cucumber.html"},   //,"com.cucumber.listener.ExtentCucumberFormatter"
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@Positive-InquireForm"
		
		
		
		
		)
public class RunCuke extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	public static void setup() {
		
	/*	
		
		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
		ExtentCucumberFormatter.loadConfig(new File("src/test/resources/extent-config.xml"));
		
		ExtentCucumberFormatter.addSystemInfo("Browser Name","Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v120.0.6099.71");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.141.59");
	*/	
		
		// Initiates the extent report and generate the outputt
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extend_Reports\\"+strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		ExtentCucumberFormatter.loadConfig( new File("src/test/resources/extent-config.xml"));     //extent-config
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "v120.0.6099.71");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.141.59");
		
		
		Map systemInfo = new HashMap();
		systemInfo.put("Cucumber version", "v7.14.0");
		systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);
		
	}
	

}
