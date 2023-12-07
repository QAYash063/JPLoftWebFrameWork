@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine.
In order to validate that
the search cars page is working fine


@Search-Cars-Positive
Scenario: Validate search car page

Given I am on the Home Page "https://www.carsguide.com.au" of CarsGuide website
When I move to buy+sell menu
 And I move to sub-menu
 | Menu    |
 | Buy     |
 | Sell    |
 And click on "Search Cars" link
 And select carbrand as "BMW" from AnyMake dropdown
 And select carmodel as"1 SERIES" from SelectModel dropdown
 And select location as "NSW - Sydney" from SelectLocation dropdown
 And select price as "$80,000" from price dropdown
 And click on Find My Next Car button
Then I should see list of searched cars
 And the page title should be "BMW 1 Series Under 80,000 for Sale Sydney NSW | CarsGuide" 