Feature: As a user, I want to verify the different functionalities of the shop

  Background: The user enters shop and adds a product to the cart
    Given The user is on the page practice automation testing
    When the user enters shop
    And the user adds to basket Selenium Ruby
    And the user checks the cart price and clicks
    And the user can see the total values greater than the subtotal
    And click on the button proceed to check out that will take you to the payment page

  @Shop11
  Scenario Outline: Shop-Add to Basket-View Basket through Item link
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

  @Shop12
  Scenario Outline: Shop-Add to Basket-View Basket-Tax Functionality
    When selects the country <country1>
    And select another country <country2>
    Then the tax of India is 2 percent lower in relation to the other countries of 5 percent
    Examples:
      | country1 | country2  |
      | India    | Argentina |
