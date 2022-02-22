Feature: Login Function with Data Table

  Scenario: Test email input
    Given Navigate to demoWebShop
    When User enter invalid email address
      | 1234567      |
      | ghsjdfjsd    |
      | #$%^&        |
      | dshfsj@#$232 |
    Then User should see a warning