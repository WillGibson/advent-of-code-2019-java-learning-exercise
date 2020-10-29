@cucumber
Feature: Getting the daily answers

  Scenario: The home page shows all days by default
    When I visit the home page
    Then the page heading is "Will's Advent Of Code 2019 Answers For All Days"

  Scenario Outline: Viewing a specific day
    When I visit the home page for day "<dayInput>"
    Then the page heading is "Will's Advent Of Code 2019 Answers For Day <dayDisplay>"
    Examples:
      | dayInput | dayDisplay |
      | 01       | 01         |
      | 02       | 02         |
      | 2        | 02         |

