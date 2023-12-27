package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.InquirePageActions;
import utils.SeleniumDriver;

public class InquireFormSteps {

	InquirePageActions inquirePageActionSteps = new InquirePageActions();

	@Given("I am on the Home Page {string} of JPLoft website")
	public void i_am_on_the_home_page_of_jp_loft_website(String websiteURL) {
		
		SeleniumDriver.openPage(websiteURL);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("click on INQUIRE NOW link on dashboard Page")
	public void click_on_link_on_dashboard_page() {
		inquirePageActionSteps.clickOnInquireButton();
	}

	@And("enter {string} in your name field")
	public void enter_in_your_name_field(String setName) {
		inquirePageActionSteps.enterName(setName);
	}

	@And("enter {string} in your email field")
	public void enter_in_your_email_field(String setEmail) {
		inquirePageActionSteps.enterEmail(setEmail);
	}

	@And("enter {string} in phone number field")
	public void enter_in_phone_number_field(String setNumber) {
		inquirePageActionSteps.enterNumber(setNumber);
	}

	@And("select budget in iquire form")
	public void select_budget_in_iquire_form(List<String> list) {
		String menu = list.get(1);
		System.out.println(menu);
		inquirePageActionSteps.selectBudget(menu);
	}

	@And("enter {string} in Message field")
	public void enter_in_message_field(String setMessage) {
		inquirePageActionSteps.enterComment(setMessage);
	}

	@And("enter captcha result")
	public void enter_captcha_result() {
		String captchatext = SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='captch-input']//h6")).getText();
		//String captchatext = "100+20=";
		System.out.println(captchatext);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String num1 = "", num2 = "";
		int i, j;
		char x, y;
		for (i = 2; i <= captchatext.length(); i++) {

			x = captchatext.charAt(captchatext.length() - i);

			if (Character.isDigit(x)) {

				num1 = x + num1;

			} else {

				break;
			}

		}
		int value1 = Integer.parseInt(num1);

		for (j = i + 1; j <= captchatext.length(); j++) {

			y = captchatext.charAt(captchatext.length() - j);

			if (Character.isDigit(y)) {

				num2 = y + num2;

			} else {
				break;
			}

		}
		int value2 = Integer.parseInt(num2);

		int value3 = value1 + value2;
		String s = String.valueOf(value3);
		inquirePageActionSteps.enterCaptcha(s);
		System.out.println(s);
	}

	@And("click on submit button")
	public void click_on_submit_button() {
		inquirePageActionSteps.submitForm();
	}

	@Then("form should be submited")
	public void form_should_be_submited() {
		System.out.println("Form submited succesfully");
	}

	@And("validate title {string}")
	public void validate_title(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
