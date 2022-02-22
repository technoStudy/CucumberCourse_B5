Feature: Login to web app

#  Data Tables
#     We use data tables to run a step in a scenario multiple times with different data
#     We use scenario outline to run a scenario multiple times with different data

  Scenario: Login to website - Email Input
    Given Navigate to website
    When User enter email address
      | asdfytrsdfghjhg |
      | 876543456756776 |
      | @#^%$#!@#$%^&   |
      | JGFDFGHJGFHJKU  |
      | fghja@#$%^12345 |
    Then Close application