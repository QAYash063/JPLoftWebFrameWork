package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.action.CarsGuideHomePageActions;
import pages.action.UsedCarsSearchPageActions;
import utils.SeleniumDriver;

public class UsedCarSteps {
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	
	
	@And("click on {string} link on Used Search car Page")
	public void click_on_link_on_used_search_car_page(String usedCars) {
	    carsGuideHomePageActions.clickOnUsedCarMenu();
	}

	@And("select carbrand as {string} from AnyMake dropdown on Used Search car Page")
	public void select_carbrand_as_from_any_make_dropdown_on_used_search_car_page(String usedCarBrand) {
	
	    usedCarsSearchPageActions.selectCarMake(usedCarBrand);
		
	}

	@And("select car model on Used Search car Page")
	public void select_car_model_on_used_search_car_page(List<String> list) {
		String menu = list.get(1);
		System.out.println(menu);
	}

	@And("select location as {string} from SelectLocation dropdown on Used Search car Page")
	public void select_location_as_from_select_location_dropdown_on_used_search_car_page(String usedCarLocation) {
	   usedCarsSearchPageActions.selectCarLocation(usedCarLocation);
		
	}

	@And("select price as {string} from price dropdown on Used Search car Page")
	public void select_price_as_from_price_dropdown_on_used_search_car_page(String usedCarPrice) {
	    usedCarsSearchPageActions.selectCarPrice(usedCarPrice);
	}

	@And("click on Find My Next Car button on Used Search car Page")
	public void click_on_find_my_next_car_button_on_used_search_car_page() {
	    usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of used cars")
	public void i_should_see_list_of_used_cars() {
	   System.out.println("List is available for Used cars");
	   System.out.println(SeleniumDriver.getDriver().getTitle());
	}

	@And("the page title should be {string} on Used Search car Page")
	public void the_page_title_should_be_on_used_search_car_page(String expectedTitle) {
	    
	    String actualTitle =   SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	
	/*
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	
	//CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions(): 
	
	
	@And("click on {string} link on Used Search car Page")
	public void click_on_link(String usedCars) {
	  carsGuideHomePageActions.clickOnUsedCarMenu();
	}
	
	@And("select carbrand as {string} from AnyMake dropdown on Used Search car Page")
	public void select_carbrand_as_from_any_make_dropdown(String usedCarBrand) {
		usedCarsSearchPageActions.selectCarMaketion(usedCarBrand);
	    
	}

	@And("select car model on Used Search car Page")
	public void select_car_model(List<String> list) throws Throwable {
	  
		String menu = list.get(1);
		System.out.println(menu);
	}

	@And("select location as {string} from SelectLocation dropdown on Used Search car Page")
	public void select_location_as_from_select_location_dropdown(String carLocation) {
	   usedCarsSearchPageActions.selectCarLocation(carLocation);
	}

	@And("select price as {string} from price dropdown on Used Search car Page")
	public void select_price_as_from_price_dropdown(String carPrice) {
	    usedCarsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("click on Find My Next Car button on Used Search car Page")
	public void click_on_find_my_next_car_button() {
	    usedCarsSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of used cars")
	public void i_should_see_list_of_searched_cars() {
	    System.out.println("  Car List Found ");
	}

	@And("the page title should be {string} on Used Search car Page")
	public void the_page_title_should_be(String expectedTitle) {
	   
		String actualTitle =   SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}

	
*/
}
