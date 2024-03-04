Feature: Search Bar functionality
  @SmokeTest
  Scenario: Functionality of Search Bar Button
    Given    Navigate to Tavant
    When     Click the Tavant button
    When     User click to the search bar
    Then    User sends to "Software Testing" text to the bar
    When    User click submit button
    Then    User should verify that number of link is displayed below
