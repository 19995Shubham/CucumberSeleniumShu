Feature: Search and place order for a product

  @SearchOrder
  Scenario: Search experience with both home and offer page
    Given User is on Greenkart landing page
    When  User searched with shortname Tom and extracted actual result
    Then User searched for the same shortname in offers page to check if product is exist
    Then Validate productName matches the offerPage with landingPage

  @SearchOrder

  Scenario Outline: CheckOut Scenario
    Given User is on Greenkart landing page
    When  User searched with shortname <Name> and extracted actual result
    And   added 3 selected item into the cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
      |Name|
      |Cuc |


