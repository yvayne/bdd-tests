Feature: Calculator basic functions

  Scenario Outline: Operations between two numbers
    Given calculator is opened
    When "<a>" number is entered into calc
    And press "<operation>" button
    And also "<b>" number is entered into calc
    And press equals
    Then the result should be "<result>" on the screen

    Examples:
      | a | operation | b | result |
      | 1 | +         | 2 | 3      |
      | 3 | -         | 2 | 1      |
      | 9 | *         | 9 | 81     |
      | 9 | /         | 3 | 3      |
