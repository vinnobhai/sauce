@All
Feature: Check Sign In Functionality

  @SignIn
  Scenario Outline: Validate the SignIn functionality
    Given Load the browser and open the url
    When Enter username "<username>" and password "<password>"
    And click the SignIn button
    Then open the profile page

    Examples: 
      | username                | password   |
      | vinod@12gmail.com       | vinno@123  |
      | patil12@gmail.com       | pattil@112 |
      | patilvinodp14@gmail.com | Vinod@123  |

  @Validate
  Scenario: Validate the the Profile details
    Given load the browser and open the url
    When enter the valid username and password
    And click on the SignIn button
    Then validate profile page
    And profile details which we entered

 