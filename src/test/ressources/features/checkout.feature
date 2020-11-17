Feature: Test Inventory page

  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

  Scenario: test Checkout
    Given user navigates to the "Cart"
    And user should click on the checkout button
    Then user should see the checkout information page
    And user Enter "leila", "delil","60171"
    And user should click on the continue button
    Then user should see the checkout overview
    And user clicks on the  finish button
    Then user should see the thank you message
    test