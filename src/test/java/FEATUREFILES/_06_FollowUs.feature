Feature: Relative Page functionality

  Background:
    Given Navigate to Tavant
    And   Wait for a while
    When Click the relevant page
    Then Verify the title on the relative page

  @SmokeTest
  Scenario: Clicking on follow us links
    And     User goes to the bottom of the page
    Then    Verify number of link
    When    User click the following links are displayed
    Then    User should verify that social media page is displayed

