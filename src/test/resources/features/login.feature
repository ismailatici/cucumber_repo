

@Regression @smoke @login
Feature: Library app login feature
  User story:
  As a user,I should be able to login with correct credentials to different accounts.And daschboard should be displayed.
  Accounts are :librarian, student, admin

  Background: for the scenarios in the feature file,user is expected to be on login page
    Given user is on the library login page


  @Librarian @employee
  Scenario: Login as librarian

    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student @db
    Scenario: Login  as student
      When  user enters student username
      And user enters student password
      Then user should see the dashboard

      @admin @employee
      Scenario: Login as admin
        When user enters admin username
        And user enters admin password
        Then user should see the dashboard


