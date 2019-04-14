Feature: Login Acoount

  Scenario Outline: Login with valid details

    Given user on login homepage
    When  user enter thier "<username>"



    Examples:
    |username|
    |lucky |