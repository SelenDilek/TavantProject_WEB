Feature: Tool Bar Functionality

  @SmokeTest
  Scenario: Check that main elements on ToolBar are displayes
    Given Navigate to Tavant
    When  Mouseover the elements on toolbar
    And   Wait for a while
    Then Verify the home page toolbar displays successfully

@SmokeTest
  Scenario: Check that main elements on ToolBar are clickable
    Given Navigate to Tavant
    And   Wait for a while
    Then Verify the home page toolbar elements are clickable


