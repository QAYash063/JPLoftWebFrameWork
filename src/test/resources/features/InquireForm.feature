@Positive-InquireForm
Feature: Acceptance testing to validate Inquire Form page is working fine.

@Valid-Data
Scenario: Validate Inquire form

Given I am on the Home Page "https://www.jploft.com/" of JPLoft website

When click on INQUIRE NOW link on dashboard Page
And enter "test" in your name field
And enter "test@yopmail.com" in your email field
And enter "9879879879" in phone number field
And select budget in iquire form
|    Budget     |
| $5000-$10000  |
| $20000-$35000 |
And enter "Testing message" in Message field
And enter captcha result
And click on submit button
Then form should be submited
And validate title "JPLoft: Top Website And Mobile App Development Company"