Feature:Examples of Cucumber data table implementations

  Scenario: Something happens
    #Given user does something
    Then User should see below words displayed
      | Apples     |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |
      | Cucumber   |
    #putting the rows in order Command+option+L
  @wip
Scenario: Library login example using data table
  Given User is on the login page of library app
   When  User enters username and password
  |username|librarian13@library|
  |password|myrandompassword       |
  Then User should see title is something