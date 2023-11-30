package lippia.web.steps;

import io.cucumber.java.en.And;
import lippia.web.services.*;

public class BasketSteps {

    @And("the user can see the total values greater than the subtotal")
    public void the_user_can_see_the_total_values_greater_than_the_subtotal() {
            BasketService.validatePriceBasket();
    }
    @And("click on the button proceed to check out that will take you to the payment page")
    public void click_on_the_button_proceed_to_check_out_that_will_take_you_to_the_payment_page() {
        BasketService.validatePriceBasket();
        BasketService.clickProceedToCheckOut();
    }


}
