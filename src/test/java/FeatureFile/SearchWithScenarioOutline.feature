Feature: Search Function with Scenario Outline

#  Scenario Outline will execute same scenario with different data
  Scenario Outline: Search items in website
    Given User navigate to test website
    When User search for "<Item>" in test website
    Then User should see results for "<ResultItem>"


    Examples:
      | Item    | ResultItem      |
      | LG      | LG TVs          |
      | Iphone  | Apple phones    |
      | Samsung | Samsung Tablets |
      | Sony    | Sony Cameras    |