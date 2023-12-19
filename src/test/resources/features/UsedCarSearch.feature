@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is working fine.
  In order to validate that
  the Used search cars page is working fine
  We will do the acceptance testing
#if you are free then let me know. We have to discuss client point.
  @Used-Search-Cars-Positive
  Scenario: Validate search car page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website
    When I move to buy+sell menu
 #   And I move to sub-menu
 #     | Menu |
 #     | Buy  |
 #     | Sell |
    And click on "Used Search Cars" link on Used Search car Page
    And select carbrand as "Kia" from AnyMake dropdown on Used Search car Page
    And select car model on Used Search car Page
    |  carModel |
    |Rio|
    |Picanto| 
    And select location as "SA - All" from SelectLocation dropdown on Used Search car Page
    And select price as "$50,000" from price dropdown on Used Search car Page
    And click on Find My Next Car button on Used Search car Page
    Then I should see list of used cars
    And the page title should be "Used Kia Rio Under 50,000 for Sale SA - Second Hand Kia Rio Under 50,000 in SA | CarsGuide" on Used Search car Page
