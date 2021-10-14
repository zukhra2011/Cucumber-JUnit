Feature: Etsy search feature

  Ticket Num AU756 --could be ticket number.

  Scenario: Etsy default title verification.
    Given User is on Etsy landing page
    Then User should see Etsy title as expected
    #expected: Etsy-Shop for handmade, vintage, custom and unique gifts for everyone

  @wipZukhra
  Scenario: Etsy Search Functionality Title Verification
   Given User is on Etsy landing page
    When User types Wooden spoon in the search bar
    And  User clicks to search button
    Then User sees title is Wooden spoon | Etsy
