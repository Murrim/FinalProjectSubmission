Feature: I want to test webelements from training and services page in Osa home page
 @integration @regression @smoke
  Scenario: Testing for training and services page elements
    Given I will open the browser
    And I will click on osa homePage
    And I will move to training page
    And I will varify the training page title
    And I will test elements under training page
    And I come back to homePage
    When I click on servives page
    And I test webelements under services page
    Then I varifry the serices page title
    And I will close the browser
