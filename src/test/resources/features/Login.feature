Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials to
  different account. And dashboard say:
  Account are:librarian, student, admin
  @wip
  Scenario: Login as librarian
   Given User is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard


