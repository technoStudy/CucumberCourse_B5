Feature: Login to web app

  Scenario: Login to website - Email Input
    Given Navigate to website
    When User enter email address
      | asdfytrsdfghjhg |
      | 876543456756776 |
      | @#^%$#!@#$%^&   |
      | JGFDFGHJGFHJKU  |
      | fghja@#$%^12345 |
    Then Close application