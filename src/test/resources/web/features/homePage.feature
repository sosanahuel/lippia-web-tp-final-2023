Feature: As a user, I want to verify that all the fields to place an order are correct

  Background: The user enters and adds a product to the cart
    Given The user is on the page practice automation testing
    When the user enters shop and returns to home
    And the home page has only three arrivals
    And the user selects Arrival Selenium Ruby and adds to basket
    And the user sees the quantity and price of the product in the menu and click on basket
    And the user can see the total values greater than the subtotal
    And click on the button proceed to check out that will take you to the payment page

  @HomePageVerifyPayment @Smoke
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway
    Then the user can see billing details your order additional details and payment gateway details
    And the user can complete the form billing and choose <payment method>
      | firstName   | Nahuel                |
      | lastName    | Sosa                  |
      | companyName | Crowdar S.A.          |
      | email       | nahuel_sosa@gmail.com |
      | phone       | +5437945508223        |
      | country     | Argentina             |
      | adress      | Avenida siempre viva  |
      | apartment   | 16                    |
      | town        | Corrientes            |
      | state       | Corrientes            |
      | postCode    | 3400                  |
    And validate if you can add coupon also if you find billing order and additional details
    Examples:
      | payment method       |
      | Direct Bank Transfer |

  @HomePageCompleteBuy
  Scenario Outline: Home-Arrivals-Add to Basket-Items-Check-out-Payment Gateway-Place order
    Then the user can see billing details your order additional details and payment gateway details
    And the user can complete the form billing and choose <payment method>
      | firstName   | Nahuel                |
      | lastName    | Sosa                  |
      | companyName | Crowdar S.A.          |
      | email       | nahuel_sosa@gmail.com |
      | phone       | +5437945508223        |
      | country     | Argentina             |
      | adress      | Avenida siempre viva  |
      | apartment   | 16                    |
      | town        | Corrientes            |
      | state       | Corrientes            |
      | postCode    | 3400                  |
    And validate if you can add coupon also if you find billing order and additional details
    And the user clicks on the button place order
    And validate our bank details and order details
    Examples:
      | payment method       |
      | Direct Bank Transfer |

