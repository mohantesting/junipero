
Feature: Verification_Mumbai
Scenario: Verify_the_result_for_Mumbai
Given User  should Launch Chrome browser 
When User opens  the URL "https://www.makemytrip.com/" 
Then Select location as Mumbai.
Then Search for Hotels in Mumbai.
And Verify whether the results are getting displayed for Mumbai Location.
