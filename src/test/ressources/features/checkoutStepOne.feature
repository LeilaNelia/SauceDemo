Feature: test checkoutOne
  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page
    Given user navigates to the "Cart"

    Scenario: test checkout step one with valid information
      Given user clicks on the checkout button
      Then user should see the checkout information page
      And user Enter "leila", "delil","60171"
      And user clicks on the continue button
      And user should land in checkout step two page


      Scenario: test checkout step one with empty
        Given user clicks on the checkout button
        Then user should see the checkout information page
        And user Enter "", "",""
        And user clicks on the continue button
        Then user should see the error message
        And the cancel button is working
        Then user should lan in the cart page
