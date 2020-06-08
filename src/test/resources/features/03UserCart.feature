Feature: User Cart Counter

  Background: Login to page
    Given login page is displayed
    When enter valid username and password credentials
    Then home page should be displayed

  @cleanCartPostCondition
  Scenario: Add product to the cart
    Given a search for "Lenovo Laptop" product
    When first item of search result is added to cart
    Then users's card should display "1" in items added counter

  @cleanCartPostCondition
  Scenario: Add different products to the cart
    Given a search for "Lenovo Laptop" product
    When first item of search result is added to cart
    And a search for "HP Laptop" product
    And first item of search result is added to cart
    Then users's card should display "2" in items added counter
