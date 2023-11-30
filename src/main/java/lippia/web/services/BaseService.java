package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import lippia.web.constants.BasicConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BaseService{

    public static void clickJs(String locator){
        WebElement clickLocator = WebActionManager.getElement(locator);
        DriverManager.getDriverInstance().executeScript("arguments[0].click();",clickLocator );
    }

    public static void scrollIntoView(String locator) throws InterruptedException {
        WebElement scrollLocator = WebActionManager.getElement(locator);
        DriverManager.getDriverInstance().executeScript("arguments[0].scrollIntoView({block: 'center'});", scrollLocator);
        Thread.sleep(500);
    }
    public static void scrollUpRobot() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_HOME);
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }

}
