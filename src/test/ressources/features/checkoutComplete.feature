Feature: checkout complete page
  Background:
    Given user is on the sauceDemo LoginPage
    And user logs in with "standard_user","secret_sauce"
    Then user should land on the Inventory page
    Given user navigates to the "Cart"
    Given user clicks on the checkout button
    Then user should see the checkout information page
    And user Enter "leila", "delil","60171"
    And user clicks on the continue button
    And user should land in checkout step two page
    And user clicks on the  finish button
    Then user should land ine the checkout complete page


  Scenario: test checkout complete page
    Given user should land ine the checkout complete page
    And user should see the thank you message
    And user navigates to the "Cart"
    Then user should lan in the cart page

    Scenario: user navigates to the menu from checkout complete page
      Given user should land ine the checkout complete page
      And user should see the thank you message
      And  user opens the menu
      Then user navigates to "Logout"
      Then  user is on the sauceDemo LoginPage

