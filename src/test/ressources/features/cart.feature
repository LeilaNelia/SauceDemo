Feature:test cart
  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page
    Given  all the products should be available
    And user clicks on a product link
    Then the product name should be displayed
    And user clicks on add to cart button

  Scenario: test if the user can proceed to the inventory item Page
   And user navigates to the "Cart"
    Then the product name should be displayed
    And cart badge should be displayed
    And the remove button is working
    Then user clicks on the checkout button
    Then user should land in the checkout step one page


    Scenario:test if user can go back to shopping from the cart page
      And user navigates to the "Cart"
      Then the product name should be displayed
      And cart badge should be displayed
      And user clicks on the continue shopping button
      Then user should land on the Inventory page


