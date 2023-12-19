package pages.action;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarsSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {
	
	   UsedCarsSearchPageLocators usedCarsSearchPageLocators = null;
	
	public UsedCarsSearchPageActions() {
		
		this.usedCarsSearchPageLocators = new UsedCarsSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarsSearchPageLocators);
		
	}
	
	public void selectCarMake(String usedCarBrand) {

		Select selectCarMaker = new Select(usedCarsSearchPageLocators.usedCarMakeDropDown);
		selectCarMaker.selectByVisibleText(usedCarBrand);

	}

	public void selectCarModel(String usedCarModel) {

		Select selectCarModel = new Select(usedCarsSearchPageLocators.usedCarModelsDropDown);
		selectCarModel.selectByVisibleText(usedCarModel);
	}

	public void selectCarLocation(String usedcarLocation) {

		Select selectCarLocation = new Select(usedCarsSearchPageLocators.selectUsedLocationDropDown);
		selectCarLocation.selectByVisibleText(usedcarLocation);
	}
	
	public void selectCarPrice(String usedCarPrice) {

		Select selectCarPrice = new Select(usedCarsSearchPageLocators.usedPriceDropDown);
		selectCarPrice.selectByVisibleText(usedCarPrice);
	}

	
	public void clickOnFindMyNextCarButton() {

		usedCarsSearchPageLocators.findMyNextUsedCarBtn.click();
	}

	
	

}
