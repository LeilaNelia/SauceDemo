Feature: test checkout two
  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page
    And user clicks on a product link
    Then the product name should be displayed
    And user clicks on add to cart button
    Given user navigates to the "Cart"
    Given user clicks on the checkout button
    Then user should see the checkout information page
    And user Enter "leila", "delil","60171"
    And user clicks on the continue button
    And user should land in checkout step two page

Scenario:test checkout step two page
  And  user should see the checkout overview
  And the description should be visible
  And user clicks on a product link
  Then user should land in the inventory item page

  Scenario:
    And  user should see the checkout overview
    And the description should be visible
    And user clicks on the  finish button
  Then user should land ine the checkout complete page