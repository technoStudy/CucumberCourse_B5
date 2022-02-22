Feature: Search Functionality

  # All the steps in Background will get executed before each scenario
  # Background keyword works like @BeforeMethod annotation
  Background:
    Given User navigate to website
    And User go to search page

  @Regression
  Scenario: Search for Cucumber
    When User search for Cucumber
    Then All the results should be displayed for Cucumber

  @Smoke
  Scenario: Search for SDET
    When User search for SDET
    Then All the results should be displayed for SDET