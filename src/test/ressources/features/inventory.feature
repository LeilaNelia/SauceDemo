Feature: Test Inventory page

  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page

  Scenario: Test the navigation menu
    #And the navigation menu should be visible
    Then user opens the menu
    And user navigates to "All Items"
    Then all the products should be available

  Scenario: Test sorting products
    And sort by "Price (low to high)"
    And the first listed product should be "Sauce Labs Onesie"
    And sort by "Price (high to low)"
    And the first listed product should be "Sauce Labs Fleece Jacket"


  Scenario: test Cart
    And user should be able to add a product to the cart
    Then user should see the remove button
    And user navigates to the "Cart"
    Then user should see the checkout button
    And user clicks on the continue shopping button
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

  Scenario: test the logout
    Given user should land on the Inventory page
    And user opens the menu
    And user navigates to "Logout"
    Then user is on the sauceDemo LoginPage