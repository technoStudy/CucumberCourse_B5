Feature: Google Search Function

  Scenario: Google Search for Cucumber
    Given User navigate to Google website
    When User search for "Cucumber" in Google
    Then User should see "Cucumber" results in Google


  Scenario: Google Search for Apple
    Given User navigate to Google website
    When User search for "Apple" in Google
    Then User should see "Apple" results in Google


  Scenario: Google Search for Java
    Given User navigate to Google website
    When User search for "Java" in Google
    Then User should see "Java" results in Google