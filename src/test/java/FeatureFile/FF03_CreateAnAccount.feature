Feature: Registration
  Scenario Outline: Creating an account with valid data
    Given user navigates to create an account screen
    Then enters valid "<FirstName>","<LastName>","<EmailAddress>"
    Examples:
    |FirstName|LastName|EmailAddress|
    |FirstName01|LastName01|EmailAddress02@gmail.com|
    |FirstName02|LastName02|EmailAddress02@gmail.com|
    |FirstName03|LastName03|EmailAddress03@gmail.com|
    |FirstName04|LastName04|EmailAddress04@gmail.com|