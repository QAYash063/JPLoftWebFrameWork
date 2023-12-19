package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsGuideHomePageLocators {
	
	//li[1]/a[@class='uhf-top']
	//*[contains(text(),'Search Cars')]
	

	//a//*[contains(text(),'Sell my car')]
	
	
	@FindBy(how=How.LINK_TEXT,using ="buy + sell")
	public WebElement buySaleLink;
	
	@FindBy(how=How.XPATH,using ="//li[2]//a[@class='uhf-top']")
	public WebElement carReviewLink;
	
	@FindBy(how=How.XPATH,using ="//li[3]//a[@class='uhf-top']")
	public WebElement carNewsLink;
	
	@FindBy(how=How.XPATH,using ="//li[4]//a[@class='uhf-top']")
	public WebElement carAdviceLink;
	
	@FindBy(how=How.LINK_TEXT,using ="pricing + specs")
	public WebElement pricingSpecsLink;
	
	@FindBy(how=How.XPATH,using ="*//li//a[contains(text(),'Sell my car')]")
	public WebElement sellMyCarLink;
	
	// Buy + Sell sub menu = Search car
	
	@FindBy(how=How.XPATH,using ="//*[contains(text(),'Search Cars')]")
	public WebElement searchCarLink;
	
	@FindBy(how=How.XPATH,using ="//div[@class='uhf-child-menu'][1]//a[contains(text(),'Used')][1]")
	public WebElement usedCarLink;
	
	
}
