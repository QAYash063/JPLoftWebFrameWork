package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	//li[1]/a[@class='uhf-top']
	//*[contains(text(),'Search Cars')]
	

	//a//*[contains(text(),'Sell my car')]
	
	
	@FindBy(how=How.LINK_TEXT,using ="Buy + Sale")
	public WebElement buySaleLink;
	
	@FindBy(how=How.LINK_TEXT,using ="Reviews")
	public WebElement carReviewLink;
	
	@FindBy(how=How.LINK_TEXT,using ="News")
	public WebElement carNewsLink;
	
	@FindBy(how=How.LINK_TEXT,using ="Advice")
	public WebElement carAdviceLink;
	
	@FindBy(how=How.LINK_TEXT,using ="Pricing + Specs")
	public WebElement pricingSpecsLink;
	
	@FindBy(how=How.XPATH,using ="*//li//a[contains(text(),'Sell my car')]")
	public WebElement sellMyCarLink;
	
	// Buy + Sell sub menu = Search car
	
	@FindBy(how=How.XPATH,using ="//*[contains(text(),'Search Cars')]")
	public WebElement searchCarLink;
	
	@FindBy(how=How.LINK_TEXT,using ="Used Car")
	public WebElement usedCarLink;
	
	
}
