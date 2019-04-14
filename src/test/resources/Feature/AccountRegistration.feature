Feature: Account Creation

  @Register
  Scenario Outline: Register Account

    Given user on register account page
    When user enters "<FirstName>"
    And user  enters the "<LastName>"
    And user enters their "<PhoneNumber>"
    And  user enters their "<EmailAddress>"
    And user enters their "<Address>"
    And user enters their "<City>"
    And user enters their "<State>"
    And user enters their "<PostalCode>"
    And user  enters the "<Country>"
    And user enters their "<UserName>"
    And user enters their "<Password>"
    And user enters their "<Password>"
    Then user clicks submit


    Examples:
      | FirstName | LastName | PhoneNumber | EmailAddress          | Address          | City   | State    | PostalCode | Country       |UserName    |Password
      | John      | Michael  | 07723453456 | johnmicheal@yahoo.com | 1 Gardner Street | Dundee | Scotland | DD3 6RT    | UnitedKingdom | Jmicheal75 |Micheal1975






