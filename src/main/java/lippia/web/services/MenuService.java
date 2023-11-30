package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.HomeConstants;
import lippia.web.constants.MenuConstants;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.crowdar.core.actions.WebActionManager.click;

public class MenuService {
    public static void clickShopMenu()  {
        click(MenuConstants.SHOP_MENU_BUTTON);
    }

}
