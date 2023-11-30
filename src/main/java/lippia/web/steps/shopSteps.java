package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.CheckOutService;
import lippia.web.services.MenuService;
import lippia.web.services.ShopService;

public class shopSteps {

    @When("the user enters shop")
        public void the_user_enters_shop() {
        MenuService.clickShopMenu();
    }

    @And("the user adds to basket Selenium Ruby")
    public void the_user_adds_to_basket_Selenium_Ruby() throws InterruptedException {
        ShopService.addBookBasket();
    }

    @And("the user checks the cart price and clicks")
    public void the_user_checks_the_cart_price_and_clicks() throws InterruptedException {
        ShopService.comparePriceBooks();
        ShopService.clickBasketShop();
    }

    @When("selects the country (.*)")
    @And("select another country (.*)")
    public void selects_the_country(String pais) throws InterruptedException {
        CheckOutService.savePriceBook();
        CheckOutService.selectCountry(pais);
        CheckOutService.savePriceTax(pais);
    }
    @Then("the tax of India is 2 percent lower in relation to the other countries of 5 percent")
    public void the_tax_of_India_is_2_percent_lower_in_relation_to_the_other_countries_of_5_percent(){
        ShopService.compareAmountTax();
    }



}
