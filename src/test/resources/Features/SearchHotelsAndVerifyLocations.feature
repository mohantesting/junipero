Feature: HotelsVerification

  Scenario: Verify_the_results
    Given user navigate to makemytrip
    When user click on hotel
    And user search for location
    And user enter mumbai location
    And user select date
    And user search for hotel in mumbai
    Then user verify the result are getting displayed for mumbai location