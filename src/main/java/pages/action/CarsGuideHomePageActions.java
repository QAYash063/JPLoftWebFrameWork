package pages.action;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {

	CarsGuideHomePageLocators carsGuideHomePageLocators =null;
	
	public CarsGuideHomePageActions() {
		
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}
	
	public void moveToBuySellMenu() {
		
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buySaleLink).perform();
		
	}
	
	
	//    moveToBuySellMenu
	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCarLink.click();
		
	}
	
	//     moveToBuySellMenu
	public void clickOnUsedCarMenu() {
		carsGuideHomePageLocators.usedCarLink.click();;
	}
	
	public void moveToSellMyCarMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.sellMyCarLink).perform();
	}
	
}
