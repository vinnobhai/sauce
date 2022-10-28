Feature: Add New Customer Functionality
  I want to use this template for my feature file

  @Customer
  Scenario: Validate the customer Add and Remove Functionality
    Given load brow and hit url
    When click bank manager login
    And click add new customer
    When enter customer details and click add
    And click on customers
    Then validate the customer added or not
    When click on the delete button
    Then check for the customer is removed or not
