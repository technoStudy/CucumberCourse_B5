Feature: OpenCart Search Function

  @Regression
  Scenario: Search for Mac
    Given User navigate to Opencart website
    When User search for "Mac" in OpenCart
    Then All the results in Opencart should be related to "Mac"

  @Regression
  Scenario: Search for Samsung
    Given User navigate to Opencart website
    When User search for "Samsung" in OpenCart
    Then All the results in Opencart should be related to "Samsung"

  @Smoke
  Scenario: Search for Sony
    Given User navigate to Opencart website
    When User search for "Sony" in OpenCart
    Then All the results in Opencart should be related to "Sony"