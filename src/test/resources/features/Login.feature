@all
Feature: Library app login feature

User Story:
  As a user, I should be able to login with correct credentials to
  different account. And dashboard say:
  Account are:librarian, student, admin
  #comment
  Background: Assuming user on the login page
    Given User is on the login page
  @Librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
    @Student
Scenario: Login as a student
  When user enters student username
  And  user enters student password
  Then user should see the dashboard
      @Admin
  Scenario: Login as admin
    When use enters admin username
    And user enters admin password
    Then user should see the dashboard


Scenario:User search title verification
  Given User is on Google home page
  When User searches for "mango"
  Then User should see "mango" in the title



