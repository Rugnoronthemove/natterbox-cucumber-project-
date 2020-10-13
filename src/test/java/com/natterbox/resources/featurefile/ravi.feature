Feature:  Log in feature

  @Sanity
  Scenario: User should not Log in with invalid credential

    Given   I am on Home Page
    And     I click on Login link

  @Regression
  Scenario: User should not Log in with invalid credential

    Given   I am on Home Page
    And     I click on Login link