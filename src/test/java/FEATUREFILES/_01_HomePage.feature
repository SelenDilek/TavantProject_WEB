
Feature: Navigate functionality

  @SmokeTest
  Scenario: Navigate to Tavant web site as a guest
    Given Navigate to Tavant
    When  Click the Tavant button
    Then Verify guests should be on home page successfully



