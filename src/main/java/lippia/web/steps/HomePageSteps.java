package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.MenuService;
import lippia.web.services.ShopService;

public class HomePageSteps {

    @Given("The user is on the page practice automation testing")
    public void the_user_on_the_page_practice_automationtesting() {
        HomeService.navegateWeb();
    }

    @When("the user enters shop and returns to home")
    public void the_user_enters_shop_and_returns_to_home() {
        MenuService.clickShopMenu();
        ShopService.clickHomeMenuButton();
    }
    @And("the home page has only three arrivals")
    public void the_home_page_has_only_three_arrivals(){
        HomeService.arrivalsHomePage();
    }

    @And("the user selects Arrival Selenium Ruby and adds to basket")
    public void the_user_selects_arrival_selenium_ruby_and_adds_to_basket() throws InterruptedException {
        HomeService.clickFirstArrival();
        HomeService.clickAddToBasket();
    }
    @And("the user sees the quantity and price of the product in the menu and click on basket")
    public void the_user_sees_the_quantity_and_price_of_the_products_in_the_menu_and_enters_on_basket() throws InterruptedException {
        HomeService.itemPrice();
        HomeService.clickBasket();
    }

}
