Feature: Fruits Basket

  As a gardener
  I want to carry fruits in a basket
  So I should be able to add and remove fruits from basket

  Scenario: Add fruits to a basket
    Given the basket has "2" fruits
    When "4" apples are added to the basket
    Then the basket contains "6" fruits

  Scenario: Remove fruits from a basket
    Given the basket has "8" fruits
    When "7" fruits are removed from the basket
    Then the basket contains "1" fruit
