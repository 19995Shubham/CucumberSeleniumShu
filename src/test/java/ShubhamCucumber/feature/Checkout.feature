Feature: Place the order for a product

  Scenario Outline: Search experience with both home and offer page
    Given User is on Greenkart landing page
    When  User searched with shortname <Name> and extracted actual result
    And   added 3 selected item into the cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
    |Name|
    |Tom |
    |Pot |
