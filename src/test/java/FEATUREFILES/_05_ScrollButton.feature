Feature: Scroll Button Functionality
  @SmokeTest
  Scenario: Scroll Button
    Given    Navigate to Tavant
    When     Click the Tavant button
    And      User click scroll button
    Then     Verify that text  is displayed
    When     User click to the search bar
    Then     User should clean up the bar
