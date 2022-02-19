Feature: Search Functionality w Scenario Outline

  Scenario Outline: Search Function with different data
    Given User navigate to Google.com
    When User search for "<SearchData>" in Google.com
    Then User should see results related to "<ResultItem>"


    Examples:
      | SearchData | ResultItem |
      | Mac        | Mac        |
      | Selenium   | Selenium   |
      | Intellij   | Intellij   |
      | Github     | Git        |