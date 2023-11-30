package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.BaseConstants;
import lippia.web.constants.BasketConstants;
import lippia.web.constants.MenuConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.click;
import static lippia.web.services.ShopService.convertStringToDouble;

public class BasketService {

    public static void validatePriceBasket() {
        WebElement subTotalPrice = WebActionManager.getElement(BasketConstants.SUBTOTAL_PRICE);
        WebElement totalPrice = WebActionManager.getElement(BasketConstants.TOTAL_PRICE);

        Double subPrice = convertStringToDouble(subTotalPrice.getText());
        Double totPrice = convertStringToDouble(totalPrice.getText());

        if (subPrice<totPrice){
            System.out.println("El precio total es mayor al subtotal");
        }else{
            System.out.println("Hubo un error");
        }
    }

    public static void clickProceedToCheckOut()  {
        click(BasketConstants.PROCEED_TO_CHECK_OUT_BUTTON);
    }

}
