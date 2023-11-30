package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.click;

public class ShopService {

    static Double convertStringToDouble(String texto) {
        texto = texto.replace("₹", "");
        return Double.valueOf(texto);
    }
    public static void clickHomeMenuButton() {
        BaseService.clickJs(ShopConstants.HOME_MENU_BUTTON);
    }

    public static void addBookBasket() throws InterruptedException {
        BaseService.scrollIntoView(ShopConstants.ADD_BOOK_BASKET);
        BaseService.clickJs(ShopConstants.ADD_BOOK_BASKET);
    }
    public static void comparePriceBooks() throws InterruptedException {
        WebElement precioLibroRuby = WebActionManager.getElement(ShopConstants.BOOK_PRICE_RUBY);
        Double precioRuby = convertStringToDouble(precioLibroRuby.getText());
        Thread.sleep(1000);
        WebElement precioLibroBasket = WebActionManager.getElement(ShopConstants.BOOK_PRICE_BASKET );
        Double precioRubyBasket = convertStringToDouble(precioLibroBasket.getText());
        Assert.assertEquals(precioRuby, precioRubyBasket, "Los precios no coinciden");
    }

    public static void clickBasketShop() throws InterruptedException {
        Thread.sleep(500);
        BaseService.clickJs(ShopConstants.CLICK_BASKET_SHOP);
    }

    public static void compareAmountTax(){
        Double indiaTax = convertStringToDouble(BaseConstants.SUBTOTAL_INDIA_TAX.get());
        Double argTax = convertStringToDouble(BaseConstants.SUBTOTAL_ARGENTINA_TAX.get());
        double precioLibro = convertStringToDouble(BaseConstants.SUBTOTAL_BOOK.get());
        double dosPorciento = (precioLibro*0.02);
        double cincoPorciento = (precioLibro*0.05);
        if (indiaTax == dosPorciento && argTax == cincoPorciento) {
            System.out.println("Tax rate for indian should be 2% and for abroad it should be 5%");
        } else {
            System.out.println("No se cumple la condición");
        }
    }

}

