Feature: Test Inventory item page

  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

Scenario: test if the user can add one item to the cart
  Given  all the products should be available
  And user clicks on a product link
  Then the product name should be displayed
  And user clicks on add to cart button
  Then user should see the remove button
  And user clicks on the go back button
  Then user should land on the Inventory page

  Scenario Outline: test if the user can add all the items to the cart
    Given all the products should be available
    And user clicks on a  "<product link>"
    Then the link should contain a specific "<Id>"
    And user clicks on add to cart button
    Then user should see the remove button
    And user clicks on the go back button
    Then user should land on the Inventory page
    Examples:
   | product link| Id|
    |Sauce Labs Backpack|id=4|
  |Sauce Labs Bolt T-Shirt|id=1|
  |Sauce Labs Onesie      |id=2     |
  |Sauce Labs Bike Light  |id=0  |
  |Sauce Labs Fleece Jacket|id=5|
  |Test.allTheThings() T-Shirt (Red)|id=3|
