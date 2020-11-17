Feature:
  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

  Scenario: test Cart
And user should be able to add a product to the cart
Then user should see the remove button
And user navigates to the "Cart"
Then user should see the checkout button
And user clicks on the continue shopping button
Then user should land on the Inventory page
checking