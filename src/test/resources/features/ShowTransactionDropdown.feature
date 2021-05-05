Feature:  As a use, I should be able to check different account functions.

  Background: User already in login page
    Given I am on the login page
    When I login as a user

  @transaction
  Scenario: Show transaction dropdown verification
    When I click the transaction dropdown
    Then All the select options should be show
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
