Feature: User should be able to loginusing correct credentials
@wip2
  Background: user is on the login page
    Given user is on the login page of web table app

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders

  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders


    Scenario: User should be able to see all 12 months in month dropdown

    When User enters below credentials
      |username||Test|
      |password||Tester|
      Then user should see url contains orders
