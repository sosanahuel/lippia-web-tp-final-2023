package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import junit.framework.Assert;
import lippia.web.constants.BaseConstants;
import lippia.web.constants.CheckOutConstants;
import lippia.web.constants.ShopConstants;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

import static lippia.web.services.ShopService.convertStringToDouble;

public class CheckOutService extends WebActionManager {

    public static void billingTable() {
        Assert.assertTrue(isPresent(CheckOutConstants.BILLING_TABLE));
    }
    public static void paymentTable(){
        Assert.assertTrue(isPresent(CheckOutConstants.PAYMENT_TABLE));
    }
    public static void infoTable(){
        Assert.assertTrue(isPresent(CheckOutConstants.INFO_TABLE));
    }
    public static void orderTable(){
        Assert.assertTrue(isPresent(CheckOutConstants.ORDER_TABLE));
    }
    //INPUTS
    public static void enterFirstName(String name) {
        WebActionManager.setInput(CheckOutConstants.FIRST_NAME_INPUT, name);
    }
    public static void enterLastName(String latName) {
        WebActionManager.setInput(CheckOutConstants.LAST_NAME_INPUT, latName);
    }
    public static void companyName(String company) {
        WebActionManager.setInput(CheckOutConstants.COMPANY_NAME_INPUT, company);
    }
    public static void emailName(String email) {
        WebActionManager.setInput(CheckOutConstants.EMAIL_INPUT, email);
    }
    public static void phone(String phone) {
        WebActionManager.setInput(CheckOutConstants.PHONE_INPUT, phone);
    }
    public static void adress(String adress) {
        WebActionManager.setInput(CheckOutConstants.ADRESS_INPUT, adress);
    }
    public static void apartament(String apartment) {
        WebActionManager.setInput(CheckOutConstants.APARTAMENT_INPUT, apartment);
    }
    public static void town(String town) {
        WebActionManager.setInput(CheckOutConstants.TOWN_INPUT, town);
    }
    public static void postcode(String postCode) {
        WebActionManager.setInput(CheckOutConstants.POSTCODE_INPUT, postCode);
    }
    //DROPDOWN
    public static void selectCountry(String country) throws InterruptedException {
        Actions build = new Actions(DriverManager.getDriverInstance());
        WebElement states = WebActionManager.getElement(CheckOutConstants.DROPDOWN_COUNTRY_SELECT);
        WebElement statesInput = WebActionManager.getElement(CheckOutConstants.DROPDOWN_COUNTRY_INPUT);
        build.moveToElement(states).click().build().perform();
        Thread.sleep(1000);
        build.moveToElement(statesInput).click().build().perform();
        WebActionManager.setInput(CheckOutConstants.DROPDOWN_COUNTRY_INPUT,country);
        Thread.sleep(2000);
        WebElement selectState = WebActionManager.getElement(CheckOutConstants.DROPDOWN_COUNTRY_CLICK);
        selectState.click();
    }

    public static void selectState(String state) throws InterruptedException {
        Actions build = new Actions(DriverManager.getDriverInstance());
        BaseService.scrollIntoView(CheckOutConstants.SHOP_DETAILS);
        WebElement states = WebActionManager.getElement(CheckOutConstants.DROPDOWN_STATE_CLICK);
        build.moveToElement(states).click().build().perform();
        Thread.sleep(1000);
        WebActionManager.setInput(CheckOutConstants.DROPDOWN_STATE_INPUT,state);
        Thread.sleep(2000);
        WebElement selectState = WebActionManager.getElement(CheckOutConstants.DROPDOWN_COUNTRY_CLICK);
        selectState.click();
    }

    //CLICK PAYMENT METHOD
    public static void clickBankTransfer(String paymentMetod) throws InterruptedException {
        BaseService.scrollIntoView(CheckOutConstants.TRANSFER_CLICK);
        WebActionManager.click(CheckOutConstants.TRANSFER_CLICK);
    }
    //COUPON
    public static void linkCoupon() throws AWTException {
        BaseService.scrollUpRobot();
        Assert.assertTrue(isPresent(CheckOutConstants.LINK_COUPON));
        BaseService.clickJs(CheckOutConstants.LINK_COUPON);
    }
    public static void inputCoupon() {
        WebActionManager.waitVisibility(CheckOutConstants.INPUT_COUPON);
        Assert.assertTrue(isPresent(CheckOutConstants.INPUT_COUPON));
    }
    public static void buttonCoupon() {
        Assert.assertTrue(isPresent(CheckOutConstants.BUTTON_COUPON));
    }

    public static void savePriceTax(String country) {
        WebElement precioWithTax = WebActionManager.getElement(ShopConstants.TAX_AMOUNT);
        Double precio = convertStringToDouble(precioWithTax.getText());
        switch (country){
            case "India":
                BaseConstants.SUBTOTAL_INDIA_TAX.set(String.valueOf(precio));
                break;
            case "Argentina":
                BaseConstants.SUBTOTAL_ARGENTINA_TAX.set(String.valueOf(precio));
                break;
        }
    }

    public static void savePriceBook() {
        WebElement getAmountBook = WebActionManager.getElement(ShopConstants.BOOK_AMOUNT);
        BaseConstants.SUBTOTAL_BOOK.set(getAmountBook.getText());
    }

    public static void clickPlaceOrder() throws InterruptedException {
        BaseService.scrollIntoView(CheckOutConstants.PLACE_ORDER_BUTTON);
        BaseService.clickJs(CheckOutConstants.PLACE_ORDER_BUTTON);
    }

    public static void validateBankDetails() {
        WebActionManager.waitVisibility(CheckOutConstants.OUR_BAK_DETAILS);
        WebElement BankDetails = WebActionManager.getElement(CheckOutConstants.OUR_BAK_DETAILS);
        Assert.assertEquals("No se encontro"+ BankDetails.getText(),"Our Bank Details",BankDetails.getText() );
    }
    public static void validateOrderDetails() {
        Assert.assertTrue(isPresent(CheckOutConstants.ORDER_DETAILS));
    }


}
