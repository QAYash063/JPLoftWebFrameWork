package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarSearchPageActions {

	CarSearchPageLocators carSearchPageLocators = null;

	public CarSearchPageActions() {

		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);

	}

	public void selectCarMake(String carBrand) {

		Select selectCarMaker = new Select(carSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);

	}

	public void selectCarModel(String carModel) {

		Select selectCarModel = new Select(carSearchPageLocators.carModelsDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectCarLocation(String carLocation) {

		Select selectCarLocation = new Select(carSearchPageLocators.selectLocationDropDown);
		selectCarLocation.selectByVisibleText(carLocation);
	}
	
	public void selectCarPrice(String carPrice) {

		Select selectCarPrice = new Select(carSearchPageLocators.priceDropDown);
		selectCarPrice.selectByVisibleText(carPrice);
	}

	
	public void clickOnFindMyNextCarButton() {

		carSearchPageLocators.findMyNextCarBtn.click();
	}

}
