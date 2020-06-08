Feature: Add students

  As a user
  I want to add students to school registry
  So I can add students successfully

  @cleanupStudentsRegistry
  Scenario: Add student to school registry
    Given a new student is created with the following information
      | name     | Walter |
      | lastname | White  |
      | age      | 21     |
    When new student is added to school registry
    Then school registry should contain new student information
