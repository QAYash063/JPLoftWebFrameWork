@Used-Search-Cars
Feature: Acceptance testing to validate Used Search cars page is working fine.
  In order to validate that
  the Used search cars page is working fine
  We will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate search car page
    Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website
    When I move to buy+sell menu
    And I move to sub-menu
      | Menu |
      | Buy  |
      | Sell |
    And click on "Used Search Cars" link
    And select carbrand as "Audi" from AnyMake dropdown
    And select carmodel as "A4" from SelectModel dropdown
    And select location as "SA - All" from SelectLocation dropdown
    And select price as "$50,000" from price dropdown
    And click on Find My Next Car button
    Then I should see list of searched cars
    And the page title should be "Used Audi Under 50,000 for Sale SA - Second Hand Audi Under 50,000 in SA | CarsGuide"
