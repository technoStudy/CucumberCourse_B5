Feature: Login Function

  Scenario: Email and Password Input
    Given User navigate to login page
    When User enter email and password
      | test@technostudy.com    | 1234567890      |
      | admin@technostudy.com   | abcdefgh123     |
      | teacher@technostudy.com | qwerty123qwerty |
    Then User Logout