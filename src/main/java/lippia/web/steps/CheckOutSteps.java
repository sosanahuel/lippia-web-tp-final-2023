package lippia.web.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.CheckOutService;

import java.awt.*;

import java.util.Map;

public class CheckOutSteps {
    @Then("the user can see billing details your order additional details and payment gateway details")
    public void the_user_can_see_billing_details_your_order_additional_details_and_payment_gateway_details() {
        CheckOutService.billingTable();
        CheckOutService.orderTable();
        CheckOutService.infoTable();
        CheckOutService.paymentTable();
    }
    @And("the user can complete the form billing and choose (.*)")
    public void the_user_can_complete_the_form_billing_and_choose_payment_method(String paymentMethod, DataTable dataTable) throws InterruptedException {
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        CheckOutService.enterFirstName(map.get("firstName"));
        CheckOutService.enterLastName(map.get("lastName"));
        CheckOutService.companyName(map.get("companyName"));
        CheckOutService.emailName(map.get("email"));
        CheckOutService.phone(map.get("phone"));
        CheckOutService.selectCountry(map.get("country"));
        CheckOutService.adress(map.get("adress"));
        CheckOutService.apartament(map.get("apartment"));
        CheckOutService.town(map.get("town"));
        CheckOutService.selectState(map.get("state"));
        CheckOutService.postcode(map.get("postCode"));

        CheckOutService.clickBankTransfer(paymentMethod);
    }
    @And("validate if you can add coupon also if you find billing order and additional details")
    public void validate_if_you_can_add_coupon_also_if_you_find_billing_order_and_additional_details() throws AWTException, InterruptedException {
        CheckOutService.linkCoupon();
        CheckOutService.inputCoupon();
        CheckOutService.buttonCoupon();
    }
    @And("the user clicks on the button place order")
    public void the_user_clicks_on_the_button_place_order() throws InterruptedException {
        CheckOutService.clickPlaceOrder();
    }
    @And("validate our bank details and order details")
    public void validate_our_bank_details_and_order_details() {
        CheckOutService.validateBankDetails();
        CheckOutService.validateOrderDetails();
    }
}
