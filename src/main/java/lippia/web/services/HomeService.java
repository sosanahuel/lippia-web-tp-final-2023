package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import io.cucumber.java.en.Then;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.MenuConstants;
import lippia.web.constants.MyAccountConstants;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.click;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.services.ShopService.convertStringToDouble;

public class HomeService {

    public static void navegateWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickMyAccount(){
        WebActionManager.click(MenuConstants.MYACCOUNT_MENU_BUTTON);
    }

    public static void arrivalsHomePage(){
        List<WebElement> arrivalsCount = WebActionManager.getElements(HomeConstants.IMG_ARRIVAL);
        Assert.assertEquals(3, arrivalsCount.size());
    }

    public static void clickFirstArrival() {
        click(HomeConstants.FIRST_IMAGE_ARRIVAL);
    }

    public static void clickAddToBasket() throws InterruptedException {
        WebActionManager.waitVisibility(HomeConstants.ADD_TO_BASKET);
        BaseService.scrollIntoView(HomeConstants.ADD_TO_BASKET);
        BaseService.clickJs(HomeConstants.ADD_TO_BASKET);
    }

    public static void itemPrice() throws InterruptedException {

        WebElement precioArrival = WebActionManager.getElement(HomeConstants.PRICE_ARRIVAL);
        Double precioArrivals = convertStringToDouble(precioArrival.getText());
        Thread.sleep(1000);
        WebElement precioLibroTexto = WebActionManager.getElement(HomeConstants.PRICE_BASKET);
        Double precioLibro = convertStringToDouble(precioLibroTexto.getText());

        Assert.assertEquals(precioArrivals, precioLibro, "Los precios no coinciden");
    }

    public static void clickBasket(){
        click(HomeConstants.PRICE_BASKET);
    }

}


