package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InquirePageLocators {
	@FindBy(how=How.XPATH,using="//li[10]//button[@type='submit']")
	public WebElement inquireBtn;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Your Name *']")
	public WebElement yourName;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Your Email *']")
	public WebElement youremail;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Phone Number']")
	public WebElement yourNumber;
	
	@FindBy(how=How.XPATH,using="//select[@id='bottombudget']")
	public WebElement selectBudget;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='comment']")
	public WebElement enterMessage;
/*	
	@FindBy(how=How.XPATH,using="//input[@id='footer-file']")
	public WebElement addFile;
*/	
	@FindBy(how=How.XPATH,using="//input[@id='captcha-math']")
	public WebElement enterCaptcha;
	
	@FindBy(how=How.XPATH,using="//button[@id='top-footer-submit']")
	public WebElement submitInquireForm;


}
