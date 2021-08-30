
Feature: Verification_Amount
Scenario: Verify_total_Amount_displayed.
Given User Launch Chrome browser 
When User opens URL "https://www.makemytrip.com/" 
And Search for Flight from Mumbai to Delhi
And Select Departure date of tommorow
And Select Non Stop from Stops from Mumbai option
And Select 6AM-12PM in Departure from Mumbai option
And Click on the view prices button of the airline which show the lowest price value
And Select the Book now button which has the lowest value from the options available
And Enter the passenger detail and select the secure my trip checkbox
Then Confirm the passenger and capture the Total Amount Displayed on Fare Summary detail.
And Verify that the value that was appearing on the previous page and review detail page

Scenario: Verify_the_result_for_Mumbai
Given User  should Launch Chrome browser 
When User opens  the URL "https://www.makemytrip.com/" 
Then Select location as Mumbai.
Then Search for Hotels in Mumbai.
And Verify whether the results are getting displayed for Mumbai Location.
