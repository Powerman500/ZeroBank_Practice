Feature: As a user , I should be able to write and sent the feedback to the system.

// Thank you for your comments, {your name}.
// They will be reviewed by our Customer Service staff and given the full attention that they deserve.

  Background: User already in login page
    Given I am on the login page
    When I login as a user

    @feedback
    Scenario: Display the reply when submit feedback successfully
      When  user write the feedback info correctly and submit it
      Then  success submit reply will be display