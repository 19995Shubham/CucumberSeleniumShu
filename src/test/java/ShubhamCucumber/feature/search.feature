Feature: Search and place order for a product

  Scenario: Search experience with both home and offer page
    Given User is on Greenkart landing page
    When  User searched with shortname Tom and extracted actual result
    Then User searched for the same shortname in offers page to check if product is exist
    Then Validate productName matches the offerPage with landingPage
