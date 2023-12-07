Feature: Add a cart
  Scenario: Add a cart successfull in Alkosto page
    Given user open the browser and alkosto page
    When user search a product
    And add to cart two products and click to cart
    Then user can see two productos in the cart page