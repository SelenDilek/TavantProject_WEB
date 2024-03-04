Feature: Relative Page functionality

@RegressionTest
  @SmokeTest
Scenario: Check that elements page navigate to correct page
Given Navigate to Tavant
And   Wait for a while
When Click the relevant page
Then Verify the title on the relative page