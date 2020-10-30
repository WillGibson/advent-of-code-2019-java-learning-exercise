@cucumber
Feature: Getting the daily answers

  Scenario: The home page shows all days by default
    When I visit the home page
    Then the page heading is "Will's Advent Of Code 2019 Answers For All Days"
    And the answers are shown for days 1 to 2

  Scenario Outline: Viewing a specific day
    When I visit the home page for day "<dayInput>"
    Then the page heading is "Will's Advent Of Code 2019 Answers For Day <dayDisplay>"
    And the answer is shown for day "<dayInput>"
    Examples:
      | dayInput | dayDisplay |
      | 01       | 01         |
      | 02       | 02         |
      | 2        | 02         |

  # Todo: Scenario for bad input
