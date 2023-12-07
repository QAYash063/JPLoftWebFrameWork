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
		plugin = {"json:target/RunCuke/cucumber.json","pretty","html:target/RunCuke/cucumber.html"},
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@Search-Cars"
		
		
		
		)
public class RunCuke extends AbstractTestNGCucumberTests{
	
	@BeforeClass
	public static void setup() {
		
		// Initiates the extent report and generate the outputt
		
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = System.getProperty("user.dir")+"\\target\\Extend_Reports\\"+strDate+".html";
		File newFile = new File(fileName);
		ExtentCucumberFormatter.initiateExtentCucumberFormatter(newFile,false);
		ExtentCucumberFormatter.loadConfig( new File("src/test/resources/extent-config.xml"));
		ExtentCucumberFormatter.addSystemInfo("Browser Name", "Chrome");
		ExtentCucumberFormatter.addSystemInfo("Browser version", "119.0.6045.200");
		ExtentCucumberFormatter.addSystemInfo("Selenium version", "3.141.59");
		
		
		Map systemInfo = new HashMap();
		systemInfo.put("Cucumber version", "v7.14.0");
		systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
		ExtentCucumberFormatter.addSystemInfo(systemInfo);
		
	}
	

}
