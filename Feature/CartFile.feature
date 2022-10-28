
Feature: validate the cart functionality

 @Cart
  Scenario: Validate Cart Functionality and Buy that product
    Given load the browser and open the url site
    When search for product 
    And add the product to cart and Proceed to checkout
    Then sign in the acccount and  Proceed to checkout
    When terms of service accept it and Proceed to checkout
    Then select the payment mode and do confirm order
    And validate order confirmation

