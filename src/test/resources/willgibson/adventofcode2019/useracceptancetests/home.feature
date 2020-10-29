Feature: Getting the daily answers

  Scenario: Hitting the root URL
    When I visit the home page
    Then I see "Hello, all" in the text
