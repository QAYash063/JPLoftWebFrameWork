package steps;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.action.CarSearchPageActions;
import pages.action.CarsGuideHomePageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {

	
	
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	
	CarSearchPageActions carSearchPageActions = new CarSearchPageActions();
	
	@Given("I am on the Home Page {string} of CarsGuide website")
	public void i_am_on_the_home_page_of_cars_guide_website(String websiteURL) {
	    
		SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to buy+sell menu")
	public void i_move_to_buy_sell_menu() {
	    
		carsGuideHomePageActions.moveToBuySellMenu();
	}

	@And("I move to sub-menu")
	public void i_move_to_sub_menu(List<String> list) {
	    String menu = list.get(1);
	    System.out.println("Menu selected is : "+menu);
	    carsGuideHomePageActions.moveToSellMyCarMenu();
	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) {
	  carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("select carbrand as {string} from AnyMake dropdown")
	public void select_carbrand_as_from_any_make_dropdown(String carBrand) {
		carSearchPageActions.selectCarMake(carBrand);
	    
	}

	@And("select carmodel as {string} from SelectModel dropdown")
	public void select_carmodel_as_series_from_select_model_dropdown(String carModel) {
	   carSearchPageActions.selectCarModel(carModel);
	}

	@And("select location as {string} from SelectLocation dropdown")
	public void select_location_as_from_select_location_dropdown(String carLocation) {
	   carSearchPageActions.selectCarLocation(carLocation);
	}

	@And("select price as {string} from price dropdown")
	public void select_price_as_from_price_dropdown(String carPrice) {
	    carSearchPageActions.selectCarPrice(carPrice);
	}

	@And("click on Find My Next Car button")
	public void click_on_find_my_next_car_button() {
	    carSearchPageActions.clickOnFindMyNextCarButton();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
	    
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String string) {
	   
	}

	
}
