
Feature: Verify_the_Amount

  
  Scenario: Verify_the_Amount_in_Flight 
    Given User Launch Chrome browser
    When User opens URL "https://www.makemytrip.com/"
    When Search for Flight from Mumbai to Delhi
    When Select Departure date of tommorow
    When Select Non Stop from Stops from Mumbai option
    When Select 6AM-12PM in Departure from Mumbai option
    When Click on the view prices button of the airline which show the lowest price value
    When Select the Book now button which has the lowest value from the options available
    And user enter travellerdetails
    Then verify amount

