package steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	
	@Before("@Search-Cars")
	public static void setUp() {
		
		SeleniumDriver.setUpDriver();
		
	}

}
