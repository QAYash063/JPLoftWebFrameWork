package pages.action;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.InquirePageLocators;
import utils.SeleniumDriver;

public class InquirePageActions {

	InquirePageLocators inquirePageLocations = null;

	public InquirePageActions() {
		this.inquirePageLocations = new InquirePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), inquirePageLocations);
	}

	public void clickOnInquireButton() {
		inquirePageLocations.inquireBtn.click();
	}

	public void enterName(String name) {
		inquirePageLocations.yourName.sendKeys(name);
	}

	public void enterEmail(String email) {
		inquirePageLocations.youremail.sendKeys(email);
	}

	public void enterNumber(String number) {
		inquirePageLocations.yourNumber.sendKeys(number);
	}

	public void selectBudget(String budget) {
		Select selectCarLocation = new Select(inquirePageLocations.selectBudget);
		selectCarLocation.selectByVisibleText(budget);
	}

	public void enterComment(String message) {
		inquirePageLocations.enterMessage.sendKeys(message);
	}
/*
	public void addFile() {
		
	}
*/
	public void enterCaptcha(String captcha) {
		inquirePageLocations.enterCaptcha.sendKeys(captcha);
	}

	public void submitForm() {
		inquirePageLocations.submitInquireForm.click();
	}
	
}
